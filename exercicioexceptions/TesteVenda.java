package exercicioexceptions;

import java.lang.IllegalArgumentException;
import java.time.DateTimeException;
import java.time.LocalDate;

public class TesteVenda {
	public static void main(String[] args) {
	
		//exceptions para dados vazios ou de valor menor ou igual a 0
		
		try {
			Produto p1 = new Produto(123,"Tv",3000., Categoria.ELETRONICO);
			Produto p2 = new Produto(12345,"Pneu",800.0, Categoria.AUTOMOTIVO);
			Produto p3 = new Produto(123,"Celular",2500.0, Categoria.ELETRONICO);
			
			Venda v1 = new Venda(p1,LocalDate.of(2024, 1, 1),1);
			Venda v2 = new Venda(p2,LocalDate.of(2024, 1, 6),1);
			Venda v3 = new Venda(p3,LocalDate.of(2024, 9, 6),1);
			
			System.out.println("Total por item:");
			System.out.println("-----------------------------");
			v1.calcularVenda();
			v2.calcularVenda();
			v3.calcularVenda();
			System.out.println("-----------------------------");
			System.out.println("Total Geral Venda: "+ Venda.getTotalVenda());
			
		} catch (DateTimeException ex) {
			if (ex.getMessage().contains("Invalid value for MonthOfYear")) {
                throw new IllegalArgumentException("Erro: O mês fornecido é inválido. Certifique-se de que o valor do mês esteja entre 1 e 12.");
            } else if (ex.getMessage().contains("Invalid value for DayOfMonth")) {
                throw new IllegalArgumentException("Erro: O dia fornecido é inválido. Certifique-se de que o valor do dia esteja correto para o mês e ano fornecidos.");
            } else {
                throw new IllegalArgumentException(ex.getMessage());
            }
		} catch (IllegalArgumentException ex) {
			
			System.err.println(ex.getMessage());
		}
		
		
	}
}