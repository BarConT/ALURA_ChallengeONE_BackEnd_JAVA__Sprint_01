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
		
		try {
			conversor = (JOptionPane.showInputDialog(null, "Sellecione una opción de conversión", "Menu", JOptionPane.PLAIN_MESSAGE, null, lista, null).toString());
		} catch (NullPointerException e) {
			conversor = null;
			System.out.println("Fin del programa");
		}
		
		JOptionPane.showMessageDialog(null, "Tu seleción " + conversor);

	}

}
