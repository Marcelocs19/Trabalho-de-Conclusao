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
	
	private Long id;

	private String nome;
	
	private String sobrenome;
	
	private String endereco;
	
	private String bairro;
	
	private Integer numero;
	
	private String cpf;
	
	private String email;
	
	public static AlunoDto converteAluno(Aluno aluno) {
		return new AlunoDto(aluno.getId(), aluno.getNome(), aluno.getSobrenome(), aluno.getEndereco(), aluno.getBairro() ,aluno.getNumero(), aluno.getCpf(), aluno.getEmail());
	}
	
}
