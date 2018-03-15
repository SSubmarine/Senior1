package com.mfu.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.mfu.entity.Information;
import com.mfu.entity.Rooms;
import com.mfu.service.InformationService;

@Controller
public class InformationController {
	

	private static final String UPLOAD_DIRECTORY = "/images";
	@EJB(mappedName = "ejb:/SeniorWebHostel/InformationServiceBean!com.mfu.service.InformationService")
	InformationService informationService;

	@RequestMapping("/deleteInformation")
	public String delete(HttpServletRequest request) {
		informationService.delete(Long.valueOf(request.getParameter("id")));
		return "redirect:listInformation.do";

	}

	@RequestMapping("/listInformation")
	public ModelAndView list(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("AdminManageInformation.jsp");
		List<Information> informationList;
		try {
			Information information = new Information();
			mv.addObject("information", information);
			informationList = informationService.getAllinformation();
			mv.addObject("informationList", informationList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}

	// Test upload information photo
	@RequestMapping(value = "/saveInformation", method = RequestMethod.POST)
	public String save(@RequestParam("files") CommonsMultipartFile files, Information information, BindingResult result,
			HttpSession sessionr, HttpServletRequest request) {
		// CommonsMultipartFile files = new CommonsMultipartFile();
		// request.getParameter("files");
		try {
			if (information.getInformationId() == 0) {
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
					information.setHostelPic("images/" + filename);
					System.out.println("filename" + information.getHostelPic());
					informationService.insert(information);
					return "redirect:listInformation.do";
				} else {
					System.out.print("File is empty");
				}
			} else {
				informationService.update(information);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:listInformation.do";
	}

	@RequestMapping("/editInformation")
	public ModelAndView edit(HttpServletRequest request) {
		int paramId = Integer.parseInt(request.getParameter("id"));
		Information foundInformation;
		ModelAndView mv = new ModelAndView("AdminManageInformation.jsp");
		try {
			foundInformation = informationService.findInformationById(paramId);
			mv.addObject("information", foundInformation);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}

	@RequestMapping("/updateInformation")
	public String updateInformation(@RequestParam CommonsMultipartFile files, @ModelAttribute("information") Information information,
			BindingResult result, HttpSession sessionr, HttpServletRequest request) throws IOException {
		ServletContext contextr = sessionr.getServletContext();
		String path = contextr.getRealPath(UPLOAD_DIRECTORY);
		String filename = files.getOriginalFilename();
		System.out.println("filename" + information.getHostelPic());
		if (files.isEmpty() == false) {
			System.out.print("File is not empty");
			byte[] bytes = files.getBytes();
			BufferedOutputStream stream = new BufferedOutputStream(
					new FileOutputStream(new File(path + File.separator + filename)));
			stream.write(bytes);
			stream.flush();
			stream.close();
			information.setHostelPic("images/" + filename);
		}
		try {
			long informationId = Long.parseLong(request.getParameter("informationId"));
			String hostelAddress = request.getParameter("hostelAddress");
			String hostelPhone = request.getParameter("hostelPhone");
			String hostelEmail = request.getParameter("hostelEmail");
			String hostelWebside = request.getParameter("hostelWebside");

			Information information1 = informationService.findInformationById(informationId);
			information1.setHostelAddress(hostelAddress);
			information1.setHostelPhone(hostelPhone);
			information1.setHostelEmail(hostelEmail);
			information1.setHostelWebside(hostelWebside);
			
			informationService.update(information1);

		} catch (Exception e) {

		}

		return "listInformation.do";

	}

	@RequestMapping("uploadinformationform")
	public ModelAndView uploadForm() {
		ModelAndView mv = new ModelAndView("testInformationphoto.jsp");
		Information information = new Information();
		information.setHostelAddress("Hostel Address");
		mv.addObject("information", information);
		return mv;
	}

	@RequestMapping(value = "/saveinformationImage", method = RequestMethod.POST)
	public ModelAndView saveinformationimage(@RequestParam CommonsMultipartFile file, HttpSession session) throws Exception {

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

		return new ModelAndView("testInformationphoto.jsp", "filesuccess", "Upload Success");
	}

	@RequestMapping(value = "/editInformationWithImage")
	public String savefile(@RequestParam CommonsMultipartFile file, @ModelAttribute("information") Information information,
			BindingResult result, HttpSession session) throws IOException {
		ServletContext context = session.getServletContext();
		String path = context.getRealPath(UPLOAD_DIRECTORY);
		String filename = file.getOriginalFilename();
		System.out.println(path + " " + filename);

		System.out.println(information.getHostelAddress());
		byte[] bytes = file.getBytes();
		BufferedOutputStream stream = new BufferedOutputStream(
				new FileOutputStream(new File(path + File.separator + filename)));
		stream.write(bytes);
		stream.flush();
		stream.close();

		return "images/" + filename;
	}
	
	

}
