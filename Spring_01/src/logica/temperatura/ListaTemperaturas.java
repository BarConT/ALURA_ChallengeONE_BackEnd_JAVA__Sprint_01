package logica.temperatura;

import java.util.ArrayList;

public class ListaTemperaturas {

	ArrayList<Temperatura> listaTemperaturas = new ArrayList<Temperatura>();
	String[] listaCelciusOtraTemp = new String[3];
	String[] listaOtraTempCelcius = new String[3];
	
	public ListaTemperaturas() {
		
		listaTemperaturas.add(new Temperatura("Fahrenheit", 'F'));
		listaTemperaturas.add(new Temperatura("Kelvin", 'K'));
		listaTemperaturas.add(new Temperatura("Rankine", 'R'));
	}
	
	public String[] getListaCelciusOtraTemp() {
		for(int i=0; i<this.listaTemperaturas.size(); i++) {
			listaOtraTempCelcius[i] = "De °C a " + listaTemperaturas.get(i).getNombre();	
		}
		return listaOtraTempCelcius;
	}
	
	public String[] getListaOtraTempCelcius() {
		for(int i=0; i<this.listaTemperaturas.size(); i++) {
			listaCelciusOtraTemp[i] = "De " + listaTemperaturas.get(i).getNombre() + " a °C";	
		}
		return listaCelciusOtraTemp;
	}


}
