package logica.moneda;

import java.util.stream.Stream;
import gui.JOptionPaneMetodos;

public class ConversorMonedas {
	
	private JOptionPaneMetodos JOptionPaneMetodos = new gui.JOptionPaneMetodos();
	private ListaConversorMonedas listaConversorMonedas = new ListaConversorMonedas();

	private String[] listaMonedas = Stream.of(listaConversorMonedas.getListaPesoMonedaExtranjera(), listaConversorMonedas.getListaMonedaExtranjeraPeso()).flatMap(Stream::of).toArray(String[]::new);
	private Double cantidadMoneda;
	private Double resultado;
	private String monedaElegida;
	
	public void setElegirMoneda() {
		monedaElegida = JOptionPaneMetodos.elegirOpcion("Eliga la moneda a la que deseas convertir tu dinero", "Monedas", listaMonedas);
	}
	
	public String getElegirMoneda() {
		return this.monedaElegida;
	}
	
	public void setCantidadMoneda() {
		cantidadMoneda = JOptionPaneMetodos.elegirCantidad("Ingrese la cantidad de dinero que deseas convertir:");
	}
	
	public Double getCantidadMoneda() {
		return cantidadMoneda;
	}
	
	public void setCalcularResultadoPesoMonedaExtranjera(double cantidad) {
		double valorMoneda = listaConversorMonedas.getValorMonedaElegida(this.getElegirMoneda());
		this.resultado = cantidad / valorMoneda;
	}
	
	public void setCalcularResultadoMonedaExtranjeraPeso(double cantidad) {
		double valorMoneda = listaConversorMonedas.getValorMonedaElegida(this.getElegirMoneda());
		this.resultado = cantidad * valorMoneda;
	}
	
	public Double getCalcularResultado() {
		return this.resultado;
	}
	
	public void getResultado() {
		Double cantidad = this.getCantidadMoneda();
		if (listaConversorMonedas.dePesosAMonedaExtranjera(monedaElegida)) {
			this.setCalcularResultadoPesoMonedaExtranjera(cantidad);		
			JOptionPaneMetodos.mostrarResultado("Tienes $" + String.format("%.2f", this.getCalcularResultado()) + " " + listaConversorMonedas.getNombreMonedaElegida(monedaElegida));
		} else {
			this.setCalcularResultadoMonedaExtranjeraPeso(cantidad);
			JOptionPaneMetodos.mostrarResultado("Tienes $" + String.format("%.2f", this.getCalcularResultado()) + " pesos");
		}	
	}
	
}

