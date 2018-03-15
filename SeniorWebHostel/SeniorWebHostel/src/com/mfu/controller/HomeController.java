package com.mfu.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mfu.entity.Information;
import com.mfu.entity.Promotion;
import com.mfu.entity.Rooms;
import com.mfu.service.InformationService;
import com.mfu.service.PromotionService;
import com.mfu.service.RoomService;

@Controller
public class HomeController {
	
	@EJB(mappedName = "ejb:/SeniorWebHostel/InformationServiceBean!com.mfu.service.InformationService")
	InformationService informationService;
	@EJB(mappedName = "ejb:/SeniorWebHostel/RoomServiceBean!com.mfu.service.RoomService")
	RoomService roomService;
	@EJB(mappedName = "ejb:/SeniorWebHostel/PromotionServiceBean!com.mfu.service.PromotionService")
	PromotionService promotionService;
	
	@RequestMapping("/home")
	public ModelAndView show(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("Home.jsp");

		List<Rooms> roomList;
		List<Promotion> promotionList;
		List<Information> informationList;


		try {
			Rooms room = new Rooms();
			mv.addObject("room", room);
			roomList = roomService.getAllRoom();
			mv.addObject("roomList", roomList);
			
			Information information = new Information();
			mv.addObject("information", information);
			informationList = informationService.getAllinformation();
			mv.addObject("informationList", informationList);
			
			Promotion promotion = new Promotion();
			mv.addObject("promotion", promotion);
			promotionList = promotionService.getAllPromotion();
			mv.addObject("promotionList", promotion);


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}

}
