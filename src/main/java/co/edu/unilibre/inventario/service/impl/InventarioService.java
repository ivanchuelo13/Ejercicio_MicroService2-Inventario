package co.edu.unilibre.inventario.service.impl;

import java.util.List;

import co.edu.unilibre.inventario.entity.Inventario;;

public interface InventarioService {
	public List<Inventario> getAllList();
	public Inventario getById(Long id);
}