package co.edu.unilibre.inventario.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unilibre.inventario.entity.Inventario;
import co.edu.unilibre.inventario.repository.IInventaryRepository;
import co.edu.unilibre.inventario.service.IInventarioService;

@Service
public class InventarioService implements IInventarioService{

	@Autowired
	private IInventaryRepository inventaryRepository;
	
	@Override
	public List<Inventario> getAllList() {
		return inventaryRepository.findAll();
	}

	@Override
	public Inventario getById(Long id) {
		return inventaryRepository.findById(id).get();
	}
	
}