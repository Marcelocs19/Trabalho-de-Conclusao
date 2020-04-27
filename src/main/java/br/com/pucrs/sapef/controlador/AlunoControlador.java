package br.com.pucrs.sapef.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.pucrs.sapef.endpoint.ConstantesEndPoints;
import br.com.pucrs.sapef.modelo.Aluno;
import br.com.pucrs.sapef.servico.AlunoServico;

@Controller
@RequestMapping("/alunos")
public class AlunoControlador {

	@Autowired
	private AlunoServico alunoServico;

	@GetMapping
	public ModelAndView listarAluno() {
		ModelAndView modelo = new ModelAndView("alunos/listarAlunos");

		List<Aluno> listaAlunos = alunoServico.listaTodosAlunos();
		modelo.addObject(ConstantesEndPoints.EndPointAluno.modeloAluno, listaAlunos);
		
		return modelo;

	}

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "listarAlunos";
	}
}
