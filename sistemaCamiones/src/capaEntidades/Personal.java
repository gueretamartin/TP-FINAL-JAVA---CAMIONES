package capaEntidades;

public class Personal {


	private String nombre;
	private String apellido;
	private int dni;
	
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
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public Personal(String nom, String ape, int doc){
		
		nombre=nom;
		apellido=ape;
		dni=doc;
		
	}
	
}
