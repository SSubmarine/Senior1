package com.mfu.controller;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mfu.entity.Bill;
import com.mfu.entity.BookRoom;
import com.mfu.service.BillService;
import com.mfu.service.BookRoomService;

@Controller
public class ConfirmPaymentController {
	@EJB(mappedName = "ejb:/SeniorWebHostel/BillServiceBean!com.mfu.service.BillService")
	BillService billRoomService;
	
	@RequestMapping("/saveBill")
	public String save(@ModelAttribute("bill") Bill bill, BindingResult result, HttpServletRequest request) {
		try {
			if (bill.getBillId() == 0) {
				billRoomService.insert(bill);
			} else {
				billRoomService.update(bill);
			}
		} catch (Exception e) {
		}
		return "redirect:listBill.do";
	}

}
