package logica.temperatura;

public class Temperatura {

	private String nombre;
	private int formula;
	private char simbolo;
	
	public Temperatura(String nombre, int formula, char simbolo) {
		this.nombre = nombre;
		this.formula = formula;
		this.simbolo = simbolo;
	}

	public String getNombre() {
		return nombre;
	}

	public int getFormula() {
		return formula;
	}

	public char getSimbolo() {
		return simbolo;
	}
	
}
