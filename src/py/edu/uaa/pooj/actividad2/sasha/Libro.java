package py.edu.uaa.pooj.actividad2.sasha;

import java.util.List;

public class Libro {
	private String titulo;
	private List<Autor> autores;
	private String editorial;
	
	public Libro(){
	}
	public void agregarLibro(){
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
}
