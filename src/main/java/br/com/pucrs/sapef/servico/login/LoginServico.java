package br.com.pucrs.sapef.servico.login;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pucrs.sapef.form.LoginForm;
import br.com.pucrs.sapef.modelo.professor.Professor;
import br.com.pucrs.sapef.repositorio.professor.ProfessorRepositorio;

@Service
public class LoginServico {

	@Autowired
	private ProfessorRepositorio professorRepositorio;

	public Boolean autenticaLogin(LoginForm login) {
		Optional<Professor> professor = professorRepositorio.findByEmailAndSenha(login.getEmail(), login.getSenha());
		if(professor.isPresent()) {
			return true;
		}
		return false;
	}

}
