package exceptions;

public class Exemplo {
	
	//throw - lançar (uma excessão)
	//throws - encaminhar o tratamento de erro para o método chamador
	public static double calcular(int a, int b) throws Exception {
		/*if(b==0) {
			throw new ArithmeticException("Erro de divisão por zero!");
		}*/
		return a/b;
	}
	
	public static void main(String[] args) {
		//tenta executar o código
		try {
			System.out.println("Resultado: "+ calcular(10,2));
		} catch (Exception e) {  //se tem algum problema, entra na excessão (aritmetica)
			System.out.println("Erro de divisão por zero!");
		}
		finally {
			System.out.println("Sempre é executado!");  //independente de erro ou não, ele é executado
		}
		
	}

}
