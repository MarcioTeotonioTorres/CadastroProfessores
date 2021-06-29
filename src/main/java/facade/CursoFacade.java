package facade;

import java.util.ArrayList;
import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import model.Curso;
import model.Curso;
import service.CursoServiceInterface;



@Path("/cursos")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Consumes(MediaType.APPLICATION_JSON)
public class CursoFacade {

	@Inject
	private CursoServiceInterface cursoServiceInterface;
	
	@GET
	public List<Curso> getCursoes(){
		return cursoServiceInterface.getCurso();
	}
	@POST
	public Curso salvarCurso(Curso curso) {
		return cursoServiceInterface.salvarCurso(curso);	
	}
	@PUT
	public void alterar(Curso curso) {
	cursoServiceInterface.alterar(curso);	
	}
	@DELETE
	@Path("/{codigo}")
	public void excluir(@PathParam("codigo")Integer codigo) {
		Curso curso = new Curso();
		curso.setCodigoCurso(codigo);
		cursoServiceInterface.excluir(curso);
	}
}
