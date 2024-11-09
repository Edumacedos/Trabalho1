import java.time.LocalDate;

public class Aluno extends Cliente {
    int quantLivros;
	LocalDate hoje = LocalDate.now();
	
	public int getQuantLivros() {
		return quantLivros;
	}

	public void setQuantLivros() {
		quantLivros = quantLivros + 1;
	}
   
	public void emprestimoAluno(Biblioteca acervo) {
        if (getTipo().equals("Aluno") && getMulta() == 0 && getQuantLivros() < 3) {
            System.out.println("Digite nome do Livro a ser emprestado: ");
            String nome = scanner.nextLine().toUpperCase();

            boolean encontrado = false;

            for (Livro titulo : acervo.getAcervo()) {
                if (nome.equals(titulo.getTitulo())) {
                    encontrado = true;
                    LivrosEmprestados.add(nome);
                    setQuantLivros();
                    LocalDate devolucao = hoje.plusDays(5);
                    System.out.println("Data de devolução: " + devolucao);
                    titulo.contadorExemplares(1);
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Livro não existe no acervo");
            }
        } else {
            System.out.println("Irregularidade no cadastro, verificar com gestor do sistema.");
        }
    }
}
