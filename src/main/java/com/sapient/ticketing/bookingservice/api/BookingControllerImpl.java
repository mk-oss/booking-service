package com.sapient.ticketing.bookingservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookingControllerImpl implements BookingController {
	
	@Autowired
	private BookingRepository dao;
	
	@Override
	@GetMapping("/booking/{movie}/{theatre}/{show}/{seat}")
	public String bookMovie(@PathVariable String movie, @PathVariable String theatre, @PathVariable  String show, @PathVariable  String seat) {
		dao.save(new Booking(movie, theatre, show, seat));
		return "Booked";
	}
}
