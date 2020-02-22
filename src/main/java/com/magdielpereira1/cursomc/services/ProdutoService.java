package com.magdielpereira1.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.magdielpereira1.cursomc.domain.Categoria;
import com.magdielpereira1.cursomc.domain.Produto;
import com.magdielpereira1.cursomc.repositories.CategoriaRepository;
import com.magdielpereira1.cursomc.repositories.ProdutoRepository;


@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository repo;
	
    @Autowired
    private CategoriaRepository categoriaRepository;
	
	public Produto find(Integer id) {
		Optional<Produto> obj = repo.findById(id);
		return obj.orElseThrow(() -> new com.magdielpereira1.cursomc.services.exception.ObjectNotFoundException(
				"Objeto não encontrado ! Id: " + id + ", Tipo: " + Produto.class.getName()));
		
	}
	
	public Page<Produto> search(String nome, List<Integer> ids, Integer page, Integer linesPerPage, String orderBy, String direction){
		
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		List<Categoria> categorias = categoriaRepository.findAllById(ids);
        return repo.findDistinctPageByNomeContainingAndCategorias(nome, categorias, pageRequest);
	}
	
}
