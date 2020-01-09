package com.magdielpereira1.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magdielpereira1.cursomc.domain.Categoria;
import com.magdielpereira1.cursomc.repositories.CategoriaRepository;

import javassist.tools.rmi.ObjectNotFoundException;



@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new com.magdielpereira1.cursomc.resources.ObjectNotFoundException(
				"Objeto não encontrado ! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		
	}
		
}
