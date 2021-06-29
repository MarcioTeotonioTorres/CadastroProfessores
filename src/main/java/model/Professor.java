package model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;




@XmlRootElement
@Entity
@Table(name = "professor")
public class Professor implements Serializable {

	public Professor(Integer codigo, String nome, String email, String telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public Professor() {

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Professor other = (Professor) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prof_codigo")
	private Integer codigo;

	@Column(name = "prof_nome", length = 50, nullable = false)
	private String nome;

	@Column(name = "prof_email", nullable = false, length = 50)
	private String email;

	@Column(name = "prof_telefone", length = 15, nullable = false)
	private String telefone;
	
//	@OneToMany(mappedBy = "professor")
//	private List<Curso> cursos;
//	
//	@XmlTransient
//	public List<Curso> getCurso(){
//		return cursos;
//	}
	
//	public List<Curso> getCursos() {
//		return cursos;
//	}
//
//	public void setCursos(List<Curso> cursos) {
//		this.cursos = cursos;
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

}
