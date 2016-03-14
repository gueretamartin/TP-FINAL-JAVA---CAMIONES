package capaEntidades;

import java.sql.Time;
import java.sql.Date;

public class Viaje {

	// private Personal personal;
	// private Camion camion;
	// private Ciudad ciudadOrigen;
	
	private Date fecha;
	private Time horaSalida;
	private Time horaFin;
	private String estado;
	private Time horaEstimada;
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Time getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(Time horaSalida) {
		this.horaSalida = horaSalida;
	}
	public Time getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(Time horaFin) {
		this.horaFin = horaFin;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Time getHoraEstimada() {
		return horaEstimada;
	}
	public void setHoraEstimada(Time horaEstimada) {
		this.horaEstimada = horaEstimada;
	}
	/* public Personal getPersonal() {
		return personal;
	}
	public void setPersonal(Personal personal) {
		this.personal = personal;
	}
	public Camion getCamion() {
		return camion;
	}
	public void setCamion(Camion camion) {
		this.camion = camion;
	}
	public Ciudad getCiudadOrigen() {
		return ciudadOrigen;
	}
	public void setCiudadOrigen(Ciudad ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	} */
	
}
