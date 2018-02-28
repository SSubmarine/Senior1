package com.mfu.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mfu.entity.BookSpa;
import com.mfu.service.BookSpaService;

@Controller
public class BookSpaController {
	@EJB(mappedName = "ejb:/SeniorWebHostel/BookSpaServiceBean!com.mfu.service.BookSpaService")
	BookSpaService bookSpaService;
	
	@RequestMapping("/saveBookSpa")
	public String save(@ModelAttribute("bookSpa") BookSpa bookSpa, BindingResult result, HttpServletRequest request){
		try {
			if (bookSpa.getBookSpaId() == 0){
				bookSpaService.insert(bookSpa);
			}else{
				bookSpaService.update(bookSpa);
			}
		}catch (Exception e){
		}return "redirect:listBookSpa.do";
	}
	
/*	@RequestMapping("/editBookSpa")
	public ModelAndView edit(HttpServletRequest request) {
		String bookSpaName = request.getParameter("name");
		BookSpa foundBookSpa;
		ModelAndView mv = new ModelAndView("Pages/production/AdminManageBookSpa.jsp");
		try {
			foundBookSpa = bookSpaService.findBookSpaName("");
			mv.addObject("foundBookSpa", foundBookSpa);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
	*/
	@RequestMapping("/deleteBookSpa")
	public String delete(HttpServletRequest request){
		bookSpaService.delete(Long.valueOf(request.getParameter("id")));
		return "redirect:listBookSpa.do";
	
	}
	
	@RequestMapping("/listBookSpa")
	public ModelAndView list(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("Pages/production/AdminManageBookSpa.jsp");
		
		List<BookSpa> bookSpaList;
		try {
			BookSpa bookSpa = new BookSpa();
			mv.addObject("bookSpa",bookSpa);
			bookSpaList = bookSpaService.getAllBookSpa();
			mv.addObject("bookSpaList", bookSpaList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
	

}
