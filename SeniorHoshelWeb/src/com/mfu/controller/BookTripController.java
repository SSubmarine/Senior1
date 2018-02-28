package com.mfu.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mfu.entity.BookTrip;
import com.mfu.service.BookTripService;


@Controller
public class BookTripController {
	@EJB(mappedName = "ejb:/SeniorWebHostel/BookTripServiceBean!com.mfu.service.BookTripService")
	BookTripService bookTripService;
	
	@RequestMapping("/newBookTrip")
	public ModelAndView newBookTrip(){
		ModelAndView mv = new ModelAndView("Pages/production/AdminManageBookTrip.jsp");
		BookTrip bookTrip = new BookTrip();
		mv.addObject("bookTrip",bookTrip);
		return mv;
	}
	
	
	@RequestMapping("/saveBookTrip")
	public String save(@ModelAttribute("bookTrip") BookTrip bookTrip, BindingResult result, HttpServletRequest request){
		try {
			if (bookTrip.getBookTripId() == 0){
				bookTripService.insert(bookTrip);
			}else{
				bookTripService.update(bookTrip);
			}
		}catch (Exception e){
		}return "redirect:listBookTrip.do";
	}
	
	@RequestMapping("/editBookTrip")
	public ModelAndView edit(HttpServletRequest request) {
		String paramId = (request.getParameter("id"));
		BookTrip foundBookTrip;
		ModelAndView mv = new ModelAndView("Pages/production/AdminManageBookTrip.jsp");
		try {
			foundBookTrip = bookTripService.findBookTripByPromocode("");
			mv.addObject("foundbookTrip", foundBookTrip);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}

	
	@RequestMapping("/deleteBookTrip")
	public String delete(HttpServletRequest request){
		bookTripService.delete(Long.valueOf(request.getParameter("id")));
		return "redirect:listBookTrip.do";
	
	}
	
	@RequestMapping("/listBookTrip")
	public ModelAndView list(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("Pages/production/AdminManageBookTrip.jsp");
		List<BookTrip> bookTripList;
		try {
			BookTrip bookTrip = new BookTrip();
			mv.addObject("bookTrip",bookTrip);
			bookTripList = bookTripService.getAllBookTrip();
			mv.addObject("bookTripList", bookTripList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
}
