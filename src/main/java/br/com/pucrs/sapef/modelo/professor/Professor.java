package br.com.pucrs.sapef.modelo.professor;

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

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name = "PROFESSOR")
@SequenceGenerator(name = "PROFESSOR", sequenceName = "professor_seq_id", initialValue = 1, allocationSize = 1)
public class Professor implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "professor_seq_id")
	private Long id;
	
	@NotBlank
	@Column(name = "NOME", length = 40, nullable = false)
	private String nome;
	
	@NotBlank
	@Column(name = "SOBRENOME", length = 80, nullable = false)
	private String sobrenome;
	
	@NotBlank
	@Column(name = "EMAIL", length = 255, nullable = false, unique = true)
	private String email;
	
	@NotBlank
	@Column(name = "SENHA", length = 255, nullable = false)
	private String senha;
}
