package exercicio_pessoas_v2;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExercicioDatasetPessoas {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		DatasetPessoas datasetpessoas = new DatasetPessoas();
		String caminhoDoArquivo = "/home/fabio/ownCloud/IFF/Disciplinas/Nova Técnicas de Programação - BSI/workspaceTP4_18/Tp_Bsi_2021_2/src/exercicio_pessoas_v2/AgeDataset-V1.csv";
		VetorDePessoas listaDePessoas = datasetpessoas.lerDoArquivo(caminhoDoArquivo);
		System.out.printf("\nConteúdo do arquivo texto:\n");
		int numeroDoRegistro = 1;
		Pessoa pessoa = null;
		int totalDePessoas = listaDePessoas.obterTotalDePessoas();
		for (int numeroDaPessoa = 0; numeroDaPessoa < totalDePessoas; numeroDaPessoa++) {
			pessoa = listaDePessoas.obterPessoa(numeroDaPessoa);
			System.out.println("***Registro número: " + numeroDoRegistro + "***");
			System.out.println("Nome: " + pessoa.obterNome());
			System.out.println("Descrição: " + pessoa.obterDescricao());
			System.out.println("Gênero: " + pessoa.obterGenero());
			System.out.println("País: " + pessoa.obterPais());
			System.out.println("Ocupação:" + pessoa.obterOcupacao());
			System.out.println("Data de nascimento:" + pessoa.obterDataDeNacimento());
			System.out.println("Data de falecimento:" + pessoa.obterDataDeFalecimento() + "\n\n");
			numeroDoRegistro++;
		}
		System.out.println();
		datasetpessoas.escreverNoArquivo(caminhoDoArquivo + "alterado", listaDePessoas);
	}
}
