package service;

import java.util.List;

import model.Professor;

public interface ProfessorServiceInterface {

public Professor salvarProfessor(Professor professor);
public void alterar(Professor professor);
public void excluir(Professor professor);
public List<Professor> getProfessor();
}
