package logica;

import javax.swing.JOptionPane;

public class JOptionPaneMetodos {
	
	private Double cantidad;
	
	public String elegirOpcion(String mensaje, String titulo, String[] lista) {
		try {
			return JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE, null, lista, null).toString();
		} catch (Exception e) {
			return "";
		}
	}
	
	public Double elegirCantidad(String mensaje) {
		try {
			cantidad = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor no válido");
			cantidad = null;
		} catch (NullPointerException e) {
			cantidad = null;
		}	
		return cantidad;
	}
	
	public void mostrarResultado(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public int continuarPrograma() {
		return JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
	}
	
	public void terminarPrograma() {
		JOptionPane.showMessageDialog(null, "Programa terminado");
	}
	
}
