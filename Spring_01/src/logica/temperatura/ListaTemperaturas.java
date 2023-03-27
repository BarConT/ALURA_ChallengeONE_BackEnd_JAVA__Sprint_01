package logica.temperatura;

import java.util.ArrayList;

public class ListaTemperaturas {

	ArrayList<Temperatura> listaTemperaturas = new ArrayList<Temperatura>();
	String[] listaCelciusOtraTemp = new String[3];
	String[] listaOtraTempCelcius = new String[3];
	
	public ListaTemperaturas() {
		
		listaTemperaturas.add(new Temperatura("°Fahrenheit"));
		listaTemperaturas.add(new Temperatura("Kelvin"));
		listaTemperaturas.add(new Temperatura("°Rankine"));
	}
	
	public String[] getListaCelciusOtraTemp() {
		for(int i=0; i<this.listaTemperaturas.size(); i++) {
			listaOtraTempCelcius[i] = "De °Celcius a " + listaTemperaturas.get(i).getNombre();	
		}
		return listaOtraTempCelcius;
	}
	
	public String[] getListaOtraTempCelcius() {
		for(int i=0; i<this.listaTemperaturas.size(); i++) {
			listaCelciusOtraTemp[i] = "De " + listaTemperaturas.get(i).getNombre() + " a °Celcius";	
		}
		return listaCelciusOtraTemp;
	}


}
