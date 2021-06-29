package model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "curso")
public class Curso implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cur_codigo")
	private Integer codigoCurso;

	@Column(name = "cur_nome", length = 50, nullable = false)
	private String nomeCurso;
	
	@Column(name = "cur_diasHorarios", length = 50, nullable = false)
	private String diasHorarios;
	
	@ManyToOne
	@JoinColumn(name = "cur_codProf",referencedColumnName = "prof_codigo", nullable = false)
	private Professor professor;
	
	public Curso(Integer codigoCurso, String nomeCurso, String diasHorarios, Professor professorModel) {
		this.codigoCurso = codigoCurso;
		this.nomeCurso = nomeCurso;
		this.diasHorarios = diasHorarios;
		this.professor = professorModel;
	}

	public Curso() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoCurso == null) ? 0 : codigoCurso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (codigoCurso == null) {
			if (other.codigoCurso != null)
				return false;
		} else if (!codigoCurso.equals(other.codigoCurso))
			return false;
		return true;
	}

	public Integer getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(Integer codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getDiasHorarios() {
		return diasHorarios;
	}

	public void setDiasHorarios(String diasHorarios) {
		this.diasHorarios = diasHorarios;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
	
	
}
