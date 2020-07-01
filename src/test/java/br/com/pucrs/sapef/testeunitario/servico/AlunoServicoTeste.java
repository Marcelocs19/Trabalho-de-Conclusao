package br.com.pucrs.sapef.testeunitario.servico;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.pucrs.sapef.dto.AlunoDto;
import br.com.pucrs.sapef.form.AlunoForm;
import br.com.pucrs.sapef.modelo.aluno.Aluno;
import br.com.pucrs.sapef.repositorio.aluno.AlunoRepositorio;
import br.com.pucrs.sapef.servico.aluno.AlunoServico;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AlunoServicoTeste {

	private static final Long TESTE1_ID_ALUNO = 1L;
	private static final Long TESTE2_ID_ALUNO = 2L;
	private static final Long TESTE3_ID_ALUNO = 3L;
	private static final Long TESTE4_ID_ALUNO = 4L;

	private Aluno aluno1;
	private Aluno aluno2;
	private Aluno aluno3;
	private Aluno aluno4;
	private Aluno aluno5;
	private AlunoForm alunoForm;
	private AlunoForm alunoForm2;
	private AlunoDto adicionarAluno;

	@Autowired
	private AlunoServico alunoServico;

	@MockBean
	private AlunoRepositorio alunoRepositorioMock;

	private List<Aluno> listaAlunos;

	@Before
	public void setup() {
		listaAlunos = new ArrayList<>();

		aluno1 = new Aluno();
		aluno1.setId(TESTE1_ID_ALUNO);
		aluno1.setNome("João");
		aluno1.setSobrenome("Oliveira");
		aluno1.setEmail("joao@gmail.com");
		aluno1.setCpf("83220290043");
		aluno1.setEndereco("Av. Bento Gonçalves");
		aluno1.setEnderecoCompleto("Avenida Bento Gonçalves, 4289 - Partenon, Porto Alegre - RS");
		aluno1.setNumero(4289);
		aluno1.setBairro("Partenon");

		aluno2 = new Aluno();
		aluno2.setId(TESTE2_ID_ALUNO);
		aluno2.setNome("Maria");
		aluno2.setSobrenome("Da Silva");
		aluno2.setEmail("maria@gmail.com");
		aluno2.setCpf("59822468083");
		aluno2.setEndereco("Av. Ipiranga");
		aluno2.setEnderecoCompleto("Av. Ipiranga, 7721 - Partenon, Porto Alegre - RS");
		aluno2.setNumero(7721);
		aluno2.setBairro("Partenon");

		aluno3 = new Aluno();
		aluno3.setId(TESTE3_ID_ALUNO);
		aluno3.setNome("Thiago");
		aluno3.setSobrenome("Rocha");
		aluno3.setEmail("thiago@gmail.com");
		aluno3.setCpf("82580979034");
		aluno3.setEndereco("Rua Afonso Rodrigues");
		aluno3.setEnderecoCompleto("Rua Afonso Rodrigues, 272 - Jardim Botânico, Porto Alegre - RS");
		aluno3.setNumero(272);
		aluno3.setBairro("Jardim Botânico");

		aluno4 = new Aluno();
		aluno4.setId(TESTE4_ID_ALUNO);
		aluno4.setNome("Ana");
		aluno4.setSobrenome("Rodrigues");
		aluno4.setEmail("ana@gmail.com");
		aluno4.setCpf("34039680065");
		aluno4.setEndereco("Rua Cel Aparício Borges");
		aluno4.setEnderecoCompleto("Rua Coronel Aparício Borges, 1640 - Glória, Porto Alegre - RS");
		aluno4.setNumero(1640);
		aluno4.setBairro("Glória");

		listaAlunos.addAll(Arrays.asList(aluno1, aluno2, aluno3, aluno4));

		alunoForm = new AlunoForm("Fulano", "Da Silva", "Av. Prof. Oscar Pereira","Av. Prof. Oscar Pereira, 2636 - Glória, Porto Alegre - RS", "Glória", 2636, "66339994024",
				"fulano@gmail.com");

		aluno5 = new Aluno();
		aluno5.setNome("Fulano");
		aluno5.setSobrenome("Da Silva");
		aluno5.setEmail("fulano@gmail.com");
		aluno5.setCpf("66339994024");
		aluno5.setEndereco("Av. Prof. Oscar Pereira");
		aluno5.setEnderecoCompleto("Av. Prof. Oscar Pereira, 2636 - Glória, Porto Alegre - RS");
		aluno5.setNumero(2636);
		aluno5.setBairro("Glória");

		alunoForm2 = new AlunoForm("Teste", "Oliveira", "Av. Bento Gonçalves","Avenida Bento Gonçalves, 4289 - Partenon, Porto Alegre - RS", "Partenon", 4289, "83220290043",
				"joao@gmail.com");

	}

	@Test
	public void testeListarTodosAlunos() throws Exception {
		when(alunoRepositorioMock.findAll()).thenReturn(listaAlunos);
		List<AlunoDto> listaTodosAlunos = alunoServico.listaTodosAlunos();
		assertThat(listaTodosAlunos.get(0).getEmail()).isEqualTo("joao@gmail.com");
		assertThat(listaTodosAlunos.get(1).getEmail()).isEqualTo("maria@gmail.com");
		assertThat(listaTodosAlunos.get(2).getEmail()).isEqualTo("thiago@gmail.com");
		assertThat(listaTodosAlunos.get(3).getEmail()).isEqualTo("ana@gmail.com");

	}

	@Test
	public void testeAdicionarAluno() throws Exception {
		when(alunoRepositorioMock.saveAndFlush(aluno5)).thenReturn(aluno5);
		adicionarAluno = alunoServico.adicionarAluno(alunoForm);
		assertThat(adicionarAluno.getNome()).isEqualTo("Fulano");
		assertThat(adicionarAluno.getSobrenome()).isEqualTo("Da Silva");
		assertThat(adicionarAluno.getEmail()).isEqualTo("fulano@gmail.com");
		assertThat(adicionarAluno.getCpf()).isEqualTo("66339994024");
		assertThat(adicionarAluno.getEndereco()).isEqualTo("Av. Prof. Oscar Pereira");
		assertThat(adicionarAluno.getNumero()).isEqualTo(2636);
		assertThat(adicionarAluno.getBairro()).isEqualTo("Glória");

	}

	@Test
	public void testeEditarAluno() throws Exception {
		Optional<Aluno> aluno = Optional.empty();
		aluno = Optional.of(aluno1);
		when(alunoRepositorioMock.findById(TESTE1_ID_ALUNO)).thenReturn(aluno);
		aluno1.setNome("Teste");
		when(alunoRepositorioMock.saveAndFlush(aluno1)).thenReturn(aluno1);
		AlunoDto editarAluno = alunoServico.editarAluno(TESTE1_ID_ALUNO, alunoForm2);
		assertThat(editarAluno.getNome()).isEqualTo("Teste");
	}

	@Test
	public void testeExcluirAluno() throws Exception {
		Optional<Aluno> aluno = Optional.empty();
		aluno = Optional.of(aluno1);
		when(alunoRepositorioMock.findById(TESTE1_ID_ALUNO)).thenReturn(aluno);
		Boolean excluirAluno = alunoServico.excluirAluno(TESTE1_ID_ALUNO);
		assertThat(excluirAluno).isEqualTo(true);
	}

}
