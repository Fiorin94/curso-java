package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		//Nas versões mais atuais do Java é possível inferir tipos
		//utilizando a declaração "var"
		
		var a = 5.4;
		System.out.println(a);
		
		//O Java irá entender essa variável como o tipo que foi passado
		//Não é possível mudar o tipo dessa variável posteriormente
		
		var b = "tipo";
		System.out.println(b);
		
		
	}
}
