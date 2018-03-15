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
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.mfu.entity.Promotion;
import com.mfu.service.PromotionService;

@Controller
public class PromotionController {
	private static final String UPLOAD_DIRECTORY = "/images";

	@EJB(mappedName = "ejb:/SeniorWebHostel/PromotionServiceBean!com.mfu.service.PromotionService")
	PromotionService promotionService;
	
/*	@RequestMapping("/savePromotion")
	public String save(@ModelAttribute("promotion") Promotion promotion, BindingResult result, HttpServletRequest request){
		try {
			if (promotion.getPromotionId() == 0){
				promotionService.insert(promotion);
			}else{
				promotionService.update(promotion);
			}
		}catch (Exception e){
		}return "redirect:listPromotion.do";
	}*/
	
@RequestMapping("/editPromotion")
	public ModelAndView edit(HttpServletRequest request) {
	int paramId = Integer.parseInt(request.getParameter("id"));
		Promotion foundPromotion;
		ModelAndView mv = new ModelAndView("AdminManagePromotion.jsp");
		try {
			foundPromotion = promotionService.findPromotionId(paramId);
			mv.addObject("foundPromotion", foundPromotion);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
	
	@RequestMapping("/deletePromotion")
	public String delete(HttpServletRequest request){
		promotionService.delete(Long.valueOf(request.getParameter("id")));
		return "redirect:listPromotion.do";
	
	}
	
	@RequestMapping("/listPromotion")
	public ModelAndView list(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("AdminManagePromotion.jsp");
		List<Promotion> promotionList;
		try {
			Promotion promotion = new Promotion();
			mv.addObject("promotion",promotion);
			promotionList = promotionService.getAllPromotion();
			mv.addObject("promotionList", promotionList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
	
	// Test upload promotion photo
		@RequestMapping(value = "/savePromotion", method = RequestMethod.POST)
		public String save(@RequestParam("files") CommonsMultipartFile files, Promotion promotion, BindingResult result,
				HttpSession sessionr, HttpServletRequest request) {
			// CommonsMultipartFile files = new CommonsMultipartFile();
			// request.getParameter("files");
			try {
				if (promotion.getPromotionId() == 0) {
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
						promotion.setPromotionPic("images/" + filename);
						System.out.println("filename" + promotion.getPromotionPic());
						promotionService.insert(promotion);
						return "redirect:listPromotion.do";
					} else {
						System.out.print("File is empty");
					}
				} else {
					promotionService.update(promotion);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			return "redirect:listPromotion.do";
		}

		@RequestMapping("/editPromotion")
		public ModelAndView editPromotion(HttpServletRequest request) {
			int paramId = Integer.parseInt(request.getParameter("id"));
			Promotion foundPromotion;
			ModelAndView mv = new ModelAndView("AdminManagePromotion.jsp");
			try {
				foundPromotion = promotionService.findPromotionId(paramId);
				mv.addObject("promotion", foundPromotion);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return mv;
		}

		@RequestMapping("/updatePromotion")
		public String updatePromotion(@RequestParam CommonsMultipartFile files, @ModelAttribute("promotion") Promotion promotion,
				BindingResult result, HttpSession sessionr, HttpServletRequest request) throws IOException {
			ServletContext contextr = sessionr.getServletContext();
			String path = contextr.getRealPath(UPLOAD_DIRECTORY);
			String filename = files.getOriginalFilename();
			System.out.println("filename" + promotion.getPromotionPic());
			if (files.isEmpty() == false) {
				System.out.print("File is not empty");
				byte[] bytes = files.getBytes();
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(new File(path + File.separator + filename)));
				stream.write(bytes);
				stream.flush();
				stream.close();
				promotion.setPromotionPic("images/" + filename);
			}
			try {
				long promotionId = Long.parseLong(request.getParameter("promotionId"));
			

				Promotion promotion1 = promotionService.findPromotionId(promotionId);
				

			} catch (Exception e) {

			}

			return "listPromotion.do";

		}

		@RequestMapping("uploadpromotionform")
		public ModelAndView uploadForm() {
			ModelAndView mv = new ModelAndView("testPromotionphoto.jsp");
			Promotion promotion = new Promotion();
			promotion.setPromotionCode("Promotion code");
			mv.addObject("promotion", promotion);
			return mv;
		}

		@RequestMapping(value = "/savepromotionImage", method = RequestMethod.POST)
		public ModelAndView savepromotionimage(@RequestParam CommonsMultipartFile file, HttpSession session) throws Exception {

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

			return new ModelAndView("testPromotionphoto.jsp", "filesuccess", "Upload Success");
		}

		@RequestMapping(value = "/editPromotionWithImage")
		public String savefile(@RequestParam CommonsMultipartFile file, @ModelAttribute("promotion") Promotion promotion,
				BindingResult result, HttpSession session) throws IOException {
			ServletContext context = session.getServletContext();
			String path = context.getRealPath(UPLOAD_DIRECTORY);
			String filename = file.getOriginalFilename();
			System.out.println(path + " " + filename);

			System.out.println(promotion.getPromotionCode());
			byte[] bytes = file.getBytes();
			BufferedOutputStream stream = new BufferedOutputStream(
					new FileOutputStream(new File(path + File.separator + filename)));
			stream.write(bytes);
			stream.flush();
			stream.close();

			return "images/" + filename;
		}


}
