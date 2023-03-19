package logica;

import javax.swing.JOptionPane;

public class Conversor {
	
	private String [] lista = {"Conversor de moneda", "Conversor de temperatura"};
	private String [] listaConversorDeMoneda = {"De Pesos a Dólar", "De Pesos a Euros", "De Pesos a Libras Esterlinas", "De Pesos a Yen Japonés", "De Pesos a Won sul-coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras Esterlinas a Pesos", "De Yen Japonés a Pesos", "De Won sul-coreano a Pesos"};
	
	
	public void iniciarPrograma() {
		String seleccionConversor = this.seleccionarConversor();

		if (seleccionConversor.equals(lista[0])) {
			if (this.seleccionarMoneda()!="") {
				this.mostrarResultado();
			}
			
		} else if (seleccionConversor.equals(lista[1])) {
			this.seleccionarTemperatura();
		}
	}
	
	
	public String seleccionarConversor() {
		try {
			return  (JOptionPane.showInputDialog(null, "Sellecione una opción de conversión", "Menu", JOptionPane.PLAIN_MESSAGE, null, lista, null).toString());
		} catch (NullPointerException e) {
			return "";
		}
	}
	
	public String seleccionarMoneda() {
		try {
			return (JOptionPane.showInputDialog(null, "Eliga la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.PLAIN_MESSAGE, null, listaConversorDeMoneda, null).toString());
		} catch (NullPointerException e) {
			return "";
		}
	}
	
	public double ingresarCantidad() {
		try {
			 return Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero que deseas convertir:"));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor no válido");
			return 0;
		} catch (NullPointerException e) {
			return 0;
		}		
	}
	
	public double convertirMoneda(double cantidad) {
		double dolar = 380.00;
		return cantidad * dolar;
	}
	
	public void mostrarResultado() {
		double cantidad = this.ingresarCantidad();
		if (cantidad>0) {
			JOptionPane.showMessageDialog(null, "Tienes $" + this.convertirMoneda(cantidad) + " dolares.");
		}
		
	}
	
	public int continuarPrograma() {
		return JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
	}
	
	public void terminarPrograma() {
		JOptionPane.showMessageDialog(null, "Programa terminado");
	}
	
	public void seleccionarTemperatura() {
		JOptionPane.showMessageDialog(null, "Conversor de temperatura en progreso");
	}
}
