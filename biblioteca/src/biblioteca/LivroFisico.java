package biblioteca;

public class LivroFisico extends Livro {
	int paginas;

	public LivroFisico(String titulo, String autor, double preco, int paginas) {
		super(titulo, autor, preco);
		this.paginas = paginas;
	}
	
	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Páginas: "+paginas);
	}
	
	@Override
	public double calcularDesconto() {
		if(this.paginas>300) {
			return this.preco * 0.90;
		}
		else {
			return this.preco;
		}
	}
	
	public String toString() {
		return super.toString()+ " - Páginas: "+paginas;
	}
	

}
