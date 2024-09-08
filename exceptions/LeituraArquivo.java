package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeituraArquivo {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:/Users/SERRATEC/teste.txt");
			System.out.println("Arquivo encontrado!");
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo não encontrado"); //mostra a mensagem vermelha como se fosse o erro original
			//e.printStackTrace(); //mostra a mensagem do erro
		}
		
	}

}
