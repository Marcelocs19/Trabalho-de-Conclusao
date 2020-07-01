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
	private String nome;
	
	@NotBlank(message = "Campo Sobrenome é obrigatório")
	private String sobrenome;
	
	@NotBlank(message = "Campo Endereço é obrigatório")
	private String endereco;
	
	private String enderecoCompleto;
	
	@NotBlank(message = "Campo Bairro é obrigatório")
	private String bairro;
		
	@Column(name = "NUMERO", nullable = false)
	private Integer numero;
	
	@NotBlank(message = "Campo Cpf é obrigatório")
	private String cpf;
	
	@NotBlank(message = "Campo E-mail é obrigatório")
	private String email;

}
