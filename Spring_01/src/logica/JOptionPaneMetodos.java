package logica;

import javax.swing.JOptionPane;

public class JOptionPaneMetodos {
	
	private String eleccion;
	private double cantidad;
	// private String resultado;
	
	public String elegirOpcion(String mensaje, String titulo, String[] lista) {
		try {
			return eleccion = JOptionPane.showInputDialog(null, mensaje, mensaje, JOptionPane.PLAIN_MESSAGE, null, lista, null).toString();
		} catch (Exception e) {
			return eleccion = "";
		}
	}
	
	public double elegirCantidad(String mensaje) {
		try {
			return cantidad = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor no válido");
			return 0;
		} catch (NullPointerException e) {
			return 0;
		}		
	}
	
	public void mostrarResultado(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
}
