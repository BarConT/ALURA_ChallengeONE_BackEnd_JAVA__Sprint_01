package logica;

import java.util.ArrayList;

public class ListaConversorMonedas {
	ArrayList<ConversorMonedas> listaConversorDeMonedas = new ArrayList<ConversorMonedas>();
	String[] listaPesoMonedaExtranjera = new String[5];
	String[] listaMonedaExtranjeraPeso = new String[5];
	
	public ListaConversorMonedas() {
		listaConversorDeMonedas.add(new ConversorMonedas("Dólar", 202.18));
		listaConversorDeMonedas.add(new ConversorMonedas("Euros", 215.72));
		listaConversorDeMonedas.add(new ConversorMonedas("Libras Esterlinas", 246.19));	
		listaConversorDeMonedas.add(new ConversorMonedas("Yen Japonés", 1.53));
		listaConversorDeMonedas.add(new ConversorMonedas("Won sul-coreano", 0.15));
	}
	
	public String[] getListaPesoMonedaExtranjera() {
		for(int i=0; i<this.listaPesoMonedaExtranjera.length; i++) {
			listaPesoMonedaExtranjera[i] = "De pesos AR a " + listaConversorDeMonedas.get(i).getNombreMoneda();
		}
		return listaPesoMonedaExtranjera;
	}
	
	public String[] getListaMonedaExtranjeraPeso() {
		for(int i=0; i<this.listaMonedaExtranjeraPeso.length; i++) {
			listaMonedaExtranjeraPeso[i] = "De " + listaConversorDeMonedas.get(i).getNombreMoneda() + " a pesos AR";	
		}
		return listaMonedaExtranjeraPeso;
	}
	
	public double getValorMonedaElegida(String monedaSeleccionada) {
		for(int i=0; i<this.listaConversorDeMonedas.size(); i++) {
			if (monedaSeleccionada.contains(listaConversorDeMonedas.get(i).getNombreMoneda())) {
				return listaConversorDeMonedas.get(i).getValorMoneda();
			}	
		}
		return 0;
	}
}
