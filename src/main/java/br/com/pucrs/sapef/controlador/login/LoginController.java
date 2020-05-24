package br.com.pucrs.sapef.controlador.login;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pucrs.sapef.form.LoginForm;
import br.com.pucrs.sapef.servico.login.LoginServico;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginServico loginServico;
	
	@PostMapping
	public ResponseEntity<Boolean> login(@RequestBody @Valid LoginForm login) {
		Boolean autenticacao = loginServico.autenticaLogin(login);
		if(Boolean.FALSE.equals(autenticacao)) {
			return ResponseEntity.badRequest().body(autenticacao);
		}
		return ResponseEntity.ok().body(autenticacao);
	}
	
}
