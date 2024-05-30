package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		
		double a = 1; //Forma implícita de converter um número
		System.out.println(a);
		
		float b = (float) 1.12345678888; //Forma explícita de converter um número "CAST"
		System.out.println(b);
		
		//Para fazer o CAST se passa o tipo a ser convertido antes do valor da variável
		//Entre parenteses (valor)
		
		int c = 340;
		byte d = (byte) c;
		System.out.println(d);
	}
}
