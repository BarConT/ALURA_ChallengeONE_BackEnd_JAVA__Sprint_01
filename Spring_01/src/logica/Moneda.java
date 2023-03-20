package logica;

public class Moneda {
	
	private String nombreMoneda;
	private double valorMoneda;
	
	public Moneda(String nombreMoneda, double valorMoneda) {
		super();
		this.nombreMoneda = nombreMoneda;
		this.valorMoneda = valorMoneda;
	}

	public String getNombreMoneda() {
		return nombreMoneda;
	}

	public double getValorMoneda() {
		return valorMoneda;
	}
}
