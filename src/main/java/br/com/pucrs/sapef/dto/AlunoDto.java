package br.com.pucrs.sapef.dto;

import br.com.pucrs.sapef.modelo.aluno.Aluno;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class AlunoDto {

	private String nome;
	
	private String sobrenome;
	
	private String endereco;
	
	private Integer numero;
	
	private String cpf;
	
	private String email;
	
	public static AlunoDto converteAluno(Aluno aluno) {
		return new AlunoDto(aluno.getNome(), aluno.getSobrenome(), aluno.getEndereco(), aluno.getNumero(), aluno.getCpf(), aluno.getEmail());
	}
	
}
