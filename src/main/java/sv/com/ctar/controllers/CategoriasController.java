package sv.com.ctar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.ctar.models.entities.Categorias;
import sv.com.ctar.models.services.ICategoriasService;

@RestController
@RequestMapping("/ctar/api/v1/Categorias")
public class CategoriasController {
	
	@Autowired
	private ICategoriasService categoriasService;
	
	@RequestMapping ("")
	private List<Categorias> findAll()
	{
		return categoriasService.findAll();
	}
}
