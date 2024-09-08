package exceptions;

public class Exemplo2 {
	public static void main(String[] args) {
		int vetor[] = {5,10,20};
		int i = 10, j = 0, resultado = 0;
		String texto = null;
		
		try {
			//resultado = i/j; //divisao por 0
			System.out.println(vetor[3]); //indice inacessivel
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Erro: índice inacessível!");
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			System.err.println("Erro de divisão por 0!");
		}
		catch (NullPointerException e) {
			System.err.println("Erro: texto com valor vazio!");
		}
	}
}
