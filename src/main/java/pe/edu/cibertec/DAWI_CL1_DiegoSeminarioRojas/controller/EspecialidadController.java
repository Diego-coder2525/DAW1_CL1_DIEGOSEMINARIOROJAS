package pe.edu.cibertec.DAWI_CL1_DiegoSeminarioRojas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pe.edu.cibertec.DAWI_CL1_DiegoSeminarioRojas.model.EspecialidadClass;
import pe.edu.cibertec.DAWI_CL1_DiegoSeminarioRojas.service.EspecialidadService;


@Controller
public class EspecialidadController {
	@Autowired
	EspecialidadService especialidadService;
	
	
	@GetMapping("/listadoEspecialidad")
	public String listadoEspecialidad(Model model) {
		model.addAttribute("listaEspecialidad",especialidadService.listarEspecialidad());
		return "listadoEspecialidad";
	}
	
	@GetMapping("/registroEspecialidad")
	public String registroEspecialidad(Model model) {
		model.addAttribute("especialidadForm", new EspecialidadClass());
		model.addAttribute("visualizar",false);
		return "registroEspecialidad";
	}
	
	@PostMapping("/registroEspecialidad")
	public String frmRegEspecialidadPost(@ModelAttribute("especialidadForm")EspecialidadClass especialidad,Model model) {
		String mensaje = "Estado registrado correctamente";
		
		try {
			especialidadService.registrarEspecialidad(especialidad);
		}catch(Exception e) {
			mensaje="Estado no registrado";
			
		}
		
		model.addAttribute("estadoForm",new EspecialidadClass());
		model.addAttribute("visualizar",true);
		model.addAttribute("respuesta",mensaje);
		
		
		return "registroEspecialidad";
	}
}
