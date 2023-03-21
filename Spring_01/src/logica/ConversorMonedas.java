package logica;

import java.util.stream.Stream;

import javax.swing.JOptionPane;

public class ConversorMonedas {
	
	private ListaConversorMonedas listaConversorMonedas = new ListaConversorMonedas();
	private String[] listaPesoMonedaExtranjera = listaConversorMonedas.getListaPesoMonedaExtranjera();
	private String[] listaMonedaExtranjeraPeso = listaConversorMonedas.getListaMonedaExtranjeraPeso();
	private String[] listaMonedas = Stream.of(listaPesoMonedaExtranjera, listaMonedaExtranjeraPeso).flatMap(Stream::of).toArray(String[]::new);
	
	private double cantidadMoneda;
	private double resultado;
	private String monedaElegida;
	
	public void setElegirMoneda() {
		try {
			monedaElegida = JOptionPane.showInputDialog(null, "Eliga la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.PLAIN_MESSAGE, null, listaMonedas, null).toString();
		} catch (NullPointerException e) {
			monedaElegida = "";
		}
	}
	
	public String getElegirMoneda() {
		return this.monedaElegida;
	}
	
	public void setCantidadMoneda() {
		try {
			cantidadMoneda = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero que deseas convertir:"));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor no válido");
		} catch (NullPointerException e) {

		}		
	}
	
	public double getCantidadMoneda() {
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
	
	public double getCalcularResultado() {
		return this.resultado;
	}
	
	public void getResultado() {
		double cantidad = this.getCantidadMoneda();
		if (cantidad>0) {
			if (listaConversorMonedas.dePesosAMonedaExtranjera(monedaElegida)) {
				this.setCalcularResultadoPesoMonedaExtranjera(cantidad);
				JOptionPane.showMessageDialog(null, "Tienes $" + String.format("%.2f", this.getCalcularResultado()) + " " + listaConversorMonedas.getNombreMonedaElegida(monedaElegida));
			} else {
				this.setCalcularResultadoMonedaExtranjeraPeso(cantidad);
				JOptionPane.showMessageDialog(null, "Tienes $" + String.format("%.2f", this.getCalcularResultado()) + " pesos");
			}
			
				
		}
		
	}
}

