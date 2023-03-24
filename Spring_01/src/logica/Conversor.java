package logica;

import logica.temperatura.ConversorTemperaturas;

public class Conversor {
	
	private JOptionPaneMetodos JOptionPaneMetodos = new logica.JOptionPaneMetodos();
	private String [] lista = {"Conversor de moneda", "Conversor de temperatura"};
	private ConversorTemperaturas conversorTemp = new ConversorTemperaturas();
	private ConversorMonedas conversorMoneda = new ConversorMonedas();
	
	public void iniciarPrograma() {
		String seleccionConversor = this.seleccionarConversor();
		
		if (seleccionConversor.equals(lista[0])) {
			conversorMoneda.setElegirMoneda();
			if (conversorMoneda.getElegirMoneda()!="") {
				conversorMoneda.setCantidadMoneda();
				conversorMoneda.getResultado();
			}
			
		} else if (seleccionConversor.equals(lista[1])) {
			conversorTemp.setElegirTemperatura();
			if (conversorTemp.getElegirTemperatura()!="") {
				conversorTemp.setElegirCantidad();
				conversorTemp.mostrarResultado();	
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
