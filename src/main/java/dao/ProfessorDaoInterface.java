package dao;

import java.util.List;

import model.Professor;

public interface ProfessorDaoInterface {

	public Professor salvarProfessor(Professor professor);
	public void alterar(Professor professor);
	public void excluir(Professor professor);
	public List<Professor> getProfessor();
}
