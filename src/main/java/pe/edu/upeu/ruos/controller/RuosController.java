package pe.edu.upeu.ruos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.ruos.entity.Usuario;
import pe.edu.upeu.ruos.service.RuosService;

@RestController
public class RuosController {
	@Autowired
	private RuosService ruosService;
	
	@GetMapping("/usuario")
	 public List<Usuario> readList(){
		 return ruosService.readAll();
	 }
}
