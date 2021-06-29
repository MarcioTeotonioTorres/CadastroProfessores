package dao;

import java.util.List;

import model.Curso;

public interface CursoDaoInterface {
	public Curso salvarCurso(Curso curso);
	public void alterar(Curso curso);
	public void excluir(Curso curso);
	public List<Curso> getCurso();
}
