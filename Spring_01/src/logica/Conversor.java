package logica;

import javax.swing.JOptionPane;

import logica.temperatura.ConversorTemperaturas;

public class Conversor {
	
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
			}
			
		}
	}
	
	public String seleccionarConversor() {
		try {
			return (JOptionPane.showInputDialog(null, "Sellecione una opción de conversión", "Menu", JOptionPane.PLAIN_MESSAGE, null, lista, null).toString());
		} catch (NullPointerException e) {
			return "";
		}
	}
	
	public int continuarPrograma() {
		return JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
	}
	
	public void terminarPrograma() {
		JOptionPane.showMessageDialog(null, "Programa terminado");
	}
}
