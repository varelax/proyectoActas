package proyectoActas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Convocatoria {
	
	private Date fecha;
	private String horaInicio;
	private String lugar;
	private String horaFin;
	
	public Convocatoria(Date fecha, String horaInicio, String lugar,
			String horaFin) {
		super();
		this.fecha = fecha;
		this.horaInicio = horaInicio;
		this.lugar = lugar;
		this.horaFin = horaFin;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}
	
	//obtenermos la fecha actual con current date
	public Calendar obtenerFecha(){
		Date d = new Date();
		Calendar calendar = GregorianCalendar.getInstance();
		calendar.setTime(d);
		
		return calendar;	
		
	}
	
	
	//convertimos la hora del current date en string
	public String convertirHora(){...}

}
