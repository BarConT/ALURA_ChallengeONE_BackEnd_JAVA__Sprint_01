package logica;

/**
 * @author BarConT
 *
 */
public class Principal {

	public static void main(String[] args) {

		Conversor conversor = new Conversor();

		do {
			conversor.iniciarPrograma();
		} while (conversor.continuarPrograma() == 0);

		conversor.terminarPrograma();
	}

}
