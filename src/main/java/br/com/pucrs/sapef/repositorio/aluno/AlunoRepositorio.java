package br.com.pucrs.sapef.repositorio.aluno;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pucrs.sapef.modelo.aluno.Aluno;

@Repository
public interface AlunoRepositorio extends JpaRepository<Aluno, Long> {

}
