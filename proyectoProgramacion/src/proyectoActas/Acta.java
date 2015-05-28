package proyectoActas;

import java.util.ArrayList;


public class Acta implements FuncionesActa {
		
	private String nombre;
	private ArrayList<Punto> puntosDia = new ArrayList<Punto>();
	private ArrayList<Asistente> asistentes = new ArrayList<Asistente>();
	private String descripcion;
	private String tipo;
	public Acta(String nombre, ArrayList<Punto> puntosDia,
			ArrayList<Asistente> asistentes, String descripcion, String tipo) {
		super();
		this.nombre = nombre;
		this.puntosDia = puntosDia;
		this.asistentes = asistentes;
		this.descripcion = descripcion;
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Punto> getPuntosDia() {
		return puntosDia;
	}
	public void setPuntosDia(ArrayList<Punto> puntosDia) {
		this.puntosDia = puntosDia;
	}
	public ArrayList<Asistente> getAsistentes() {
		return asistentes;
	}
	public void setAsistentes(ArrayList<Asistente> asistentes) {
		this.asistentes = asistentes;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	

}
