package br.com.pucrs.sapef.form;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class AlunoForm {
	
	@NotBlank(message = "Campo Nome é obrigatório")
	@Column(name = "NOME", length = 40, nullable = false)
	private String nome;
	
	@NotBlank(message = "Campo Sobrenome é obrigatório")
	@Column(name = "SOBRENOME", length = 80, nullable = false)
	private String sobrenome;
	
	@NotBlank(message = "Campo Endereço é obrigatório")
	@Column(name = "ENDERECO", length = 255, nullable = false)
	private String endereco;
	
	@NotBlank(message = "Campo Número é obrigatório")
	@Column(name = "NUMERO", nullable = false)
	private Integer numero;
	
	@NotBlank(message = "Campo Cpf é obrigatório")
	@Column(name = "CPF", length = 11 ,nullable = false)
	private String cpf;
	
	@NotBlank(message = "Campo E-mail é obrigatório")
	@Column(name = "EMAIL", length = 255, nullable = false, unique = true)
	private String email;

}
