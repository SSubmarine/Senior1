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

import com.mfu.entity.Product;
import com.mfu.service.ProductService;

@Controller
public class ProductController {
	private static final String UPLOAD_DIRECTORY = "/images";
	
	@EJB(mappedName = "ejb:/SeniorWebHostel/ProductServiceBean!com.mfu.service.ProductService")
	ProductService productService;
	
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
	
	// Test upload product photo
			@RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
			public String save(@RequestParam("files") CommonsMultipartFile files, Product product, BindingResult result,
					HttpSession sessionr, HttpServletRequest request) {
				// CommonsMultipartFile files = new CommonsMultipartFile();
				// request.getParameter("files");
				try {
					if (product.getProductId() == 0) {
						ServletContext contextr = sessionr.getServletContext();
						String path = contextr.getRealPath(UPLOAD_DIRECTORY);
						String filename = files.getOriginalFilename();
						System.out.println(files);
						// String filename = files;
						if (!files.isEmpty()) {
							System.out.println("File is not empty");
							byte[] bytes = files.getBytes();
							BufferedOutputStream stream = new BufferedOutputStream(
									new FileOutputStream(new File(path + File.separator + filename)));
							stream.write(bytes);
							stream.flush();
							stream.close();
							product.setProductPic("images/" + filename);
							System.out.println("filename" + product.getProductPic());
							productService.insert(product);
							return "redirect:listProduct.do";
						} else {
							System.out.print("File is empty");
						}
					} else {
						productService.update(product);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

				return "redirect:listProduct.do";
			}

			@RequestMapping("/editProduct")
			public ModelAndView editProduct(HttpServletRequest request) {
				int paramId = Integer.parseInt(request.getParameter("id"));
				Product foundProduct;
				ModelAndView mv = new ModelAndView("AdminManageProduct.jsp");
				try {
					foundProduct = productService.findProductById(paramId);
					mv.addObject("product", foundProduct);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return mv;
			}

			@RequestMapping("/updateProduct")
			public String updateProduct(@RequestParam CommonsMultipartFile files, @ModelAttribute("product") Product product,
					BindingResult result, HttpSession sessionr, HttpServletRequest request) throws IOException {
				ServletContext contextr = sessionr.getServletContext();
				String path = contextr.getRealPath(UPLOAD_DIRECTORY);
				String filename = files.getOriginalFilename();
				System.out.println("filename" + product.getProductPic());
				if (files.isEmpty() == false) {
					System.out.print("File is not empty");
					byte[] bytes = files.getBytes();
					BufferedOutputStream stream = new BufferedOutputStream(
							new FileOutputStream(new File(path + File.separator + filename)));
					stream.write(bytes);
					stream.flush();
					stream.close();
					product.setProductPic("images/" + filename);
				}
				try {
					long productId = Long.parseLong(request.getParameter("productId"));
					String productName = request.getParameter("productName");
					String productDetail = request.getParameter("productDetail");

					Product product1 = productService.findProductById(productId);
					product1.setProductName(productName);
					product1.setProductDetail(productDetail);
					productService.update(product1);

				} catch (Exception e) {

				}

				return "listProduct.do";

			}

			@RequestMapping("uploadproductform")
			public ModelAndView uploadForm() {
				ModelAndView mv = new ModelAndView("testProductphoto.jsp");
				Product product = new Product();
				product.setProductName("Product name");
				mv.addObject("product", product);
				return mv;
			}

			@RequestMapping(value = "/saveproductImage", method = RequestMethod.POST)
			public ModelAndView saveproductimage(@RequestParam CommonsMultipartFile file, HttpSession session) throws Exception {

				ServletContext context = session.getServletContext();
				String path = context.getRealPath(UPLOAD_DIRECTORY);
				String filename = file.getOriginalFilename();

				System.out.println(path + " " + filename);

				byte[] bytes = file.getBytes();
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(new File(path + File.separator + filename)));
				stream.write(bytes);
				stream.flush();
				stream.close();

				return new ModelAndView("testProductphoto.jsp", "filesuccess", "Upload Success");
			}

			@RequestMapping(value = "/editProductWithImage")
			public String savefile(@RequestParam CommonsMultipartFile file, @ModelAttribute("product") Product product,
					BindingResult result, HttpSession session) throws IOException {
				ServletContext context = session.getServletContext();
				String path = context.getRealPath(UPLOAD_DIRECTORY);
				String filename = file.getOriginalFilename();
				System.out.println(path + " " + filename);

				System.out.println(product.getProductName());
				byte[] bytes = file.getBytes();
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(new File(path + File.separator + filename)));
				stream.write(bytes);
				stream.flush();
				stream.close();

				return "images/" + filename;
			}
	

}
