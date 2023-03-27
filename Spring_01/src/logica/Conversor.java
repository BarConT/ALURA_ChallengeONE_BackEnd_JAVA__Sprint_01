package logica;

import gui.JOptionPaneMetodos;
import logica.moneda.ConversorMonedas;
import logica.temperatura.ConversorTemperaturas;

public class Conversor {
	
	private JOptionPaneMetodos JOptionPaneMetodos = new gui.JOptionPaneMetodos();
	private String [] lista = {"Conversor de Moneda", "Conversor de Temperatura"};
	private ConversorTemperaturas conversorTemp = new ConversorTemperaturas();
	private ConversorMonedas conversorMoneda = new ConversorMonedas();
	
	public void iniciarPrograma() {
		String seleccionConversor = this.seleccionarConversor();
		
		if (seleccionConversor!=null) {
			if (seleccionConversor.equals(lista[0])) {
				conversorMoneda.setCantidadMoneda();
				if (conversorMoneda.getCantidadMoneda()!=null && conversorMoneda.getCantidadMoneda()>0) {
					conversorMoneda.setElegirMoneda();
					if (conversorMoneda.getElegirMoneda()!=null) {
						conversorMoneda.getResultado();
					}	
				}
			} else if (seleccionConversor.equals(lista[1])) {	
				conversorTemp.setElegirCantidad();
				if (conversorTemp.getElegirCantidad()!=null) {
					conversorTemp.setElegirTemperatura();
					if (conversorTemp.getElegirTemperatura()!=null) {
						conversorTemp.mostrarResultado();
					}	
				}
			}
		}
	}
	
	public String seleccionarConversor() {
		return JOptionPaneMetodos.elegirOpcion("Sellecione una opción de conversión", "Menu", lista);
	}
	
	public int continuarPrograma() {
		return JOptionPaneMetodos.continuarPrograma();
	}
	
	public void terminarPrograma() {
		JOptionPaneMetodos.terminarPrograma();
	}
}
