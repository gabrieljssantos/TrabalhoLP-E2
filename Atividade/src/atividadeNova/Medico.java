package atividadeNova;

public class Medico {

	String nomePaciente, endereco;
	int idade, sexo;
	boolean receitouRemedio;
	
	void chamarPaciente(){	
		System.out.print("Pode vir " +nomePaciente+ "...\n");
	}
	
	void pedirSintomas(){	
		System.out.print("Me diga o que esta sentindo " +nomePaciente+ "...\n");
	}
	
	void receitarRemedio(){	
		System.out.print("Voce precisa tomar os seguintes remedios " +nomePaciente+ "...\n");
	}
	
}
