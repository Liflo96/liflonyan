package py.edu.uaa.pooj.actividad2.sasha;

import java.util.Date;

public class Prestamo {
	private Lector lector;
	private Ejemplar ejemplares;
	private Boolean estado;
	private Date fechaPrestamo;

	public Prestamo(){
	}
	public void realizarPrestamo(){
	}
	public void consultarEstadoPrestamo(){
	}
	public void librosAdeudadosLector(){
	}
	
	public Lector getLector() {
		return lector;
	}
	public void setLector(Lector lector) {
		this.lector = lector;
	}
	public Ejemplar getEjemplares() {
		return ejemplares;
	}
	public void setEjemplares(Ejemplar ejemplares) {
		this.ejemplares = ejemplares;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
}
