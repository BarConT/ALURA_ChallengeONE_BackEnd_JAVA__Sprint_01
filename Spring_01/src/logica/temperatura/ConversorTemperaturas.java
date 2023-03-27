package logica.temperatura;

import java.util.stream.Stream;

import gui.JOptionPaneMetodos;

public class ConversorTemperaturas {
	
	private JOptionPaneMetodos JOptionPaneMetodos = new gui.JOptionPaneMetodos();
	private ListaTemperaturas listaTemp = new ListaTemperaturas();
	
	private String[] listaTemperaturaNombre = Stream.of(listaTemp.getListaCelciusOtraTemp(), listaTemp.getListaOtraTempCelcius()).flatMap(Stream::of).toArray(String[]::new);
	private String temperaturaElegida;
	private Double cantidadElegida;
	private double resultado;
	private String temperaturaInicial;
	private String temperaturaFinal;

	
	public void setElegirTemperatura() {
		temperaturaElegida = JOptionPaneMetodos.elegirOpcion("Elige la escala a la que deseas convertir la temperatura", "Temperatura", listaTemperaturaNombre);
	}
	
	public String getElegirTemperatura() {
		return this.temperaturaElegida;
	}
	
	public void setElegirCantidad() {
		cantidadElegida = JOptionPaneMetodos.elegirCantidad("Ingresa el valor de la temperatura que deseas convertir:");
	}
	
	public Double getElegirCantidad() {
		return cantidadElegida;
	}
	
	public void mostrarResultado() {
		if (this.getElegirCantidad()!=null) {
			this.setResultado();
			JOptionPaneMetodos.mostrarResultado(String.format("%.2f", this.getElegirCantidad()) + " " + this.temperaturaInicial + " son " + String.format("%.2f", this.getResultado()) + " " + this.temperaturaFinal);
		}
	}
	
	public void setResultado() {
		String eleccion = this.getElegirTemperatura();
		Double grados = this.getElegirCantidad();
		
		switch (eleccion) {
			case "De °C a Fahrenheit":
				resultado = (grados*9/5)+32;
				temperaturaInicial = "°Celcius";
				temperaturaFinal = "°Fahrenheit";
				break;
			case "De °C a Kelvin":
				resultado = grados + 273.15;
				temperaturaInicial = "°Celcius";
				temperaturaFinal = "Kelvin";
				break;
			case "De °C a Rankine":
				resultado = (grados*9/5)+491.67;
				temperaturaInicial = "°Celcius";
				temperaturaFinal = "°Rankine";
				break;
			case "De Fahrenheit a °C":
				resultado = (grados-32)*5/9;
				temperaturaInicial = "°Fahrenheit";
				temperaturaFinal = "°Celcius";
				break;	
			case "De Kelvin a °C":
				resultado = grados-273.15;
				temperaturaInicial = "Kelvin";
				temperaturaFinal = "°Celcius";
				break;	
			case "De Rankine a °C":
				resultado = (grados-491.67)*5/9;;
				temperaturaInicial = "°Rankine";
				temperaturaFinal = "°Celcius";
				break;	
			}
	}
	
	public Double getResultado() {
		return resultado;
	}
	
}
