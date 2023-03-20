package logica;

import javax.swing.JOptionPane;
import java.util.stream.Stream;

public class Conversor {
	
	private String [] lista = {"Conversor de moneda", "Conversor de temperatura"};
	private ConversorTemperaturas conversorTemp = new ConversorTemperaturas();
	private ListaConversorMonedas listaNombreMonedas = new ListaConversorMonedas();
	
	private String[] listaPesoMonedaExtranjera = listaNombreMonedas.getListaPesoMonedaExtranjera();
	private String[] listaMonedaExtranjeraPeso = listaNombreMonedas.getListaMonedaExtranjeraPeso();
	private String[] listaMonedas = Stream.of(listaPesoMonedaExtranjera, listaMonedaExtranjeraPeso).flatMap(Stream::of).toArray(String[]::new);
	private double cantidadMoneda;
	private double resultado;
	private String monedaElegida;
	
	public void iniciarPrograma() {
		String seleccionConversor = this.seleccionarConversor();
		
		if (seleccionConversor.equals(lista[0])) {
			this.setElegirMoneda();
			if (this.getElegirMoneda()!="") {
				this.setCantidadMoneda();
				this.getResultado();
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
			// return 0;
		}		
	}
	
	public double getCantidadMoneda() {
		return cantidadMoneda;
	}
	
	public void setCalcularResultadoPesoMonedaExtranjera(double cantidad) {
		double valorMoneda = listaNombreMonedas.getValorMonedaElegida(this.getElegirMoneda());
		this.resultado = cantidad / valorMoneda;
	}
	
	public void setCalcularResultadoMonedaExtranjeraPeso(double cantidad) {
		double valorMoneda = listaNombreMonedas.getValorMonedaElegida(this.getElegirMoneda());
		this.resultado = cantidad * valorMoneda;
	}
	
	public double getCalcularResultado() {
		return this.resultado;
	}
	
	public void getResultado() {
		double cantidad = this.getCantidadMoneda();
		if (cantidad>0) {
			this.setCalcularResultadoPesoMonedaExtranjera(cantidad);
			JOptionPane.showMessageDialog(null, "Tienes $" + this.getCalcularResultado() + " dolares.");
		}	
	}
	
	public int continuarPrograma() {
		return JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
	}
	
	public void terminarPrograma() {
		JOptionPane.showMessageDialog(null, "Programa terminado");
	}
}
