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
import com.mfu.entity.Guest;
import com.mfu.entity.Product;
import com.mfu.entity.Rooms;
import com.mfu.entity.Spa;
import com.mfu.entity.Trip;
import com.mfu.service.BookRoomService;
import com.mfu.service.BookSpaService;
import com.mfu.service.BookTripService;
import com.mfu.service.OrderProductService;
import com.mfu.service.ProductService;
import com.mfu.service.RoomService;
import com.mfu.service.SpaService;
import com.mfu.service.TripService;
import com.mfu.service.GuestService;


@Controller
public class BookingController {
	@EJB(mappedName = "ejb:/SeniorWebHostel/BookRoomServiceBean!com.mfu.service.BookRoomService")
	BookRoomService bookRoomService;
	
	@EJB(mappedName = "ejb:/SeniorWebHostel/BookSpaServiceBean!com.mfu.service.BookSpaService")
	BookSpaService bookSpaService;
	
	@EJB(mappedName = "ejb:/SeniorWebHostel/BookTripServiceBean!com.mfu.service.BookTripService")
	BookTripService bookTripService;
	
	@EJB(mappedName = "ejb:/SeniorWebHostel/OrderProductServiceBean!com.mfu.service.OrderProductService")
	OrderProductService orderProductService;
	
	@EJB(mappedName = "ejb:/SeniorWebHostel/RoomServiceBean!com.mfu.service.RoomService")
	RoomService roomService;
	
	@EJB(mappedName = "ejb:/SeniorWebHostel/ProductServiceBean!com.mfu.service.ProductService")
	ProductService productService;

	@EJB(mappedName = "ejb:/SeniorWebHostel/SpaServiceBean!com.mfu.service.SpaService")
	SpaService spaService;
	
	@EJB(mappedName = "ejb:/SeniorWebHostel/TripServiceBean!com.mfu.service.TripService")
	TripService tripService;
	
	@EJB(mappedName = "ejb:/SeniorWebHostel/GuestServiceBean!com.mfu.service.GuestService")
	GuestService guestService;

	
	@RequestMapping("/booking")
	public ModelAndView show(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("Booking.jsp");
		List<Rooms> roomList;
		List<BookRoom> bookRoomList;
		List<Product> productList;
		List<Spa> spaList;
		List<Trip> tripList;
		List<Guest> guestList;
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
			
			Guest guest = new Guest();
			mv.addObject("guest",guest);
			
			guestList = guestService.getAllGuest();
			mv.addObject("guestList", guestList);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
	
	/*BookRoom*/
	
	@RequestMapping("/saveNewGuest")
	public String saveNewGuest(@ModelAttribute("guest") Guest guest, BindingResult result, HttpServletRequest request){
		try {
			if (guest.getGuestId() == 0){
				guestService.insert(guest);
			}else{
				guestService.update(guest);
			}
		}catch (Exception e){
		}return "redirect:booking.do";
	}

}
