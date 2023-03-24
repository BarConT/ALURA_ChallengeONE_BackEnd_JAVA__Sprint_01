package logica.moneda;

import java.util.ArrayList;

public class ListaConversorMonedas {
	ArrayList<Moneda> listaMonedas = new ArrayList<Moneda>();
	String[] listaPesoMonedaExtranjera = new String[5];
	String[] listaMonedaExtranjeraPeso = new String[5];
	
	public ListaConversorMonedas() {
		listaMonedas.add(new Moneda("Dólar", 204.98, "dolares"));
		listaMonedas.add(new Moneda("Euro", 220.67, "euros"));
		listaMonedas.add(new Moneda("Libra Esterlina", 249.68, "libras esterlinas"));	
		listaMonedas.add(new Moneda("Yen Japonés", 1.55, "yenes"));
		listaMonedas.add(new Moneda("Won sur-coreano", 0.16, "wones"));
	}
	
	public String[] getListaPesoMonedaExtranjera() {
		for(int i=0; i<this.listaPesoMonedaExtranjera.length; i++) {
			listaPesoMonedaExtranjera[i] = "De pesos AR a " + listaMonedas.get(i).getNombreMoneda();
		}
		return listaPesoMonedaExtranjera;
	}
	
	public String[] getListaMonedaExtranjeraPeso() {
		for(int i=0; i<this.listaMonedaExtranjeraPeso.length; i++) {
			listaMonedaExtranjeraPeso[i] = "De " + listaMonedas.get(i).getNombreMoneda() + " a pesos AR";	
		}
		return listaMonedaExtranjeraPeso;
	}
	
	public double getValorMonedaElegida(String monedaSeleccionada) {
		for(int i=0; i<this.listaMonedas.size(); i++) {
			if (monedaSeleccionada.contains(listaMonedas.get(i).getNombreMoneda())) {
				return listaMonedas.get(i).getValorMoneda();
			}	
		}
		return 0;
	}
	
	public String getNombreMonedaElegida(String monedaSeleccionada) {
		for(int i=0; i<this.listaMonedas.size(); i++) {
			if (monedaSeleccionada.contains(listaMonedas.get(i).getNombreMoneda())) {
				return listaMonedas.get(i).getNombreMonedaPlural();
			}	
		}
		return "";
	}
	
	public boolean dePesosAMonedaExtranjera(String monedaSeleccionada) {
		
		for(int i=0; i<this.listaMonedas.size(); i++) {
			if (listaPesoMonedaExtranjera[i].contains(monedaSeleccionada)) {
				return true;
			}	
		}
		return false;
	}
}
