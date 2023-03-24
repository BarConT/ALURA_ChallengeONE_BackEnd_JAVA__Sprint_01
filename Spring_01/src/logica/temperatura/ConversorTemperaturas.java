package logica.temperatura;

import java.util.stream.Stream;
import logica.JOptionPaneMetodos;

public class ConversorTemperaturas {
	
	private JOptionPaneMetodos JOptionPaneMetodos = new logica.JOptionPaneMetodos();
	private ListaTemperaturas listaTemp = new ListaTemperaturas();
	
	private String[] listaTemperaturaNombre = Stream.of(listaTemp.getListaCelciusOtraTemp(), listaTemp.getListaOtraTempCelcius()).flatMap(Stream::of).toArray(String[]::new);
	private String temperaturaElegida;
	private Double cantidadElegida;
	private double resultado;
	
	public void setElegirTemperatura() {
		temperaturaElegida = JOptionPaneMetodos.elegirOpcion("Elige la escala a la que deseas convertir la temperatura", "Temperatura", listaTemperaturaNombre);
	}
	
	public String getElegirTemperatura() {
		return this.temperaturaElegida;
	}
	
	public void setElegirCantidad() {
		cantidadElegida = JOptionPaneMetodos.elegirCantidad(temperaturaElegida);
	}
	
	public Double getElegirCantidad() {
		return cantidadElegida;
	}
	
	public void mostrarResultado() {
		if (this.getElegirCantidad()!=null) {
			this.setResultado();
			JOptionPaneMetodos.mostrarResultado("La temperatura es " + String.format("%.2f", this.getResultado()) + "°");
		}
	}
	
	public void setResultado() {
		String eleccion = getElegirTemperatura();
		double grados = this.getElegirCantidad();
		
		switch (eleccion) {
			case "De °C a Fahrenheit":
				resultado = (grados*9/5)+32;
				break;
			case "De °C a Kelvin":
				resultado = grados + 273.15;
				break;
			case "De °C a Rankine":
				resultado = (grados*9/5)+491.67;
				break;
			case "De Fahrenheit a °C":
				resultado = (grados-32)*5/9;
				break;	
			case "De Kelvin a °C":
				resultado = grados-273.15;
				break;	
			case "De Rankine a °C":
				resultado = (grados-491.67)*5/9;;
				break;	
			}
	}
	
	public Double getResultado() {
		return resultado;
	}
	
}
