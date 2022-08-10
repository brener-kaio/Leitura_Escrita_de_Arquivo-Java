package exercicio_pessoas_v2;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DatasetPessoas {
	public VetorDePessoas lerDoArquivo(String caminhoDoArquivo) throws FileNotFoundException, IOException {
		FileReader fluxoDeLeituraDeArquivoTexto = new FileReader(caminhoDoArquivo);
		BufferedReader leituraBufferizada = new BufferedReader(fluxoDeLeituraDeArquivoTexto);
		String linhaLidaDoArquivo = leituraBufferizada.readLine();
		String listaDeCampos[];
		
		VetorDePessoas listaDePessoas = new VetorDePessoas();
		Pessoa pessoa = null;
		int numeroPessoa = 0;
		while (linhaLidaDoArquivo != null) {		
			listaDeCampos = linhaLidaDoArquivo.split(",");
			if (listaDeCampos.length == 10) {
				pessoa = new Pessoa(listaDeCampos[1],listaDeCampos[2],listaDeCampos[3],listaDeCampos[4],listaDeCampos[5],listaDeCampos[6],listaDeCampos[7]);
				listaDePessoas.adicionarPessoa(pessoa);
			}
			linhaLidaDoArquivo = leituraBufferizada.readLine(); 
		}
		fluxoDeLeituraDeArquivoTexto.close();
		return listaDePessoas;
	}

	public void escreverNoArquivo(String caminhoDoArquivo, VetorDePessoas listaDePessoas) throws IOException {
		 FileWriter fluxoDeEscritaDeArquivoTexto = new FileWriter(caminhoDoArquivo, false);
		 int totalDePessoas = listaDePessoas.obterTotalDePessoas();
		 Pessoa pessoa = null;
		 for (int numeroDaPessoa = 0; numeroDaPessoa < listaDePessoas.obterTotalDePessoas(); numeroDaPessoa++) {
			 pessoa = listaDePessoas.obterPessoa(numeroDaPessoa);
			 fluxoDeEscritaDeArquivoTexto.write(pessoa.obterNome() + ",");
			 fluxoDeEscritaDeArquivoTexto.write(pessoa.obterDescricao() + ",");
			 fluxoDeEscritaDeArquivoTexto.write(pessoa.obterGenero() + ",");
			 fluxoDeEscritaDeArquivoTexto.write(pessoa.obterPais() + ",");
			 fluxoDeEscritaDeArquivoTexto.write(pessoa.obterOcupacao() + ",");
			 fluxoDeEscritaDeArquivoTexto.write(pessoa.obterDataDeNacimento() + ",");
			 fluxoDeEscritaDeArquivoTexto.write(pessoa.obterDataDeFalecimento());
			 fluxoDeEscritaDeArquivoTexto.write("\n");			 
		 }
		 fluxoDeEscritaDeArquivoTexto.flush();
		 fluxoDeEscritaDeArquivoTexto.close();
	}
}
