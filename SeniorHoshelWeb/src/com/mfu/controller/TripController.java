package com.mfu.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mfu.entity.Trip;
import com.mfu.service.TripService;

@Controller
public class TripController {
	@EJB(mappedName = "ejb:/SeniorWebHostel/TripServiceBean!com.mfu.service.TripService")
	TripService tripService;
	
	@RequestMapping("/saveTrip")
	public String save(@ModelAttribute("trip") Trip trip, BindingResult result, HttpServletRequest request){
		try {
			if (trip.getTripId() == 0){
				tripService.insert(trip);
			}else{
				tripService.update(trip);
			}
		}catch (Exception e){
		}return "redirect:listTrip.do";
	}
	
@RequestMapping("/editTrip")
	public ModelAndView edit(HttpServletRequest request) {
	int paramId = Integer.parseInt(request.getParameter("id"));
		Trip foundTrip;
		ModelAndView mv = new ModelAndView("Pages/production/AdminManageTrip.jsp");
		try {
			foundTrip = tripService.findTripId(paramId);
			mv.addObject("foundTrip", foundTrip);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
	
	@RequestMapping("/deleteTrip")
	public String delete(HttpServletRequest request){
		tripService.delete(Long.valueOf(request.getParameter("id")));
		return "redirect:listTrip.do";
	
	}
	
	@RequestMapping("/listTrip")
	public ModelAndView list(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("Pages/production/AdminManageTrip.jsp");
		List<Trip> tripList;
		try {
			Trip trip = new Trip();
			mv.addObject("trip",trip);
			tripList = tripService.getAllTrip();
			mv.addObject("tripList", tripList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
	

}
