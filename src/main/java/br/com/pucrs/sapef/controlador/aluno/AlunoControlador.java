package br.com.pucrs.sapef.controlador.aluno;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pucrs.sapef.dto.AlunoDto;
import br.com.pucrs.sapef.form.AlunoForm;
import br.com.pucrs.sapef.modelo.aluno.Aluno;
import br.com.pucrs.sapef.servico.aluno.AlunoServico;

@RestController
@RequestMapping("/alunos")
public class AlunoControlador {

	private static final String LISTAR_ALUNOS = "/listarAlunos";
	private static final String CADASTRAR_ALUNO = "/novo";
	private static final String EDITAR_ALUNO = "/editar/{id}";
	private static final String EXCLUIR_ALUNO = "/excluir/{id}";
	
	@Autowired
	private AlunoServico alunoServico;
	
	@GetMapping(LISTAR_ALUNOS)
	public ResponseEntity<List<Aluno>> listarAluno() {
		List<Aluno> listaTodosAlunos = alunoServico.listaTodosAlunos();
		return ResponseEntity.ok().body(listaTodosAlunos);
	}
	
	@PostMapping(CADASTRAR_ALUNO)
	public ResponseEntity<AlunoDto> cadastrarAluno(@RequestBody @Valid AlunoForm aluno) {
		return ResponseEntity.ok().body(alunoServico.adicionarAluno(aluno));
	}
	
	@PutMapping(EDITAR_ALUNO) 
	public ResponseEntity<AlunoDto> editarAluno(@PathVariable(name = "id") Long id, @RequestBody @Valid AlunoForm aluno) {
		return ResponseEntity.ok().body(alunoServico.editarAluno(id, aluno));
	}
	
	@DeleteMapping(EXCLUIR_ALUNO)
	public ResponseEntity<Boolean> excluirAluno(@PathVariable(name = "id") Long id) {
		Boolean excluirAluno = alunoServico.excluirAluno(id);
		if(Boolean.TRUE.equals(excluirAluno)) {
			return ResponseEntity.ok().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}

}
