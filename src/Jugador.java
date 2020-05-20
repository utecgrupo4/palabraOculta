
public class Jugador {
	private String nombre = "";
	private int puntos = 0;
	
	/**
	 * Constructor que ingresa nombre
	 * @param nom String Nombre del jugador
	 */
	public Jugador(String nom) {
		this.nombre = nom;
	}
	
	
	/**
	 * Suma puntos al encontrar palabra
	 * @param punto int Puntos a sumar
	 */
	public void sumarPuntos(int punto) {
		this.puntos += punto;
	}
	
	
	
	// GETTERS & SETTERS *************
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	} 
	
}
