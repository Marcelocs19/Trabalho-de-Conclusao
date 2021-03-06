package br.com.pucrs.sapef.servico.aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

	public List<AlunoDto> listaTodosAlunos(){
		List<AlunoDto> listaDto = new ArrayList<>();
		List<Aluno> listaAlunos = alunoRepositorio.findAll();
		
		listaAlunos.forEach(a -> {
			listaDto.add(AlunoDto.converteAluno(a));
		});
		
		return listaDto;
	}
	
	public AlunoDto adicionarAluno(AlunoForm form) {
		Aluno novo = new Aluno();		
		novo.setCpf(form.getCpf());
		novo.setEmail(form.getEmail());
		novo.setEndereco(form.getEndereco());
		novo.setEnderecoCompleto(form.getEnderecoCompleto());
		novo.setBairro(form.getBairro());
		novo.setNome(form.getNome());
		novo.setNumero(form.getNumero());
		novo.setSobrenome(form.getSobrenome());
		return AlunoDto.converteAluno(alunoRepositorio.saveAndFlush(novo));
	}
	
	public AlunoDto editarAluno(Long id, AlunoForm form) {
		Optional<Aluno> alunoBanco = alunoRepositorio.findById(id);
		Aluno aluno = null;
		if(alunoBanco.isPresent()) {
			aluno = alunoBanco.get();
			aluno.setCpf(form.getCpf());
			aluno.setEmail(form.getEmail());
			aluno.setNome(form.getNome());
			aluno.setNumero(form.getNumero());
			aluno.setSobrenome(form.getSobrenome());
			aluno.setEndereco(form.getEndereco());
			aluno.setEnderecoCompleto(form.getEnderecoCompleto());
			aluno.setBairro(form.getBairro());
			
		} else {
			alunoBanco.orElseThrow();
		}
		return AlunoDto.converteAluno(alunoRepositorio.saveAndFlush(aluno));
		
	}
	
	public Boolean excluirAluno(Long id) {
		Optional<Aluno> alunoBanco = alunoRepositorio.findById(id);
		Boolean excluir = false;
		if(alunoBanco.isPresent()) {
			alunoRepositorio.delete(alunoBanco.get());
			excluir = true;
		} else {
			alunoBanco.orElseThrow();
		}
		return excluir;
	}
	
}
