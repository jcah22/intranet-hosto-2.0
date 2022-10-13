package com.hosto.controllers;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hosto.models.Area;
import com.hosto.models.Cfdi;
import com.hosto.models.Directivo;
import com.hosto.models.Empresa;
import com.hosto.models.Odc;
import com.hosto.models.Req;
import com.hosto.models.Status;
import com.hosto.models.Usuario;
import com.hosto.service.IAreaService;
import com.hosto.service.ICfdiService;
import com.hosto.service.IDirectivoService;
import com.hosto.service.IEmpresaService;
import com.hosto.service.IOdcService;
import com.hosto.service.IReqService;
import com.hosto.service.IStatusService;
import com.hosto.service.IUsuarioService;

@Controller
public class HomeController {

	@Autowired
	private IOdcService odcService;

	@Autowired
	private IReqService reqservice;

	@Autowired
	private IEmpresaService empresaservice;;

	@Autowired
	private IAreaService areaservice;

	@Autowired
	private ICfdiService cfdiservice;

	@Autowired
	private IDirectivoService directivoservice;

	@Autowired
	private IStatusService statusservice;
	
	@Autowired
	private IUsuarioService usuarioService;

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

	@GetMapping("/newreq")
	public String newreq(Model model, @ModelAttribute Req req) {

		List<Empresa> empresas = empresaservice.listarTodos();

		model.addAttribute("empresas", empresas);
		model.addAttribute("req", req);

		return "newreq";

	}

	@PostMapping("/savereq")
	public String saveReq(@ModelAttribute Req req) {

		try {
			reqservice.guardarReq(req);
			System.out.println("registro guardado con exito!");

		} catch (Exception e) {
			System.out.println("Algo fallo y no se pudo guardar el registro ");
		}

		return "redirect:/?filtro=z";

	}

	@GetMapping("/newodc")
	public String newodc(Model model) {
		
		Odc odc = new Odc();

		List<Area> areas = areaservice.listarTodos();
		List<Cfdi> cfdis = cfdiservice.listarTodos();
		List<Directivo> directivos = directivoservice.listarTodos();
		List<Req> reqs = reqservice.listarTodos();
		List<Status> status = statusservice.listarTodos();
		List<Usuario> usuarios = usuarioService.listarTodos();

		model.addAttribute("areas", areas);
		model.addAttribute("cfdis", cfdis);
		model.addAttribute("directivos", directivos);
		model.addAttribute("reqs", reqs);
		model.addAttribute("status", status);
		model.addAttribute("odc", odc);
		model.addAttribute("usuarios", usuarios);

		return "newodc";

	}

	@PostMapping("/saveodc")
	public String saveOdc(@ModelAttribute Odc odc) {

		try {
			odcService.guardar(odc);
			
			System.out.println("registro guardado con exito!");
		} catch (Exception e) {
			System.out.println("Algo fallo y no se pudo guardar el registro ");

		}
		return "redirect:/?filtro=z";
	}

}
