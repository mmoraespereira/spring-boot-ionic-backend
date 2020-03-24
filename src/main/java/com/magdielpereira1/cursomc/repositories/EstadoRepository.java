package com.magdielpereira1.cursomc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magdielpereira1.cursomc.domain.Estado;


@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
	public List<Estado> findAllByOrderByNome();
}
