package com.tours.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.tours.models.Booking;
import com.tours.models.Flight;
import com.tours.models.Payment;
import com.tours.services.BookingService;
import com.tours.services.FlightService;
import com.tours.services.HotelService;
import com.tours.services.TourPackageService;
import com.tours.services.UserService;

@Controller
public class UserController {
	
	@Autowired UserService uservice;
	@Autowired BookingService bservice;
	@Autowired HotelService hservice;
	@Autowired FlightService fservice;
	@Autowired TourPackageService tservice;
	@Autowired HttpSession session;
	
	@GetMapping("/studentspage")
	public String listStudents(Model model) {
		model.addAttribute("students",fservice.listall());
		return "studentspage";
	}
	@GetMapping("/studentspage/add") 
	public String createStudent(Model model) {
		Flight flight=new Flight();
		model.addAttribute("student",flight);
		return "create";
	}
	@GetMapping("/updatepage")
	public String editStudentForm(@RequestParam Integer id,Model model) {
		model.addAttribute("student",fservice.findById(id));
		return "edit_student";
	}
	@PostMapping("/updatepage")
	public String updateStudent(@RequestParam Integer id,@ModelAttribute("student") Flight student,Model model) {
		Flight flight=fservice.findById(id);
		flight.setId(id);
		flight.setvehicle(student.getVehicle());
		flight.settrav(student.getTrav());
		flight.setChildren(student.getChildren());
		flight.setAdults(student.getAdults());
		flight.setPlace(student.getplace());
		flight.setBdate(student.getBdate());
		fservice.updateStudent(flight);
		return "redirect:/studentspage";
		
	}
	@GetMapping("/deletepage")
	public String deleteStudent(@RequestParam Integer id) {
		fservice.deleteStudentById(id);
		return "redirect:/studentspage";
	}
	@PostMapping("/studentspage")
	public String saveStudent(@ModelAttribute("student") Flight student) {
		fservice.saveStudent(student);
		return "redirect:/studentspage";
	}
	

	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		String userid=session.getAttribute("userid").toString();
		model.addAttribute("list", bservice.getMyBookings(userid));
		return "dashboard";
	}
	
	@PostMapping("/book")
	public String savebooking(Booking book,int pkgid,int hid,int fid) {
		System.out.println(book);
		String userid=session.getAttribute("userid").toString();
		book.setUser(uservice.findByUserId(userid));
		book.setHotel(hservice.findById(hid));
		book.setFlight(fservice.findById(fid));
		book.setTour(tservice.findById(pkgid));
		Booking bk= bservice.saveBooking(book);
		return "redirect:/payment?bid="+bk.getBid();
	}
	
	@GetMapping("/book")
	public String bookings(String tour,Model model,RedirectAttributes ra) {
		model.addAttribute("hotels", hservice.listall());
		model.addAttribute("flights", fservice.listall());
		model.addAttribute("tours", tservice.listall());
		if(session.getAttribute("userid") == null) {
			ra.addFlashAttribute("error", "Please login first for booking");
			return "redirect:/login";
		}
		return "bookings";
	}
	
	@GetMapping("/payment")
	public String payments(int bid,Model model) {
		model.addAttribute("bk", bservice.findById(bid));
		return "payment";
	}
	
	@PostMapping("/payment")
	public String savePayment(Payment pmt,int bid,String userid) {
		pmt.setBooking(bservice.findById(bid));
		pmt.setUser(uservice.findByUserId(userid));
		bservice.savePayment(pmt);
		return "redirect:/dashboard";
	}
}
