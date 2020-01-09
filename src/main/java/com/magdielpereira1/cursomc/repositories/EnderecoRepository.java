package com.magdielpereira1.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magdielpereira1.cursomc.domain.Endereco;;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
