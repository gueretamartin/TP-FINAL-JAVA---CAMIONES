package capaEntidades;

public class Camion {

	private String patenteLetra;
	private int patenteNumero;
	private String marca;
	private String modelo;
	private String descripcion;


	public String getPatenteLetra() {
		return patenteLetra;
	}
	public void setPatenteLetra(String patenteLetra) {
		this.patenteLetra = patenteLetra;
	}
	public int getPatenteNumero() {
		return patenteNumero;
	}
	public void setPatenteNumero(int patenteNumero) {
		this.patenteNumero = patenteNumero;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	// CONSTRUCTOR 
	
	public Camion(String patenteL, int patenteN, String mar, String model,
			String desc) {
		
		patenteLetra = patenteL ;
		patenteNumero = patenteN ; 
		marca = mar;
		modelo = model;
		descripcion = desc;
		
	}
	

}
