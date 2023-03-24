package logica.moneda;

public class Moneda {
	
	private String nombreMoneda;
	private double valorMoneda;
	private String nombreMonedaPlural;
	
	public Moneda(String nombreMoneda, double valorMoneda, String nombreMonedaPlural) {
		this.nombreMoneda = nombreMoneda;
		this.valorMoneda = valorMoneda;
		this.nombreMonedaPlural = nombreMonedaPlural;
	}

	public String getNombreMoneda() {
		return nombreMoneda;
	}

	public double getValorMoneda() {
		return valorMoneda;
	}
	
	public String getNombreMonedaPlural() {
		return nombreMonedaPlural;
	}
	
}
