package capaEntidades;

public class Personal {


	private String nombre;
	private String apellido;
	private int dni;
	private String usuario;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
	
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
	
	public Personal(String nom, String ape, int doc,String us, String pass){
		
		nombre=nom;
		apellido=ape;
		dni=doc;
		usuario=us;
		password=pass;
		
		
	}
	public Personal() {
		// TODO Auto-generated constructor stub
	}
	
}
