package atividadeNova;

public class Teste {

	public static void main(String[] args) {
		
		Recepcionista recepcionista1 = new Recepcionista();
		AtendenteMedico atendenteMedico1 = new AtendenteMedico();
		Medico medico1 = new Medico();
		
		recepcionista1.nomePaciente = "Francisco";
		recepcionista1.idade = 44;
		recepcionista1.horaMarcada = true;
		
		atendenteMedico1.nomePaciente = "Francisco";
		atendenteMedico1.motivoConsulta = "Dor na coluna";
		
		medico1.nomePaciente = "Francisco";
		medico1.receitouRemedio = true;
		
		
		recepcionista1.confirmarConsulta();
		
		atendenteMedico1.descreverPaciente();
		medico1.chamarPaciente();
		
	}

}
