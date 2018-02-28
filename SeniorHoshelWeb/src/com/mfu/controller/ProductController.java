package com.mfu.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mfu.entity.Product;
import com.mfu.service.ProductService;

@Controller
public class ProductController {
	@EJB(mappedName = "ejb:/SeniorWebHostel/ProductServiceBean!com.mfu.service.ProductService")
	ProductService productService;
	
	@RequestMapping("/newProduct")
	public ModelAndView newProduct(){
		ModelAndView mv = new ModelAndView("AdminManageProduct.jsp");
		Product product = new Product();
		mv.addObject("product",product);
		return mv;
	}
	
	
	@RequestMapping("/saveProduct")
	public String save(@ModelAttribute("product") Product product, BindingResult result, HttpServletRequest request){
		try {
			if (product.getProductId() == 0){
				productService.insert(product);
			}else{
				productService.update(product);
			}
		}catch (Exception e){
		}return "redirect:listProduct.do";
	}
	
	@RequestMapping("/editProduct")
	public ModelAndView edit(HttpServletRequest request) {
		int paramId = Integer.parseInt(request.getParameter("id"));
		Product foundProduct;
		ModelAndView mv = new ModelAndView("AdminManageProduct.jsp");
		try {
			foundProduct = productService.findProductById(paramId);
			mv.addObject("foundproduct", foundProduct);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}

	
	@RequestMapping("/deleteProduct")
	public String delete(HttpServletRequest request){
		productService.delete(Long.valueOf(request.getParameter("id")));
		return "redirect:listProduct.do";
	
	}
	
	@RequestMapping("/listProduct")
	public ModelAndView list(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("AdminManageProduct.jsp");
		List<Product> productList;
		try {
			Product product = new Product();
			mv.addObject("product",product);
			productList = productService.getAllProduct();
			mv.addObject("productList", productList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
	

}
