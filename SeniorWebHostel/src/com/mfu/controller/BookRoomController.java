package com.mfu.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mfu.entity.BookRoom;
import com.mfu.entity.Product;
import com.mfu.entity.Rooms;
import com.mfu.entity.Spa;
import com.mfu.entity.Trip;
import com.mfu.service.BookRoomService;
import com.mfu.service.OrderProductService;
import com.mfu.service.ProductService;
import com.mfu.service.RoomService;
import com.mfu.service.SpaService;
import com.mfu.service.TripService;


@Controller
public class BookRoomController {
	@EJB(mappedName = "ejb:/SeniorWebHostel/BookRoomServiceBean!com.mfu.service.BookRoomService")
	BookRoomService bookRoomService;
	
	@EJB(mappedName = "ejb:/SeniorWebHostel/RoomServiceBean!com.mfu.service.RoomService")
	RoomService roomService;
	
	@EJB(mappedName = "ejb:/SeniorWebHostel/ProductServiceBean!com.mfu.service.ProductService")
	ProductService productService;
	
	@EJB(mappedName = "ejb:/SeniorWebHostel/OrderProductServiceBean!com.mfu.service.OrderProductService")
	OrderProductService orderProductService;
	
	@EJB(mappedName = "ejb:/SeniorWebHostel/SpaServiceBean!com.mfu.service.SpaService")
	SpaService spaService;
	
	@EJB(mappedName = "ejb:/SeniorWebHostel/TripServiceBean!com.mfu.service.TripService")
	TripService tripService;

	@RequestMapping("/saveBookRoomAdmin")
	public String save(@ModelAttribute("bookRoom") BookRoom bookRoom, BindingResult result, HttpServletRequest request) {
		try {
			if (bookRoom.getBookRoomId() == 0) {
				bookRoomService.insert(bookRoom);
			} else {
				bookRoomService.update(bookRoom);
			}
		} catch (Exception e) {
		}
		return "redirect:listBookRoom.do";
	}


	@RequestMapping("/deleteBookRoom")
	public String delete(HttpServletRequest request) {
		bookRoomService.delete(Long.valueOf(request.getParameter("id")));
		return "redirect:listBookRoom.do";

	}

	@RequestMapping("/listBookRoom")
	public ModelAndView list(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("AdminManageBookRoom.jsp");

		List<BookRoom> bookRoomList;
		try {
			BookRoom bookRoom = new BookRoom();
			mv.addObject("bookRoom", bookRoom);
			bookRoomList = bookRoomService.getAllbookRoom();
			mv.addObject("bookRoomList", bookRoomList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
	
	

	@RequestMapping("/saveBookRoom")
	public String saveBookRoom(@ModelAttribute("bookRoom") BookRoom bookRoom, BindingResult result, HttpServletRequest request) {
		String roomType = request.getParameter("typeName");
		Rooms room;

		try {
			room = (Rooms) roomService.findRoomByRoomType(roomType);
			bookRoom.setRooms(room);
			if (bookRoom.getBookRoomId() == 0) {
				bookRoomService.insert(bookRoom);
			} else {
				bookRoomService.update(bookRoom);
			}
		} catch (Exception e) {
		}
		return "redirect:showBookRoom.do";
	}
	
	@RequestMapping("/booking")
	public ModelAndView show(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("Booking.jsp");
		List<Rooms> roomList;
		List<BookRoom> bookRoomList;
		List<Product> productList;
		List<Spa> spaList;
		List<Trip> tripList;
		
		try {
			productList =productService.getAllProduct();
			mv.addObject("productList",productList);
			
			roomList = roomService.getAllRoom();
			mv.addObject("roomList", roomList);
			
			BookRoom bookRoom = new BookRoom();
			mv.addObject("bookRoom", bookRoom);
			
			bookRoomList = bookRoomService.getAllbookRoom();
			mv.addObject("bookRoomList", bookRoomList);
			
			spaList =spaService.getAllSpa();
			mv.addObject("spaList",spaList);
			
			tripList =tripService.getAllTrip();
			mv.addObject("tripList",tripList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}

}
