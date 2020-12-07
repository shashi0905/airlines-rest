package com.shashi.demo.airlinesrest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shashi.demo.airlinesrest.model.Flight;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AirlinesController {
	
	@RequestMapping(value = "/flights", method = RequestMethod.GET)
	public List <Flight> getFlights(Model model) {
		List <Flight> flightList = new ArrayList<Flight>();
		flightList.add(new Flight("F101", "NDLS", "GUW" ));
		flightList.add(new Flight("F102", "NDLS", "DDN" ));
		
		return flightList;
	}

}
