package biblioteca;

public class Ebook extends Livro{

	double tamanhoMB;

	public Ebook(String titulo, String autor, double preco, double tamanhoMB) {
		super(titulo, autor, preco);
		this.tamanhoMB = tamanhoMB;
	}

	public double getTamanhoMB() {
		return tamanhoMB;
	}

	public void setTamanhoMB(double tamanhoMB) {
		this.tamanhoMB = tamanhoMB;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("Ebook");
		super.exibirDetalhes();
		System.out.println("Tamanho: "+tamanhoMB +" MB");
	}
	public double calcularDesconto() {
		return getPreco()*0.80;
	}
	
	@Override
	public String toString() {
		return super.toString()+" - Tamanho: "+tamanhoMB +" MB";
	}
	
}
