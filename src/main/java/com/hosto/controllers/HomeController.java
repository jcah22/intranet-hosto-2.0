package com.hosto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hosto.service.IEmpresaService;
import com.hosto.service.IOdcService;

@Controller
public class HomeController {
	
	
	@Autowired
	private IEmpresaService empresaService;
	
	@Autowired
	private IOdcService odcService;
	
	
	@GetMapping("/")
	public String home(Model m) {
		
		m.addAttribute("empresas", empresaService.listarTodos());
		
		return "home";
		
	}
	
	@GetMapping("/odc")
	public String odc(Model m,@RequestParam int filtro) {
		
		m.addAttribute("odcs", odcService.findAllByQuery(filtro));
		
		return "odc";
	}

}
