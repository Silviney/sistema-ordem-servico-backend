package com.silviney.sistemacadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silviney.sistemacadastro.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
