package com.mfu.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mfu.entity.Reservation;
import com.mfu.service.ReservationService;

@Controller
public class ReservationController {
	@EJB(mappedName = "ejb:/SeniorWebHostel/ReservationServiceBean!com.mfu.service.ReservationService")
	ReservationService reservationService;
	
	@RequestMapping("/newReservation")
	public ModelAndView newReservation(){
		ModelAndView mv = new ModelAndView("AdminManageReservation.jsp");
		Reservation reservation = new Reservation();
		mv.addObject("reservation",reservation);
		return mv;
	}
	
	
	@RequestMapping("/saveReservation")
	public String save(@ModelAttribute("reservation") Reservation reservation, BindingResult result, HttpServletRequest request){
		try {
			if (reservation.getReservationId() == 0){
				reservationService.insert(reservation);
			}else{
				reservationService.update(reservation);
			}
		}catch (Exception e){
		}return "redirect:listReservation.do";
	}
		
	@RequestMapping("/deleteReservation")
	public String delete(HttpServletRequest request){
		reservationService.delete(Long.valueOf(request.getParameter("id")));
		return "redirect:listReservation.do";
	
	}
	
	@RequestMapping("/listReservation")
	public ModelAndView list(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("AdminManageReservation.jsp");
		List<Reservation> reservationList;
		try {
			Reservation reservation = new Reservation();
			mv.addObject("reservation",reservation);
			reservationList = reservationService.getAllReservation();
			mv.addObject("reservationList", reservationList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}

}
