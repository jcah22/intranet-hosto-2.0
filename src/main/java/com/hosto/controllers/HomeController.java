package com.hosto.controllers;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hosto.service.IOdcService;
import com.hosto.service.IReqService;

@Controller
public class HomeController {

	@Autowired
	private IOdcService odcService;

	@Autowired
	private IReqService reqservice;

	Date date = new Date();
	Calendar calendar = Calendar.getInstance();

	@GetMapping("/")
	public String home(Model m, @RequestParam String filtro) {

		calendar.setTime(date);
		int dateYear = calendar.get(Calendar.YEAR);

		m.addAttribute("reqs", reqservice.findAllByQuery(filtro));
		m.addAttribute("fecha", dateYear);

		return "home";

	}

	@GetMapping("/odc")
	public String odc(Model m, @RequestParam int filtro) {

		m.addAttribute("odcs", odcService.findAllByQuery(filtro));
		calendar.setTime(date);
		int dateYear = calendar.get(Calendar.YEAR);
		m.addAttribute("fecha", dateYear);

		return "odc";
	}

}
