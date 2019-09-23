package co.edu.unilibre.inventario.service;

import java.util.List;

import co.edu.unilibre.inventario.entity.Inventario;

public interface IInventarioService {
	public List<Inventario> getAllList();
	public Inventario getById(Long id);
}