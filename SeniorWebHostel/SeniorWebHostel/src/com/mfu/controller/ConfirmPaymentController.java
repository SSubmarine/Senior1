package com.mfu.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mfu.entity.Bill;
import com.mfu.service.BillService;

@Controller
public class ConfirmPaymentController {
	@EJB(mappedName = "ejb:/SeniorWebHostel/BillServiceBean!com.mfu.service.BillService")
	BillService billService;
	
	@RequestMapping("/saveBill")
	public String save(@ModelAttribute("bill") Bill bill, BindingResult result, HttpServletRequest request) {
		try {
			if (bill.getBillId() == 0) {
				billService.insert(bill);
			} else {
				billService.update(bill);
			}
		} catch (Exception e) {
		}
		return "redirect:listBill.do";
	}
	
	
	
	@RequestMapping("/deleteBill")
	public String delete(HttpServletRequest request){
		billService.delete(Long.valueOf(request.getParameter("id")));
		return "redirect:listBill.do";
	
	}
	
	@RequestMapping("/listBill")
	public ModelAndView list(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("AdminConfirmPayment.jsp");
		
		List<Bill> billList;
		try {
			Bill bill = new Bill();
			mv.addObject("bill",bill);
			billList = billService.getAllbill();
			mv.addObject("billList", billList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}


}
