package br.com.pucrs.sapef.servico.aluno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pucrs.sapef.dto.AlunoDto;
import br.com.pucrs.sapef.form.AlunoForm;
import br.com.pucrs.sapef.modelo.aluno.Aluno;
import br.com.pucrs.sapef.repositorio.aluno.AlunoRepositorio;

@Service
public class AlunoServico {
	
	@Autowired
	private AlunoRepositorio alunoRepositorio;

	public List<Aluno> listaTodosAlunos(){
		return alunoRepositorio.findAll();
	}
	
	public AlunoDto adicionarAluno(AlunoForm form) {
		Aluno novo = new Aluno();
		novo.setCpf(form.getCpf());
		novo.setEmail(form.getEmail());
		novo.setEndereco(form.getEndereco());
		novo.setNome(form.getNome());
		novo.setNumero(form.getNumero());
		novo.setSobrenome(form.getSobrenome());
		return AlunoDto.converteAluno(alunoRepositorio.saveAndFlush(novo));
	}
	
}
