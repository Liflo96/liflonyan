package py.edu.uaa.pooj.actividad2.sasha;

import java.util.Date;

public class Edicion {
	private String isbn;
	private Date fechaPublicacion;
	private Libro libro;
	
	public Edicion(){
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
}
