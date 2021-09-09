package atividadeNova;

public class Recepcionista {
	
	String nomePaciente, enderecoCliente;
	int idade, cpf, telefone;
	boolean horaMarcada;
	
	void marcarConsulta(){	
		System.out.print("Marquei sua consulta " +nomePaciente+ "...\n");
	}
	
	void removerConsulta(){	
		System.out.print("Removendo sua consulta " +nomePaciente+ "...\n");
	}
	
	void confirmarConsulta(){	
		System.out.print("Estou Confirmando sua consulta " +nomePaciente+ "...\n");
	}
	
}
