package com.mfu.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.mfu.entity.Spa;
import com.mfu.service.SpaService;

@Controller
public class SpaController {
	private static final String UPLOAD_DIRECTORY = "/images";

	@EJB(mappedName = "ejb:/SeniorWebHostel/SpaServiceBean!com.mfu.service.SpaService")
	SpaService spaService;

	/*
	 * @RequestMapping("/editSpa") public ModelAndView edit(HttpServletRequest
	 * request) { int paramId = Integer.parseInt(request.getParameter("id")); Spa
	 * foundSpa; ModelAndView mv = new ModelAndView("AdminManageSpa.jsp"); try {
	 * foundSpa = spaService.findSpaId(paramId); mv.addObject("foundSpa", foundSpa);
	 * } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } return mv; }
	 */

	@RequestMapping("/deleteSpa")
	public String delete(HttpServletRequest request) {
		spaService.delete(Long.valueOf(request.getParameter("id")));
		return "redirect:listSpa.do";

	}

	@RequestMapping("/listSpa")
	public ModelAndView list(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("AdminManageSpa.jsp");
		List<Spa> spaList;
		try {
			Spa spa = new Spa();
			mv.addObject("spa", spa);
			spaList = spaService.getAllSpa();
			mv.addObject("spaList", spaList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}

	// Test upload spa photo
	@RequestMapping(value = "/saveSpa", method = RequestMethod.POST)
	public String save(@RequestParam("files") CommonsMultipartFile files, Spa spa, BindingResult result,
			HttpSession sessionr, HttpServletRequest request) {
		// CommonsMultipartFile files = new CommonsMultipartFile();
		// request.getParameter("files");
		try {
			if (spa.getSpaId() == 0) {
				ServletContext contextr = sessionr.getServletContext();
				String path = contextr.getRealPath(UPLOAD_DIRECTORY);
				String filename = files.getOriginalFilename();
				System.out.println(files);
				// String filename = files;
				if (!files.isEmpty()) {
					System.out.println("File is not empty");
					byte[] bytes = files.getBytes();
					BufferedOutputStream stream = new BufferedOutputStream(
							new FileOutputStream(new File(path + File.separator + filename)));
					stream.write(bytes);
					stream.flush();
					stream.close();
					spa.setSpaPic("images/" + filename);
					System.out.println("filename" + spa.getSpaPic());
					spaService.insert(spa);
					return "redirect:listSpa.do";
				} else {
					System.out.print("File is empty");
				}
			} else {
				spaService.update(spa);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:listSpa.do";
	}

	@RequestMapping("/editSpa")
	public ModelAndView edit(HttpServletRequest request) {
		int paramId = Integer.parseInt(request.getParameter("id"));
		Spa foundSpa;
		ModelAndView mv = new ModelAndView("AdminManageSpa.jsp");
		try {
			foundSpa = spaService.findSpaId(paramId);
			mv.addObject("spa", foundSpa);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}

	@RequestMapping("/updateSpa")
	public String updateSpa(@RequestParam CommonsMultipartFile files, @ModelAttribute("spa") Spa spa,
			BindingResult result, HttpSession sessionr, HttpServletRequest request) throws IOException {
		ServletContext contextr = sessionr.getServletContext();
		String path = contextr.getRealPath(UPLOAD_DIRECTORY);
		String filename = files.getOriginalFilename();
		System.out.println("filename" + spa.getSpaPic());
		if (files.isEmpty() == false) {
			System.out.print("File is not empty");
			byte[] bytes = files.getBytes();
			BufferedOutputStream stream = new BufferedOutputStream(
					new FileOutputStream(new File(path + File.separator + filename)));
			stream.write(bytes);
			stream.flush();
			stream.close();
			spa.setSpaPic("images/" + filename);
		}
		try {
			long spaId = Long.parseLong(request.getParameter("spaId"));
			String spaName = request.getParameter("spaName");
			String spaDetail = request.getParameter("spaDetail");

			Spa spa1 = spaService.findSpaId(spaId);
			spa1.setSpaName(spaName);
			spa1.setSpaDetail(spaDetail);
			spaService.update(spa1);

		} catch (Exception e) {

		}

		return "listSpa.do";

	}

	@RequestMapping("uploadspaform")
	public ModelAndView uploadForm() {
		ModelAndView mv = new ModelAndView("testSpaphoto.jsp");
		Spa spa = new Spa();
		spa.setSpaName("Spa name");
		mv.addObject("spa", spa);
		return mv;
	}

	@RequestMapping(value = "/savespaImage", method = RequestMethod.POST)
	public ModelAndView savespaimage(@RequestParam CommonsMultipartFile file, HttpSession session) throws Exception {

		ServletContext context = session.getServletContext();
		String path = context.getRealPath(UPLOAD_DIRECTORY);
		String filename = file.getOriginalFilename();

		System.out.println(path + " " + filename);

		byte[] bytes = file.getBytes();
		BufferedOutputStream stream = new BufferedOutputStream(
				new FileOutputStream(new File(path + File.separator + filename)));
		stream.write(bytes);
		stream.flush();
		stream.close();

		return new ModelAndView("testSpaphoto.jsp", "filesuccess", "Upload Success");
	}

	@RequestMapping(value = "/editSpaWithImage")
	public String savefile(@RequestParam CommonsMultipartFile file, @ModelAttribute("spa") Spa spa,
			BindingResult result, HttpSession session) throws IOException {
		ServletContext context = session.getServletContext();
		String path = context.getRealPath(UPLOAD_DIRECTORY);
		String filename = file.getOriginalFilename();
		System.out.println(path + " " + filename);

		System.out.println(spa.getSpaName());
		byte[] bytes = file.getBytes();
		BufferedOutputStream stream = new BufferedOutputStream(
				new FileOutputStream(new File(path + File.separator + filename)));
		stream.write(bytes);
		stream.flush();
		stream.close();

		return "images/" + filename;
	}

}
