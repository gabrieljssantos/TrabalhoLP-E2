package atividadeNova;

public class AtendenteMedico {

	String nomePaciente, endereco, motivoConsulta;

	
	void descreverPaciente(){	
		System.out.print("O que voce esta sentindo " +nomePaciente+ "...\n");
	}
	
	void confirmarConsulta(){	
		System.out.print("Confirmando sua consulta " +nomePaciente+ "...\n");
	}
	
}
