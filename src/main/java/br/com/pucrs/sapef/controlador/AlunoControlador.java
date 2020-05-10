package br.com.pucrs.sapef.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.pucrs.sapef.modelo.Aluno;
import br.com.pucrs.sapef.servico.AlunoServico;

@Controller
public class AlunoControlador {

	@Autowired
	private AlunoServico alunoServico;
	
	@GetMapping("/alunos")
	public ModelAndView listarAluno() {
		ModelAndView modelo = new ModelAndView("alunos/listarAlunos");

		List<Aluno> listaAlunos = alunoServico.listaTodosAlunos();
		modelo.addObject("alunos", listaAlunos);
		
		return modelo;

	}

}
