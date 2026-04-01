package biblioteca;

public class Revista extends Livro {
	
	int edicao;

	public Revista(String titulo, String autor, double preco, int edicao) {
		super(titulo, autor, preco);
		this.edicao = edicao;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	@Override
	public void exibirDetalhes() {
		System.out.println("Revista");
		super.exibirDetalhes();
		System.out.println("Edição nº: "+edicao);
	}
public String toString() {
	return super.toString()+ " - Edição nº: "+edicao;
	}
}
