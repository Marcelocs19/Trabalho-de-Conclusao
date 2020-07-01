package br.com.pucrs.sapef.testeunitario.repositorio;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.pucrs.sapef.modelo.professor.Professor;
import br.com.pucrs.sapef.repositorio.professor.ProfessorRepositorio;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ProfessorRepositorioTeste {

	@Autowired
	private ProfessorRepositorio professorRepositorio;
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	private Professor professor;
	
	@Before
	public void setup() {
		this.professorRepositorio.deleteAll();
		
		professor = new Professor();
		professor.setEmail("joao@gmail.com");
		professor.setNome("João");
		professor.setSobrenome("Silva");
		professor.setSenha("12345");
		
		this.professorRepositorio.saveAndFlush(professor);
	}
	
	@Test
	public void validarPrfeossorCadastradoNoBanco() throws Exception {
		System.out.println(professor.getEmail());
		Optional<Professor> busca = this.professorRepositorio.findByEmailAndSenha(professor.getEmail(), professor.getSenha());
		assertThat(busca.get().getEmail()).isEqualTo("joao@gmail.com");
	}
	
}
