package br.com.pucrs.sapef.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pucrs.sapef.modelo.Aluno;
import br.com.pucrs.sapef.repositorio.AlunoRepositorio;

@Service
public class AlunoServico {
	
	@Autowired
	private AlunoRepositorio alunoRepositorio;

	public List<Aluno> listaTodosAlunos(){
		return alunoRepositorio.findAll();
	}
	
}
