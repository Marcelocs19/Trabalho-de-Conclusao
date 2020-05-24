package br.com.pucrs.sapef.repositorio.professor;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pucrs.sapef.modelo.professor.Professor;

@Repository
public interface ProfessorRepositorio extends JpaRepository<Professor, Long> {

	Boolean findByEmail(String email);
	
	Optional<Professor> findByEmailAndSenha(String email, String senha);
	
}
