package logica;

import java.util.ArrayList;

public class ListaConversorMonedas {
	ArrayList<Moneda> listaMonedas = new ArrayList<Moneda>();
	String[] listaPesoMonedaExtranjera = new String[5];
	String[] listaMonedaExtranjeraPeso = new String[5];
	String[] listaMonedasNombre = new String[5];
	double[] listaMonedasValor = new double[5];
	
	public ListaConversorMonedas() {
		listaMonedas.add(new Moneda("Dólar", 202.18, "dolares"));
		listaMonedas.add(new Moneda("Euro", 215.72, "euros"));
		listaMonedas.add(new Moneda("Libra Esterlina", 246.19, "libras esterlinas"));	
		listaMonedas.add(new Moneda("Yen Japonés", 1.53, "yenes"));
		listaMonedas.add(new Moneda("Won sur-coreano", 0.15, "wones"));
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
				System.out.println("Que buevon");
				return true;
			}	
		}
		return false;
	}
}
