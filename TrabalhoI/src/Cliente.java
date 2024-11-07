import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nome;
	String CPF;
	double multa;
	List<String> LivrosEmprestados = new ArrayList<>();
	TipoCliente tipo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public double getMulta() {
		return multa;
	}
	public void setMulta(double multa) {
		this.multa = multa;
	}
	public List<String> getLivrosEmprestados() {
		return LivrosEmprestados;
	}
	public void setLivrosEmprestados(List<String> livrosEmprestados) {
		LivrosEmprestados = livrosEmprestados;
	}
	public TipoCliente getTipo() {
		return tipo;
	}
	


}
