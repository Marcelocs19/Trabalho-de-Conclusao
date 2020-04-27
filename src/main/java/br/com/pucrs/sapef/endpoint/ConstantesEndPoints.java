package br.com.pucrs.sapef.endpoint;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ConstantesEndPoints {

	@Retention(RetentionPolicy.RUNTIME)
	public @interface EndPointAluno {
		String requestAlunos = "/alunos";
		String listarAlunos = "alunos/listarAlunos";
		String modeloAluno = "alunos";
	}
	
}
