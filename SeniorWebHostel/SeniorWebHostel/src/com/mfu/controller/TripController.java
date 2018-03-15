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

import com.mfu.entity.Trip;
import com.mfu.entity.Trip;
import com.mfu.service.TripService;

@Controller
public class TripController {
	private static final String UPLOAD_DIRECTORY = "/images";

	@EJB(mappedName = "ejb:/SeniorWebHostel/TripServiceBean!com.mfu.service.TripService")
	TripService tripService;
	
/*	@RequestMapping("/saveTrip")
	public String save(@ModelAttribute("trip") Trip trip, BindingResult result, HttpServletRequest request){
		try {
			if (trip.getTripId() == 0){
				tripService.insert(trip);
			}else{
				tripService.update(trip);
			}
		}catch (Exception e){
		}return "redirect:listTrip.do";
	}*/
	
@RequestMapping("/editTrip")
	public ModelAndView edit(HttpServletRequest request) {
	int paramId = Integer.parseInt(request.getParameter("id"));
		Trip foundTrip;
		ModelAndView mv = new ModelAndView("AdminManageTrip.jsp");
		try {
			foundTrip = tripService.findTripId(paramId);
			mv.addObject("foundTrip", foundTrip);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
	
	@RequestMapping("/deleteTrip")
	public String delete(HttpServletRequest request){
		tripService.delete(Long.valueOf(request.getParameter("id")));
		return "redirect:listTrip.do";
	
	}
	
	@RequestMapping("/listTrip")
	public ModelAndView list(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("AdminManageTrip.jsp");
		List<Trip> tripList;
		try {
			Trip trip = new Trip();
			mv.addObject("trip",trip);
			tripList = tripService.getAllTrip();
			mv.addObject("tripList", tripList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
	
	// Test upload trip photo
		@RequestMapping(value = "/saveTrip", method = RequestMethod.POST)
		public String save(@RequestParam("files") CommonsMultipartFile files, Trip trip, BindingResult result,
				HttpSession sessionr, HttpServletRequest request) {
			// CommonsMultipartFile files = new CommonsMultipartFile();
			// request.getParameter("files");
			try {
				if (trip.getTripId() == 0) {
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
						trip.setTripPic("images/" + filename);
						System.out.println("filename" + trip.getTripPic());
						tripService.insert(trip);
						return "redirect:listTrip.do";
					} else {
						System.out.print("File is empty");
					}
				} else {
					tripService.update(trip);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			return "redirect:listTrip.do";
		}

		@RequestMapping("/editTrip")
		public ModelAndView editTrip(HttpServletRequest request) {
			int paramId = Integer.parseInt(request.getParameter("id"));
			Trip foundTrip;
			ModelAndView mv = new ModelAndView("AdminManageTrip.jsp");
			try {
				foundTrip = tripService.findTripId(paramId);
				mv.addObject("trip", foundTrip);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return mv;
		}

		@RequestMapping("/updateTrip")
		public String updateTrip(@RequestParam CommonsMultipartFile files, @ModelAttribute("trip") Trip trip,
				BindingResult result, HttpSession sessionr, HttpServletRequest request) throws IOException {
			ServletContext contextr = sessionr.getServletContext();
			String path = contextr.getRealPath(UPLOAD_DIRECTORY);
			String filename = files.getOriginalFilename();
			System.out.println("filename" + trip.getTripPic());
			if (files.isEmpty() == false) {
				System.out.print("File is not empty");
				byte[] bytes = files.getBytes();
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(new File(path + File.separator + filename)));
				stream.write(bytes);
				stream.flush();
				stream.close();
				trip.setTripPic("images/" + filename);
			}
			try {
				long tripId = Long.parseLong(request.getParameter("tripId"));
				String tripName = request.getParameter("tripName");
				String tripDetail = request.getParameter("tripDetail");
				String tripPrice = request.getParameter("tripPrice");


				Trip trip1 = tripService.findTripId(tripId);
				trip1.setTripName(tripName);
				trip1.setTripDetail(tripDetail);
				trip1.setTripPrice(tripPrice);
				tripService.update(trip1);

			} catch (Exception e) {

			}

			return "listTrip.do";

		}

		@RequestMapping("uploadtripform")
		public ModelAndView uploadForm() {
			ModelAndView mv = new ModelAndView("testTripphoto.jsp");
			Trip trip = new Trip();
			trip.setTripName("Trip name");
			mv.addObject("trip", trip);
			return mv;
		}

		@RequestMapping(value = "/savetripImage", method = RequestMethod.POST)
		public ModelAndView savetripimage(@RequestParam CommonsMultipartFile file, HttpSession session) throws Exception {

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

			return new ModelAndView("testTripphoto.jsp", "filesuccess", "Upload Success");
		}

		@RequestMapping(value = "/editTripWithImage")
		public String savefile(@RequestParam CommonsMultipartFile file, @ModelAttribute("trip") Trip trip,
				BindingResult result, HttpSession session) throws IOException {
			ServletContext context = session.getServletContext();
			String path = context.getRealPath(UPLOAD_DIRECTORY);
			String filename = file.getOriginalFilename();
			System.out.println(path + " " + filename);

			System.out.println(trip.getTripName());
			byte[] bytes = file.getBytes();
			BufferedOutputStream stream = new BufferedOutputStream(
					new FileOutputStream(new File(path + File.separator + filename)));
			stream.write(bytes);
			stream.flush();
			stream.close();

			return "images/" + filename;
		}


}
