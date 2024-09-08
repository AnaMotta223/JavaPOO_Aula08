package exceptions;

import javax.swing.JOptionPane;

public class Evento {
	private String email;
	private Integer idade;
	
	public Evento(String email, Integer idade) {
		if (idade < 18) {
			throw new IllegalArgumentException("Idade insuficiente - menor de idade não pode participar!");
		}else {
			this.email = email;
			this.idade = idade;
			JOptionPane.showMessageDialog(null, "Inscrição confirmada!");
		}
		
	}

	public static void main(String[] args) {
		int opcao = 0;
		do {
			try {
				String email = JOptionPane.showInputDialog("Email: ");
				Integer idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
				Evento evento = new Evento(email,idade);
				opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Informação", 0, 1);
			} catch (IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		} while(opcao == 0);
		
		
	}
}
