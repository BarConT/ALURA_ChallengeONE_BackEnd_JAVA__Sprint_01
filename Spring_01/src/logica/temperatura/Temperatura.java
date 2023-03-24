package logica.temperatura;

public class Temperatura {

	private String nombre;
	private char simbolo;
	
	public Temperatura(String nombre, char simbolo) {
		this.nombre = nombre;
		this.simbolo = simbolo;
	}

	public String getNombre() {
		return nombre;
	}

	public char getSimbolo() {
		return simbolo;
	}
	
}
