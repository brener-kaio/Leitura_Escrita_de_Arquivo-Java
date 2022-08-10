package exercicio_pessoas_v2;

public class VetorDePessoas{
	private Pessoa listaDePessoas[];
	private int totalDePessoas;

	public VetorDePessoas() {
		this.listaDePessoas = new Pessoa[1094379];
		this.totalDePessoas = 0;
	}
	
	public VetorDePessoas(int tamanhoMaximoDaLista) {
		this.listaDePessoas = new Pessoa[tamanhoMaximoDaLista];
		this.totalDePessoas = 0;
	}
	
	
	public void adicionarPessoa(Pessoa pessoa) {
		this.listaDePessoas[totalDePessoas] = pessoa;
		this.totalDePessoas++;
	}
	
	public boolean excluirPessoa() {
		if (this.totalDePessoas > 0) {
			this.totalDePessoas--;
			return true;
		}
		return false;
	}
	
	public Pessoa obterPessoa(int indiceDaPessoa) {
		return this.listaDePessoas[indiceDaPessoa];
	}
	
	public int obterTotalDePessoas() {
		return this.totalDePessoas;
	}
}
