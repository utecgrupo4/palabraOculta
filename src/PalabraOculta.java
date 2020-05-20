
import java.util.ArrayList;

public class PalabraOculta {
	private String palabra;
	private char[] palabraAdivinar;
	private char[] letraAdivinada;

	/**
	 * Guarda la palabra en un array de caracteres
	 */
	public void desmembrar(String p) {
		this.palabraAdivinar = new char[p.length()];

		for (int i = 0; i < p.length(); i++) {
			this.palabraAdivinar[i] = p.charAt(i);
			this.palabraAdivinar[i] = '_';
		}
	}

	public String verificarLetras(char letra) {
		
        for (int i = 0; i < this.palabraAdivinar.length; i++) {
            if (letraAdivinada[i] == letra) {
            	palabraAdivinar[i] = letra;
            }
        }
        
        return String.valueOf(this.palabraAdivinar);
    }

// GETTERS & SETTERS **********
	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		desmembrar(palabra);
	}
	
	public char[] getPalabraDesmembrada() {
		return this.palabraAdivinar;
	}

	public int getCantidadElementos() {
        return this.palabraAdivinar.length;
    }
}
