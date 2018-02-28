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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.mfu.entity.Rooms;
import com.mfu.service.RoomService;

@Controller
public class RoomController {
 @EJB(mappedName = "ejb:/SeniorWebHostel/RoomServiceBean!com.mfu.service.RoomService")
 RoomService roomService;
 
 private static final String UPLOAD_DIRECTORY = "/images";
 
  @RequestMapping("/saveRooms")
  public String save(@ModelAttribute("room") Rooms room, BindingResult result,
  HttpServletRequest request){
  try {
  if (room.getRoomId() == 0){
  roomService.insert(room);
  }else{
  roomService.update(room);
  }
  }catch (Exception e){
  }return "redirect:listRoom.do";
  }



 @RequestMapping("/deleteRoom")
 public String delete(HttpServletRequest request) {
  roomService.delete(Long.valueOf(request.getParameter("id")));
  return "redirect:listRoom.do";

 }

 @RequestMapping("/listRoom")
 public ModelAndView list(HttpServletRequest request) {
  ModelAndView mv = new ModelAndView("AdminManageRoom.jsp");

  List<Rooms> roomList;
  
  try {
   Rooms room = new Rooms();
   mv.addObject("room", room);
   roomList = roomService.getAllRoom();
   mv.addObject("roomList", roomList);
   
  } catch (Exception e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  return mv;
 }

 // Test upload room photo
 @RequestMapping(value = "/saveRoom", method = RequestMethod.POST)
 public String save(@RequestParam("files") CommonsMultipartFile files, Rooms room,
   BindingResult result, HttpSession sessionr, HttpServletRequest request) {
//  CommonsMultipartFile files = new CommonsMultipartFile();
//  request.getParameter("files");
   try {
    if (room.getRoomId() == 0) {
     ServletContext contextr = sessionr.getServletContext();
     String path = contextr.getRealPath(UPLOAD_DIRECTORY);
     String filename = files.getOriginalFilename();
     System.out.println(files);
//     String filename = files;
     if (!files.isEmpty()) {
      System.out.println("File is not empty");
      byte[] bytes = files.getBytes();
      BufferedOutputStream stream = new BufferedOutputStream(
        new FileOutputStream(new File(path + File.separator + filename)));
      stream.write(bytes);
      stream.flush();
      stream.close();
      room.setRoomPic("images/" + filename);
      System.out.println("filename" + room.getRoomPic());
      roomService.insert(room);
      return "redirect:listRoom.do";
     } else {
       System.out.print("File is empty");
     }
    } else {
     roomService.update(room);
    }
   } catch (Exception e) {
    e.printStackTrace();
   }
  
  return "redirect:listRoom.do";
 }

 @RequestMapping("/editRoom")
 public ModelAndView edit(HttpServletRequest request) {
  int paramId = Integer.parseInt(request.getParameter("id"));
  Rooms foundRoom;
  ModelAndView mv = new ModelAndView("AdminManageRoom.jsp");
  try {
   foundRoom = roomService.findRoomById(paramId);
   mv.addObject("room", foundRoom);
  } catch (Exception e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  return mv;
 }

 @RequestMapping("/updateRoom")
 public String updateRoom(@RequestParam CommonsMultipartFile files, @ModelAttribute("room") Rooms room,
   BindingResult result, HttpSession sessionr, HttpServletRequest request) throws IOException {
  ServletContext contextr = sessionr.getServletContext();
  String path = contextr.getRealPath(UPLOAD_DIRECTORY);
  String filename = files.getOriginalFilename();
  System.out.println("filename" + room.getRoomPic());
  if (files.isEmpty() == false) {
   System.out.print("File is not empty");
   byte[] bytes = files.getBytes();
   BufferedOutputStream stream = new BufferedOutputStream(
     new FileOutputStream(new File(path + File.separator + filename)));
   stream.write(bytes);
   stream.flush();
   stream.close();
   room.setRoomPic("images/" + filename);
  } try {
	  long roomId = Long.parseLong(request.getParameter("roomId"));
		String roomType = request.getParameter("roomType");
		String roomDetail = request.getParameter("roomDetail");
		
		Rooms rooms = roomService.findRoomById(roomId);
		rooms.setRoomType(roomType);
		rooms.setRoomDetail(roomDetail);
		roomService.update(room);
		
	  
  }catch (Exception e){
	  
  }

  

  return "listRoom.do";

 }

 @RequestMapping("uploadroomform")
 public ModelAndView uploadForm() {
  ModelAndView mv = new ModelAndView("testRoomphoto.jsp");
  Rooms room = new Rooms();
  room.setRoomType("Room type");
  mv.addObject("room", room);
  return mv;
 }

 @RequestMapping(value = "/saveroomImage", method = RequestMethod.POST)
 public ModelAndView saveroomimage(@RequestParam CommonsMultipartFile file, HttpSession session) throws Exception {

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

  return new ModelAndView("testRoomphoto.jsp", "filesuccess", "Upload Success");
 }

 @RequestMapping(value = "/editRoomWithImage")
 public String savefile(@RequestParam CommonsMultipartFile file, @ModelAttribute("room") Rooms room,
   BindingResult result, HttpSession session) throws IOException {
  ServletContext context = session.getServletContext();
  String path = context.getRealPath(UPLOAD_DIRECTORY);
  String filename = file.getOriginalFilename();
  System.out.println(path + " " + filename);

  System.out.println(room.getRoomType());
  byte[] bytes = file.getBytes();
  BufferedOutputStream stream = new BufferedOutputStream(
    new FileOutputStream(new File(path + File.separator + filename)));
  stream.write(bytes);
  stream.flush();
  stream.close();

  return "images/" + filename;
 }
 
 @RequestMapping("/showRoom")
 public ModelAndView show(HttpServletRequest request) {
  ModelAndView mv = new ModelAndView("Home.jsp");

  List<Rooms> roomList;
  
  try {
   Rooms room = new Rooms();
   mv.addObject("room", room);
   roomList = roomService.getAllRoom();
   mv.addObject("roomList", roomList);
   
  } catch (Exception e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  return mv;
 }

}