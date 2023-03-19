package logica;

/**
 * @author BarConT
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		Conversor conversor = new Conversor();
		
		conversor.iniciarPrograma(); 
		
		if (conversor.continuarPrograma() > 0) {
			conversor.terminarPrograma();
		} else {
			conversor.iniciarPrograma(); 
		}
	}

}
