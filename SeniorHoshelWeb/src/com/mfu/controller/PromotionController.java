package com.mfu.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mfu.entity.Promotion;
import com.mfu.service.PromotionService;

@Controller
public class PromotionController {
	@EJB(mappedName = "ejb:/SeniorWebHostel/PromotionServiceBean!com.mfu.service.PromotionService")
	PromotionService promotionService;
	
	@RequestMapping("/newPromotion")
	public ModelAndView newPromotion(){
		ModelAndView mv = new ModelAndView("AdminManagePromotion.jsp");
		Promotion promotion = new Promotion();
		mv.addObject("promotion",promotion);
		return mv;
	}
	
	
	@RequestMapping("/savePromotion")
	public String save(@ModelAttribute("promotion") Promotion promotion, BindingResult result, HttpServletRequest request){
		try {
			if (promotion.getPromotionId() == 0){
				promotionService.insert(promotion);
			}else{
				promotionService.update(promotion);
			}
		}catch (Exception e){
		}return "redirect:listPromotion.do";
	}
	
	@RequestMapping("/editPromotion")
	public ModelAndView edit(HttpServletRequest request) {
		String paramId = (request.getParameter("id"));
		List<Promotion> foundPromotion;
		ModelAndView mv = new ModelAndView("AdminManagePromotion.jsp");
		try {
			foundPromotion = promotionService.findPromotionByPromoCode("");
			mv.addObject("foundpromotion", foundPromotion);
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
}
