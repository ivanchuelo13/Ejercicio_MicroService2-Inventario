package co.edu.unilibre.inventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unilibre.inventario.entity.Inventario;
import co.edu.unilibre.inventario.service.IInventarioService;

@RestController
public class InventarioController {
	@Autowired
	private IInventarioService inventarioService;
	
	@GetMapping("/list")
	public List<Inventario> getList(){
		return inventarioService.getAllList();
	}
	
	@GetMapping("/{id}")
	public Inventario getById(@PathVariable Long id) {
		return inventarioService.getById(id);
	}
}
