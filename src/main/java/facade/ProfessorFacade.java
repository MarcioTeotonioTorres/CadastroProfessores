package facade;

import java.util.List;

import dao.ProfessorDaoImp;
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
import model.Professor;
import service.ProfessorServiceImp;
import service.ProfessorServiceInterface;

@Path("/professores")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Consumes(MediaType.APPLICATION_JSON)
public class ProfessorFacade {

//	@Inject
//	private ProfessorDaoImp daoImp;
//	
//	@GET
//	public List<Professor> getProfessores(){
//		return daoImp.getProfessor();
//	}
// 	
	@Inject
	private ProfessorServiceInterface professorServiceInterface;
	
	@GET
	public List<Professor> getProfessores(){
		return professorServiceInterface.getProfessor();
	}
	@POST
	public Professor salvarProfessor(Professor professor) {
		return professorServiceInterface.salvarProfessor(professor);	
	}
	@PUT
	public void alterar(Professor professor) {
	professorServiceInterface.alterar(professor);	
	}
	@DELETE
	@Path("/{codigo}")
	public void excluir(@PathParam("codigo")Integer codigo) {
		Professor professor = new Professor();
		professor.setCodigo(codigo);
		professorServiceInterface.excluir(professor);
	}
	
	
}
