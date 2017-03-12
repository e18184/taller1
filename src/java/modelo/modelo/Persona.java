package modelo.modelo;

public class Persona {

	private int ci;
	private String nombre;
	/**
	 * Apellido Paterno
	 */
	private int ap;
	/**
	 * Apellido Materno
	 */
	private String am;
	private String usuario;
	private String contrasena;

	public int getCi() {
		return this.ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAp() {
		return this.ap;
	}

	public void setAp(int ap) {
		this.ap = ap;
	}

	public String getAm() {
		return this.am;
	}

	public void setAm(String am) {
		this.am = am;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Persona() {
	}

	/**
	 * 
	 * @param parameter
	 * @param ci
	 * @param nombre
	 * @param ap
	 * @param am
	 * @param usuario
	 * @param contrasena
	 */
	public Persona(int parameter, int ci, String nombre, String ap, String am, String usuario, String contrasena) {
	}

	/**
	 * 
	 * @param usuario
	 * @param contrasena
	 */
	public Persona(String usuario, String contrasena) {
	}

}