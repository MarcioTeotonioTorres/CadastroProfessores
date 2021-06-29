package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import model.Professor;

public class ProfessorDaoImp implements ProfessorDaoInterface{

	@PersistenceContext(unitName = "CadastroProfessores")
	private EntityManager entityManager; 
	
	@Override
	public Professor salvarProfessor(Professor professor) {
		entityManager.persist(professor);
		return professor;
	}

	@Override
	public void alterar(Professor professor) {
	Professor professorMerge = entityManager.merge(professor);
	entityManager.persist(professorMerge);
		
	}

	@Override
	public void excluir(Professor professor) {
		// TODO Auto-generated method stub
		Professor professorMerge = entityManager.merge(professor);
		entityManager.remove(professorMerge);
			
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Professor> getProfessor() {
		Query query = entityManager.createQuery("select p from Professor p");
		return query.getResultList();
	}

}
