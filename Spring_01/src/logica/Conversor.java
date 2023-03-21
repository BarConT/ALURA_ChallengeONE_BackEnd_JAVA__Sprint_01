package logica;

import javax.swing.JOptionPane;

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
			conversorTemp.seleccionarTemperatura();
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
