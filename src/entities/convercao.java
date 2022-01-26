package entities;

public class convercao {

	public static double dolar;
	public static double cot;
	
	public static double calculo() {
		double reais = (cot * dolar) + (0.06 * dolar);
		return reais;
	}
	
	
}


