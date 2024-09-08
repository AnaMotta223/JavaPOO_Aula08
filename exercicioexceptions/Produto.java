package exercicioexceptions;

public class Produto {
	private int codigo;
	private String descricao;
	private double valor;
	private Categoria categoria;
	
	public Produto(int codigo, String descricao, double valor, Categoria categoria) throws IllegalArgumentException {
		if(valor <= 0 || codigo<=0) {
			throw new IllegalArgumentException("Erro: Valor inserido inválido! Não pode ser menor ou igual a zero!");
		}
		if (descricao == "") {
			throw new IllegalArgumentException("Erro: Descrição vazia!");
		}
		
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.categoria = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}

	public Categoria getCategoria() {
		return categoria;
	}
	
}
