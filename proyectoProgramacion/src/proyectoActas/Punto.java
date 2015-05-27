package proyectoActas;

import java.util.ArrayList;
public class Punto {
	
	private String titulo;
	private String descripción;
	
	
	public Punto(String titulo, String descripción) {
		super();
		this.titulo = titulo;
		this.descripción = descripción;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripción() {
		return descripción;
	}
	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}
	
	//escribimos los puntos que aparecerán en el acta
	public ArrayList<Punto> cargarPunto(){
		ArrayList<Punto> puntos = new ArrayList<Punto>();
		
		return puntos;
	}
	
	

}
