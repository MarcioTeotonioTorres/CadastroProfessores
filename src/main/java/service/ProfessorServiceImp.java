package service;

import java.util.List;

import dao.ProfessorDaoInterface;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import model.Professor;

public class ProfessorServiceImp implements ProfessorServiceInterface{

	@Inject
	private ProfessorDaoInterface professorDaoInterface;
	
	@Override
	@Transactional
	public Professor salvarProfessor(Professor professor) {
		// TODO Auto-generated method stub
		return professorDaoInterface.salvarProfessor(professor);
	}

	@Override
	@Transactional
	public void alterar(Professor professor) {
		// TODO Auto-generated method stub
		professorDaoInterface.alterar(professor);
	}

	@Override
	@Transactional
	public void excluir(Professor professor) {
		// TODO Auto-generated method stub
		professorDaoInterface.excluir(professor);
	}

	@Override
	public List<Professor> getProfessor() {
		// TODO Auto-generated method stub
		return professorDaoInterface.getProfessor();
	}

}
