package com.mfu.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mfu.entity.OrderProduct;
import com.mfu.service.OrderProductService;

@Controller
public class OrderProductController {
	@EJB(mappedName = "ejb:/SeniorWebHostel/OrderProductServiceBean!com.mfu.service.OrderProductService")
	OrderProductService orderProductService;
	
	@RequestMapping("/saveOrderProduct")
	public String save(@ModelAttribute("orderProduct") OrderProduct orderProduct, BindingResult result, HttpServletRequest request){
		try {
			if (orderProduct.getOrderProductId() == 0){
				orderProductService.insert(orderProduct);
			}else{
				orderProductService.update(orderProduct);
			}
		}catch (Exception e){
		}return "redirect:listOrderProduct.do";
	}
	
	@RequestMapping("/deleteOrderProduct")
	public String delete(HttpServletRequest request){
		orderProductService.delete(Long.valueOf(request.getParameter("id")));
		return "redirect:listOrderProduct.do";
	
	}
	
	@RequestMapping("/listOrderProduct")
	public ModelAndView list(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("Pages/production/AdminManageOrderProduct.jsp");
		
		List<OrderProduct> orderProductList;
		try {
			OrderProduct orderProduct = new OrderProduct();
			mv.addObject("orderProduct",orderProduct);
			orderProductList = orderProductService.getAllOrderProduct();
			mv.addObject("orderProductList", orderProductList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
	// test update orderProduct
	@RequestMapping("/editOrderProduct")
	public ModelAndView edit(HttpServletRequest request) {
		int orderProductId = Integer.parseInt(request.getParameter("id"));
		OrderProduct foundOrderProduct;
		ModelAndView mv = new ModelAndView("pagesAdmin/Pages/addorderProduct.jsp");
		try {
			foundOrderProduct = orderProductService.findOrderProductById(orderProductId);
			mv.addObject("orderProduct", foundOrderProduct);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
	
	@RequestMapping("/newOrderProduct")
	public ModelAndView newOrderProduct(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("Pages/production/Bookingjsp");
		
		List<OrderProduct> orderProductList;
		try {
			OrderProduct orderProduct = new OrderProduct();
			mv.addObject("orderProduct",orderProduct);
			orderProductList = orderProductService.getAllOrderProduct();
			mv.addObject("orderProductList", orderProductList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
	
	@RequestMapping("/saveNewOrderProduct")
	public String saveNewOrderProduct(@ModelAttribute("orderProduct") OrderProduct orderProduct, BindingResult result, HttpServletRequest request){
		try {
			if (orderProduct.getOrderProductId() == 0){
				orderProductService.insert(orderProduct);
			}else{
				orderProductService.update(orderProduct);
			}
		}catch (Exception e){
		}return "redirect:newOrderProduct.do";
	}
	

}
