package py.edu.uaa.pooj.actividad2.sasha;

import java.util.Date;

public class Persona {
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	
	public Persona(){	
	}
	public void registrarPersona(){
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
