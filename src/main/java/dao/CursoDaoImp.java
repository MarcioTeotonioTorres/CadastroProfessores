package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import model.Curso;

public class CursoDaoImp implements CursoDaoInterface{
	@PersistenceContext(unitName = "CadastroProfessores")
	private EntityManager entityManager; 
	
	@Override
	public Curso salvarCurso(Curso curso) {
		entityManager.persist(curso);
		return curso;
	}

	@Override
	public void alterar(Curso curso) {
	Curso cursoMerge = entityManager.merge(curso);
	entityManager.persist(cursoMerge);
		
	}

	@Override
	public void excluir(Curso curso) {
		// TODO Auto-generated method stub
		Curso cursoMerge = entityManager.merge(curso);
		entityManager.remove(cursoMerge);
			
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Curso> getCurso() {
		Query query = entityManager.createQuery("select p from Curso p");
		return query.getResultList();
	}

}
