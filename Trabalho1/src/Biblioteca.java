import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
	List<Livro> acervo = new ArrayList<>();
	List<Cliente> usuarios = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);

	public List<Livro> getAcervo() {
		return acervo;
	}

	public List<Cliente> getUsuario() {
		return usuarios;
	}

	public void CadastroLivro() {
		Livro NovoLivro = new Livro();
		NovoLivro.AddLivro();
		acervo.add(NovoLivro);
	}

	public void CadastrarCliente() {

		int opcao;
		do {

			System.out.println("\nQuer cadastrar que tipo de usuario?");
			System.out.println("1. Cadastrar Aluno");
			System.out.println("2. Cadastrar Professor");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("\n===Cadastro Aluno ===");
				Aluno novoAluno = new Aluno();
				novoAluno.cadastrarCliente();
				usuarios.add(novoAluno);

				break;

			case 2:
				System.out.println("\n=== Cadastrar Professor ===");
				Professor novoProfessor = new Professor();
				novoProfessor.cadastrarCliente();
				usuarios.add(novoProfessor);

				break;

			default:
				System.out.println("Opção inválida! Tente novamente.");
			}

		} while (opcao != 2);
		scanner.close();
	}

	public Livro BuscarLivro() {

		for (Livro titulo : acervo) {

			System.out.println("Digite nome do Livro: ");
			String nome = scanner.nextLine().toUpperCase();

			if (nome.equals(titulo.getTitulo())) {
				return titulo;
			} else {
				System.out.println("Não existe esse livro no acervo do sistema: ");
			}
		}

		return null;
	}

	public void removeLivro(String titulo) {
		acervo.removeIf(livro -> livro.getTitulo().equals(titulo));
	}

	public void listarLivros() {

		for (Livro livro : acervo) {
			System.out.println("Título: " + livro.getTitulo());
			System.out.println("Autor: " + livro.getAutor());
			System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
			System.out.println("Número Disponível: " + livro.getExemplares());
			System.out.println("Genero: " + livro.getGenero());
		}
	}

	public void listaUsuarios(Cliente NovoCliente) {
		usuarios.add(NovoCliente);
	}

	public void emprestimo() {

	}
}
