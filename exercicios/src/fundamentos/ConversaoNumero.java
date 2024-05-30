package fundamentos;

public class ConversaoNumero {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		//Os tipos numéricos podem ser convertidos para String utilizando objetos
		//E com isso usando a notação '.' para chamar os métodos/funções
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		//É possível concatenar uma String vazia com um número transformando ele em
		//uma String, porém isso não é uma boa prática dentro do Java
		//É mais uma "gambiarra" que uma forma de conversão
	}
}
