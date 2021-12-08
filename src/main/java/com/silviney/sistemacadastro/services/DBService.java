package com.silviney.sistemacadastro.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silviney.sistemacadastro.domain.Chamado;
import com.silviney.sistemacadastro.domain.Cliente;
import com.silviney.sistemacadastro.domain.Tecnico;
import com.silviney.sistemacadastro.domain.enums.Perfil;
import com.silviney.sistemacadastro.domain.enums.Prioridade;
import com.silviney.sistemacadastro.domain.enums.Status;
import com.silviney.sistemacadastro.repository.ChamadoRepository;
import com.silviney.sistemacadastro.repository.ClienteRepository;
import com.silviney.sistemacadastro.repository.TecnicoRepository;

@Service
public class DBService {
	
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Silviney França", "43538065217", "silviney@mail.com", "1234");
		tec1.addPerfil(Perfil.ADMIN);
		
		Tecnico tec2 = new Tecnico(null, "Sidney França", "83800478188", "sidney@mail.com", "8756");
		tec2.addPerfil(Perfil.TECNICO);
		
		Tecnico tec3 = new Tecnico(null, "Jason Sousa", "44178561847", "Jason@mail.com", "5789");
		tec3.addPerfil(Perfil.TECNICO);
		
		Cliente cli1 = new Cliente(null, "Thais Eveline", "82111982156", "thaiseveline@mail.com", "9874");
		Cliente cli2 = new Cliente(null, "Dominique Graziella", "36495026749", "domi@mail.com", "89874");
		Cliente cli3 = new Cliente(null, "Shirley França", "46940544496", "shirley@mail.com", "69874");
		
		Chamado ch1 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);
		Chamado ch2 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec2, cli2);
		Chamado ch3 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec3, cli3);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1, tec2,tec3 ));
		clienteRepository.saveAll(Arrays.asList(cli1, cli2,cli3 ));
		chamadoRepository.saveAll(Arrays.asList(ch1, ch2,ch3 ));
	}
	
}
