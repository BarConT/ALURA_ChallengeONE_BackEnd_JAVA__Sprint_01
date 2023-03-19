package logica;

import javax.swing.JOptionPane;

/**
 * @author BarConT
 *
 */
public class Principal {

	public static void main(String[] args) {

		System.out.println("Spring 01");
		String conversor;
		String [] lista = {"Conversor de moneda", "Conversor de temperatura"};
		String [] ListaConversorDeMoneda = {"De Pesos a Dólar", "De Pesos a Euros", "De Pesos a Libras Esterlinas", "De Pesos a Yen Japonés", "De Pesos a Won sul-coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras Esterlinas a Pesos", "De Yen Japonés a Pesos", "De Won sul-coreano a Pesos"};
		
		try {
			conversor = (JOptionPane.showInputDialog(null, "Sellecione una opción de conversión", "Menu", JOptionPane.PLAIN_MESSAGE, null, lista, null).toString());
		} catch (NullPointerException e) {
			conversor = null;
			System.out.println("Fin del programa");
		}
		
		if (conversor.equals(lista[0])) {
			try {
				conversor = (JOptionPane.showInputDialog(null, "Eliga la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.PLAIN_MESSAGE, null, ListaConversorDeMoneda, null).toString());
			} catch (NullPointerException e) {
				conversor = null;
				System.out.println("Fin del programa");
			}
		} else {
			System.out.println("Fin del programa");
		}

	}

}
