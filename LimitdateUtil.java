package br.com.infox.treinamento.trainee.concursolicitatorio;

/*
A classe utilitária serve para novamente para definir se a data retornada é válida ou não, e 
se atende as formatações, além do a exigência em não ser menor ou igual á data disponível.
Eu utilizei o método Compare e before para comparar as duas datas e informa "OK" em caso da data
usada estar correta e "Inválida" em caso de não atender as exigências. O Uso da importação Calendar serve para 
utilizar a data atual do computador como comparação.
*/


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class LimitdateUtil extends ConcursoLicitatorio  {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Calendar datadisponivel = Calendar.getInstance(); 
	Calendar limitdate = Calendar.getInstance(); 
	
	
	public boolean Compare() {
		if (datadisponivel.before(limitdate)) {
			System.out.println("Data informada Ok: " );
			return true;
		}
		else {
			System.out.println("Data informada inválida: ");
			return false;		
		}
	};	
		
	public static boolean isValid(Date value) {		
			return false;
		}
		
  }

