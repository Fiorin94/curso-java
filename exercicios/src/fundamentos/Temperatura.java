package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		
		final double AJUSTE = 32;
		final double FATOR = 5 / 9.0;
		
		double farenheit = 110;
		double celcius = (farenheit - AJUSTE) * FATOR;
		
		System.out.println("O resultado é: " + celcius);
	}
}
