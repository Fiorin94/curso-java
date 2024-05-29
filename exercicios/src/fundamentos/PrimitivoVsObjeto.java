package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		String objeto = "teste";
		
		objeto = objeto.toUpperCase();
		
		System.out.println(objeto);
		
		//Wrappers são a versão objeto dos tipos primitivos
		int a = 123;
		System.out.println(a);
	}
}
