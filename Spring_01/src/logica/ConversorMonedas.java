package logica;

public class ConversorMonedas {
	
	private String nombreMoneda;
	private double valorMoneda;
	
	public ConversorMonedas(String nombreMoneda, double valorMoneda) {
		this.nombreMoneda = nombreMoneda;
		this.valorMoneda = valorMoneda;
	}

	public String getNombreMoneda() {
		return this.nombreMoneda;
	}

	public double getValorMoneda() {
		return this.valorMoneda;
	}
	
}
