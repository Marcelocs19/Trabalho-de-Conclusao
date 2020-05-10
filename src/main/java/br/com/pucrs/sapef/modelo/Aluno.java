package br.com.pucrs.sapef.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

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
	
	@NotBlank
	@Column(name = "NOME", length = 40, nullable = false)
	private String nome;
	
	@NotBlank
	@Column(name = "SOBRENOME", length = 80, nullable = false)
	private String sobrenome;
	
	@NotBlank
	@Column(name = "ENDERECO", length = 255, nullable = false)
	private String endereco;
	
	@Column(name = "NUMERO", nullable = false)
	private Integer numero;
	
	@Column(name = "CPF", length = 11 ,nullable = false)
	private String cpf;
	
	@NotBlank
	@Column(name = "EMAIL", length = 255, nullable = false, unique = true)
	private String email;
	
	
}
