package exercicio_pessoas_v2;

public class Pessoa {
	private String nome, descricao, genero, pais, ocupacao, dataDeNacimento, dataDeFalecimento;
	
	public Pessoa(String nome, String descricao, String genero, String pais, String ocupacao, String dataDeNacimento, String dataDeFalecimento) {
		this.nome = nome;
		this.descricao = descricao;
		this.genero = genero;
		this.pais = pais;
		this.ocupacao = ocupacao;
		this.dataDeNacimento = dataDeNacimento;
		this.dataDeFalecimento = dataDeFalecimento;		
	}

	public String obterNome() {
		return nome;
	}

	public void definirNome(String nome) {
		this.nome = nome;
	}

	public String obterDescricao() {
		return descricao;
	}

	public void definirDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String obterGenero() {
		return genero;
	}

	public void definirGenero(String genero) {
		this.genero = genero;
	}

	public String obterPais() {
		return pais;
	}

	public void definirPais(String pais) {
		this.pais = pais;
	}

	public String obterOcupacao() {
		return ocupacao;
	}

	public void definirOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}

	public String obterDataDeNacimento() {
		return dataDeNacimento;
	}

	public void definirDataDeNacimento(String dataDeNacimento) {
		this.dataDeNacimento = dataDeNacimento;
	}

	public String obterDataDeFalecimento() {
		return dataDeFalecimento;
	}

	public void definirDataDeFalecimento(String dataDeFalecimento) {
		this.dataDeFalecimento = dataDeFalecimento;
	}
}
