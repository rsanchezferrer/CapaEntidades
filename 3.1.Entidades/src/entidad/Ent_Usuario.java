package entidad;

import java.sql.Date;

public class Ent_Usuario {

	public int idUsuario;
	public String usuario;
	public String password;
	public Date fechaCreacion;
	public Boolean activo;
	public Ent_Alumno idAlumno;
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	public Ent_Alumno getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(Ent_Alumno idAlumno) {
		this.idAlumno = idAlumno;
	}

	
}
