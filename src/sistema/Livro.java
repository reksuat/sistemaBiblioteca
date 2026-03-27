package sistema;

public class Livro {
	String titulo;
	String autor;
	double preco;
	
	public Livro(String titulo, String autor, double preco) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}
	
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		if(preco>=0) {
		this.preco = preco;
		}
	}


	public void exibirDetalhes() {
		System.out.println("Título: "+titulo);
		System.out.println("Autor: "+autor);
		System.out.println("Preço: "+preco);
		System.out.println("Preço com desconto: "+ calcularDesconto());
	}
	public double calcularDesconto() {
		return this.preco;
	}

	@Override
	public String toString() {
		return "Título: "+titulo+" - Autor: "+autor+" - Preço: R$"+calcularDesconto();
	}
	
}
