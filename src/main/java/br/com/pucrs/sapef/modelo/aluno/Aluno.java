package br.com.pucrs.sapef.modelo.aluno;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.br.CPF;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name = "ALUNO")
@SequenceGenerator(name = "ALUNO", sequenceName = "aluno_seq_id", initialValue = 1, allocationSize = 1)
public class Aluno implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "aluno_seq_id")
	private Long id;
	
	@NotBlank(message = "Campo Nome é obrigatório")
	@Column(name = "NOME", length = 40, nullable = false)
	private String nome;
	
	@NotBlank(message = "Campo Sobrenome é obrigatório")
	@Column(name = "SOBRENOME", length = 80, nullable = false)
	private String sobrenome;
	
	@NotBlank(message = "Campo Endereço é obrigatório")
	@Column(name = "ENDERECO", length = 255, nullable = false)
	private String endereco;
		
	@Column(name = "ENDERECOCOMPLETO", length = 255, nullable = false)
	private String enderecoCompleto;
	
	@NotBlank(message = "Campo Bairro é obrigatório")
	@Column(name = "BAIRRO", length = 255, nullable = false)
	private String bairro;
	
	@Column(name = "NUMERO", nullable = false)
	private Integer numero;
	
	@NotBlank(message = "Campo Cpf é obrigatório") 
	@CPF
	@Column(name = "CPF", nullable = false, unique = true)
	private String cpf;
	
	@NotBlank(message = "Campo E-mail é obrigatório")
	@Column(name = "EMAIL", length = 255, nullable = false, unique = true)
	private String email;
	
	
}
