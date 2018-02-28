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

import com.mfu.entity.Guest;
import com.mfu.service.GuestService;

@Controller
public class GuestController {
	@EJB(mappedName = "ejb:/SeniorWebHostel/GuestServiceBean!com.mfu.service.GuestService")
	GuestService guestService;
	
	@RequestMapping("/saveGuest")
	public String save(@ModelAttribute("guest") Guest guest, BindingResult result, HttpServletRequest request){
		try {
			if (guest.getGuestId() == 0){
				guestService.insert(guest);
			}else{
				guestService.update(guest);
			}
		}catch (Exception e){
		}return "redirect:listGuest.do";
	}
	
	@RequestMapping("/deleteGuest")
	public String delete(HttpServletRequest request){
		guestService.delete(Long.valueOf(request.getParameter("id")));
		return "redirect:listGuest.do";
	
	}
	
	@RequestMapping("/listGuest")
	public ModelAndView list(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("AdminManageGuest.jsp");
		
		List<Guest> guestList;
		try {
			Guest guest = new Guest();
			mv.addObject("guest",guest);
			guestList = guestService.getAllGuest();
			mv.addObject("guestList", guestList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
	// test update guest
	@RequestMapping("/editGuest")
	public ModelAndView edit(HttpServletRequest request) {
		int guestId = Integer.parseInt(request.getParameter("id"));
		Guest foundGuest;
		ModelAndView mv = new ModelAndView("AdminManageGuest.jsp");
		try {
			foundGuest = guestService.findGuestId(guestId);
			mv.addObject("guest", foundGuest);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
	
	@RequestMapping("/newGuest")
	public ModelAndView newGuest(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("Booking.jsp");
		
		List<Guest> guestList;
		try {
			Guest guest = new Guest();
			mv.addObject("guest",guest);
			guestList = guestService.getAllGuest();
			mv.addObject("guestList", guestList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
	
	@RequestMapping("/saveNewGuest")
	public String saveNewGuest(@ModelAttribute("guest") Guest guest, BindingResult result, HttpServletRequest request){
		try {
			if (guest.getGuestId() == 0){
				guestService.insert(guest);
			}else{
				guestService.update(guest);
			}
		}catch (Exception e){
		}return "redirect:newGuest.do";
	}
	
	

	

}



