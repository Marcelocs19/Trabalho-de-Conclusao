package br.com.pucrs.sapef.controlador.aluno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pucrs.sapef.modelo.aluno.Aluno;
import br.com.pucrs.sapef.servico.aluno.AlunoServico;

@RestController
@RequestMapping("/alunos")
public class AlunoControlador {

	private static final String LISTAR_ALUNOS = "/listarAlunos";
	
	@Autowired
	private AlunoServico alunoServico;
	
	@GetMapping(LISTAR_ALUNOS)
	public ResponseEntity<List<Aluno>> listarAluno() {
		List<Aluno> listaTodosAlunos = alunoServico.listaTodosAlunos();
		return ResponseEntity.ok().body(listaTodosAlunos);
	}

}
