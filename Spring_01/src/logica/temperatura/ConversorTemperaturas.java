package logica.temperatura;

import logica.ListaConversorMonedas;
import logica.JOptionPaneMetodos;

public class ConversorTemperaturas {
	
	private JOptionPaneMetodos JOptionPaneMetodos = new logica.JOptionPaneMetodos();
	private ListaTemperaturas listaTemp = new ListaTemperaturas();
	
	private String[] listaTemperaturaNombre = listaTemp.getListaCelciusOtraTemp(); 
	private String temperaturaElegida;
	private double cantidadElegida;
	
	public void setElegirTemperatura() {
		temperaturaElegida = JOptionPaneMetodos.elegirOpcion("Elige la escala a la que deseas convertir la temperatura", "Temperatura", listaTemperaturaNombre);
	}
	
	public String getElegirTemperatura() {
		return this.temperaturaElegida;
	}
	
	public void setElegirCantidad() {
		cantidadElegida = JOptionPaneMetodos.elegirCantidad(temperaturaElegida);
	}
	
	public double getElegirCantidad() {
		return cantidadElegida;
	}
	
	/*public void seleccionarTemperatura() {
		JOptionPane.showMessageDialog(null, "Conversor de temperatura en progreso");
	
	}*/
}
