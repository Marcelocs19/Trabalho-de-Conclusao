package br.com.pucrs.sapef.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pucrs.sapef.modelo.Aluno;

@Repository
public interface AlunoRepositorio extends JpaRepository<Aluno, Long>{

}
