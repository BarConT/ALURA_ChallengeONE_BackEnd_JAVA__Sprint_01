package logica.temperatura;

import java.util.ArrayList;

public class ListaTemperaturas {

	ArrayList<Temperatura> listaTemperaturas = new ArrayList<Temperatura>();
	String[] listaTemperaturaNombres;
	char[] listaTemperaturaSimbolos;
	int[] listaTemperaturaFormulas;
	
	public ListaTemperaturas() {
		
		listaTemperaturas.add(new Temperatura("Fahrenheit", 0, 'F'));
		listaTemperaturas.add(new Temperatura("Kelvin", 0, 'K'));
		listaTemperaturas.add(new Temperatura("Rankine", 0, 'R'));
	}
	
	public String[] getListaTemperaturaNombres() {
		for (int i=0; i<listaTemperaturas.size(); i++) {
			listaTemperaturaNombres[i] = listaTemperaturas.get(i).getNombre();
		}
		return getListaTemperaturaNombres();
	}
	
	public char[] getListaTemperaturaSimbolos() {
		for (int i=0; i<listaTemperaturas.size(); i++) {
			listaTemperaturaSimbolos[i] = listaTemperaturas.get(i).getSimbolo();
		}
		return listaTemperaturaSimbolos;
	}
	
	public int[] getListaTemperaturaFormulas() {
		for (int i=0; i<listaTemperaturas.size(); i++) {
			listaTemperaturaFormulas[i] = listaTemperaturas.get(i).getFormula();
		}
		return listaTemperaturaFormulas;
	}
}
