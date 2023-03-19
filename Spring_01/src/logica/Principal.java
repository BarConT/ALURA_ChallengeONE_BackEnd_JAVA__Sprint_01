package logica;

import javax.swing.JOptionPane;

/**
 * @author BarConT
 *
 */
public class Principal {

	public static void main(String[] args) {

		String [] lista = {"Conversor de moneda", "Conversor de temperatura"};
		String [] ListaConversorDeMoneda = {"De Pesos a Dólar", "De Pesos a Euros", "De Pesos a Libras Esterlinas", "De Pesos a Yen Japonés", "De Pesos a Won sul-coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras Esterlinas a Pesos", "De Yen Japonés a Pesos", "De Won sul-coreano a Pesos"};
		String conversor;
		String conversorMonedas;
		
		try {
			conversor = (JOptionPane.showInputDialog(null, "Sellecione una opción de conversión", "Menu", JOptionPane.PLAIN_MESSAGE, null, lista, null).toString());
		} catch (NullPointerException e) {
			conversor = "";
			System.out.println("Fin del programa");
		}
		
		if (conversor.equals(lista[0])) {
			try {
				conversorMonedas = (JOptionPane.showInputDialog(null, "Eliga la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.PLAIN_MESSAGE, null, ListaConversorDeMoneda, null).toString());
			} catch (NullPointerException e) {
				conversorMonedas = "";
				System.out.println("Fin del programa");
			}
		} else {
			conversorMonedas = "";
			System.out.println("Fin del programa");
		}
		if (!conversorMonedas.isEmpty()) {
			try {
				Double cantidadDeDinero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero que deseas convertir:"));
				System.out.println("Cantidad de dinero: $" + cantidadDeDinero);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor no válido");
			} catch (NullPointerException e) {
				System.out.println("Fin del programa");
			}
			
		}
		
		int continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
		
		if (continuar > 0) {
			JOptionPane.showMessageDialog(null, "Programa terminado");
		}
	}

}
