package co.edu.unilibre.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unilibre.inventario.entity.Inventario;

public interface IInventaryRepository extends JpaRepository<Inventario, Long>{

}
