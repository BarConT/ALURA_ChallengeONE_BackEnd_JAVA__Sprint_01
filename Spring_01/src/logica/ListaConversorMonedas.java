package logica;

import java.util.ArrayList;

public class ListaConversorMonedas {
	ArrayList<Moneda> listaMonedas = new ArrayList<Moneda>();
	String[] listaPesoMonedaExtranjera = new String[5];
	String[] listaMonedaExtranjeraPeso = new String[5];
	String[] listaMonedasNombre = new String[5];
	double[] listaMonedasValor = new double[5];
	
	public ListaConversorMonedas() {
		listaMonedas.add(new Moneda("Dólar", 202.18));
		listaMonedas.add(new Moneda("Euros", 215.72));
		listaMonedas.add(new Moneda("Libras Esterlinas", 246.19));	
		listaMonedas.add(new Moneda("Yen Japonés", 1.53));
		listaMonedas.add(new Moneda("Won sul-coreano", 0.15));
	}
	
	public void setListaMonedasNombre() {
		for(int i=0; i<this.listaPesoMonedaExtranjera.length; i++) {
			listaMonedasNombre[i] = listaMonedas.get(i).getNombreMoneda();
		}
	}
	
	public String[] getListaMonedasNombre() {
		return listaMonedasNombre;
	}
	
	public void setListaMonedasValor() {
		for(int i=0; i<this.listaPesoMonedaExtranjera.length; i++) {
			listaMonedasValor[i] = listaMonedas.get(i).getValorMoneda();
		}
	}
	
	public double[] getListaMonedasValor() {
		return listaMonedasValor;
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
}
