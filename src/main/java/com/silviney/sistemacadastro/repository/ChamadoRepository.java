package com.silviney.sistemacadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silviney.sistemacadastro.domain.Chamado;

public interface ChamadoRepository extends JpaRepository <Chamado,Integer> {

}
