package exceptions;

public class TesteConta {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("123-1", 2000.);
		
		try {
			cc.deposito(0.);
			cc.saque(200.);	
			System.out.println(cc);
			
		} catch (ContaException e) {
			System.err.println(e.getMessage());
		}
		finally { //finally executa de qualquer forma
			System.out.println(cc);
		}
		
		
		
	}
}
