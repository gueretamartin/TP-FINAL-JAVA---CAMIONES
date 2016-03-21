package capaEntidades;

public class Ciudad {
	
	
	private String nombre;
	private String provincia;
	private int codPostal;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public int getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	
	public Ciudad(String nom, String prov, int cod){
		
		nombre=nom;
		provincia=prov;
		codPostal=cod;
	}

}
