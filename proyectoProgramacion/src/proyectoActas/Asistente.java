package proyectoActas;

import java.util.ArrayList;

public class Asistente {
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private Organo organo;
	private boolean asiste;
	private ArrayList<Asistente> asistentes = new ArrayList<Asistente>();
	
	public Asistente(String nombre, String apellido1, String apellido2,
			String dni, Organo organo, boolean asiste) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.organo = organo;
		this.asiste = asiste;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Organo getOrgano() {
		return organo;
	}
	public void setOrgano(Organo organo) {
		this.organo = organo;
	}
	public boolean isAsiste() {
		return asiste;
	}
	public void setAsiste(boolean asiste) {
		this.asiste = asiste;
	}
	
	//buscamos por DNI y modificamos el objeto.
	public ArrayList<Asistente> modificarAsistente(ArrayList<Asistente> asistentes){
		
		return asistentes;
	}
	
	//función para devolver la lista entera de asistentes para posteriormente poder filtrarlos por codigos.
	public ArrayList<Asistente> listaCompleta(ArrayList<Asistente> asistentes){
		
		return asistentes;
	}


}
