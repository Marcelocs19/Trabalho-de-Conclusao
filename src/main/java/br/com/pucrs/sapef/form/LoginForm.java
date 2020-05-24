package br.com.pucrs.sapef.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class LoginForm {

	@NotBlank(message = "O campo e-mail é obrigatório.")
	@Email
	private String email;
	
	@NotBlank(message = "O campo senha é obrigatório.")
	private String senha;
	
}
