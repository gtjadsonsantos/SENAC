package provaPOO;

public class Executavel {

	public static void main(String[] args) {
		
		// Paciente 1	
		Endereco endereco1 = new Endereco("RUA  DOS CHAGADOS",100,"BARREIROS","SÃO JOSÉ");
		Paciente paciente1 = new Paciente("BOB MARLEY",36,'M',endereco1);
		Doenca doenca1 =  new Doenca("COVID-19", false, true);
		
		// Paciente 2
		
		Endereco endereco2 = new Endereco("RUA  DOS FERIDOS",200,"INGLESES","FLORIANOPOLIS");
		Paciente paciente2 = new Paciente("AMY WINEHOUSE",27,'F',endereco2);
		Doenca doenca2 =  new Doenca("PNEUMONIA", true, false);

		// Paciente 3
		
		Endereco endereco3 = new Endereco("RUA  DOS MACHUCADOS",300,"COQUEIROS","FLORIANOPOLIS");
		Paciente paciente3 = new Paciente("WHITNEY HOUSTON",48,'F',endereco3);
		Doenca doenca3 =  new Doenca("H1N1", true, true);

		
		// Paciente 4
		
		Endereco endereco4 = new Endereco("RUA  DOS QUEBRADOS",400,"CENTRO","BIGUAÇU");
		Paciente paciente4 = new Paciente("MICHAEL JACKSON",50,'M',endereco4);
		Doenca doenca4 =  new Doenca("PNEUMONIA", true, false);

		
		// Paciente 5
		
		Endereco endereco5 = new Endereco("RUA  DOS ARRANHADOS",500,"ESTREITO","FLORIANOPOLIS");
		Paciente paciente5 = new Paciente("JANIS JOPLIN",27,'F',endereco5);
		Doenca doenca5 =  new Doenca("COVID-19", false, true);

		// Paciente 6
		
		Endereco endereco6 = new Endereco("RUA  DOS ESFOLADOS",600,"ARIRIU","PALHOÇA");
		Paciente paciente6 = new Paciente("MARIE FREDRIKSSON",61,'F',endereco6);
		Doenca doenca6 =  new Doenca("COVID-19", false, true);

		// Medico 1
		
		Endereco endereco7 = new Endereco("RUA  DOS MÉDICOS",700,"INGLESES","FLORIANOPOLIS");
		Medico medico1 = new Medico("BOB DYLAN",79,'M',endereco7);
		
		// Medico 2
		
		Endereco endereco8 = new Endereco("RUA  DA MEDICINA",800,"CAMPINAS","SÃO JOSÉ");
		Medico medico2 = new Medico("JIMI HENDRIX",27,'M',endereco8);
			
		// Enfermeiro 1
		
		Endereco endereco9 = new Endereco("RUA  DOS ENFERMEIROS",800,"KOBRASOL","SÃO JOSÉ");
		Enfermeiro enfermeiro1 = new Enfermeiro("JOHN LENNON",40,'M',endereco9);
		
		
	// Enfermeiro 2
		
		Endereco endereco10 = new Endereco("RUA  DA DA ENFERMARIA",800,"TRINDADE","FLORIANOPOLIS");
		Enfermeiro enfermeiro2 = new Enfermeiro("ARETHA FRANKLIN",76,'F',endereco10);
		
		// Caso1 
		
		Caso caso1 = new Caso(paciente1, medico1, enfermeiro1, doenca1);	
		Caso caso2 = new Caso(paciente2, medico2, enfermeiro2, doenca2);	
		Caso caso3 = new Caso(paciente3, medico1, enfermeiro1, doenca3);	
		Caso caso4 = new Caso(paciente4, medico2, enfermeiro2, doenca4);	
		Caso caso5 = new Caso(paciente5, medico1, enfermeiro1, doenca5);	
		Caso caso6 = new Caso(paciente6, medico2, enfermeiro2, doenca6);	

		
		//  Hospital
		Endereco endereco11 = new Endereco("RUA  DOHOSPITAL", 1100, "BARREIROS", "SÃO JOSÉ");
		
		Caso[] casosArray = {caso1, caso2,caso3,caso4,caso5,caso6};
		
		Hospital hospital = new Hospital("UNIMED", endereco11, casosArray);
		
		System.out.println("O hospital " + hospital.getNome() + " tem " + hospital.getCasos().length  + " caso de doenças");
		
		int qtdsexof = 0;
		
		for (int i = 0; i < hospital.getCasos().length; i++) {
			
			if (hospital.getCasos()[i].getPaciente().getSexo() == 'F' ) {
				qtdsexof++;
			}
		}
		
		System.out.println("O hospital " + hospital.getNome() + " tem " + qtdsexof  + " pacientes de sexo feminino");
		
		
		int menoridademedico = 0;
		int indexOFmenoridade = 0;

		for (int i = 0; i < hospital.getCasos().length; i++) {
			
			if ( i == 0 ) {
				menoridademedico = hospital.getCasos()[i].getMedico().getIdade() ;
			}
			
			
			if( hospital.getCasos()[i].getMedico().getIdade() < menoridademedico  ) {
				menoridademedico = hospital.getCasos()[i].getMedico().getIdade();
				indexOFmenoridade = i;
			} 
		}
		
		
		System.out.println("Dados do médico mais novo : " + hospital.getCasos()[indexOFmenoridade].getMedico().toString() );
		
		
		
		int menoridadeenfermeiro = 0;
		int indexOFmenoridadeenfermeiro = 0;

		for (int i = 0; i < hospital.getCasos().length; i++) {
			
			if ( i == 0 ) {
				menoridadeenfermeiro = hospital.getCasos()[i].getEnfermeiro().getIdade() ;
			}
			
			
			if( hospital.getCasos()[i].getEnfermeiro().getIdade() > menoridadeenfermeiro  ) {
				menoridadeenfermeiro = hospital.getCasos()[i].getEnfermeiro().getIdade();
				indexOFmenoridadeenfermeiro = i;
			} 
		}
		
		
		System.out.println("Dados do enfermeiro mais velho : " + hospital.getCasos()[indexOFmenoridadeenfermeiro].getEnfermeiro().toString() );
		
		hospital.buscaDoencasPacientes("PNEUMONIA");
		
		hospital.buscaBairroPacientes("BARREIROS");
		
		
		
		
	}
}
