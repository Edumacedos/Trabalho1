import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livro {
	
	String Titulo;
	String Autor;
	GeneroLivro genero;
	int AnoPublicacao;
	int NumeroDisponivel;
	Scanner scanner = new Scanner(System.in);

	public Livro(String titulo, String autor, int anoPublicacao, int numeroDisponivel) {
		Titulo = titulo;
		Autor = autor;
		AnoPublicacao = anoPublicacao;
		NumeroDisponivel = numeroDisponivel;
	}
	
	public Livro() {
		Titulo = "titulo";
		Autor = "autor";
		AnoPublicacao = 0;
		NumeroDisponivel = 0;
	}

	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public GeneroLivro getGenero() {
		return genero;
	}
	public int getAnoPublicacao() {
		return AnoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		AnoPublicacao = anoPublicacao;
	}
	public int getNumeroDisponivel() {
		return NumeroDisponivel;
	}
	public void setNumeroDisponivel(int numeroDisponivel) {
		NumeroDisponivel = numeroDisponivel;
	}
	
	public Livro AddLivro() {
		Livro livro = new Livro();
		
		System.out.println("Digite nome do livro.");
		String Titulo = scanner.nextLine();
		livro.setTitulo(Titulo);
		
		System.out.println("Digite nome do autor.");
		String Autor = scanner.nextLine();
		livro.setAutor(Autor);
		
		System.out.println("Digite ano de publicação.");
		int Ano = scanner.nextInt();
		livro.setAnoPublicacao(Ano);
		
		System.out.println("Digite quntos exemplares tem.");
		int quant = scanner.nextInt();
		livro.setNumeroDisponivel(quant);
		
		return livro;
		
	}
	
	
}
