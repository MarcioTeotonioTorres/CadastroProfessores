package service;

import java.util.List;

import dao.CursoDaoInterface;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import model.Curso;

public class CursoServiceImp implements CursoServiceInterface{
	@Inject
	private CursoDaoInterface cursoDaoInterface;
	
	@Override
	@Transactional
	public Curso salvarCurso(Curso curso) {
		return cursoDaoInterface.salvarCurso(curso);
	}

	@Override
	@Transactional
	public void alterar(Curso curso) {
		cursoDaoInterface.alterar(curso);
	}

	@Override
	@Transactional
	public void excluir(Curso curso) {
		cursoDaoInterface.excluir(curso);
	}

	@Override
	public List<Curso> getCurso() {
		return cursoDaoInterface.getCurso();
	}
}
