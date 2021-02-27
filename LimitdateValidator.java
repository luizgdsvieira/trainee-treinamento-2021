package br.com.infox.treinamento.trainee.concursolicitatorio;


/*
Classe de validação da variável Data Limite. Como pedido na atividade, a validação exige que a data limite
não seja igual ou anterior a data disponível. 
*/ 


import java.util.Date;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/*
import org.hibernate.validator.constraints.br.LIMITDATE;
*/

import br.com.infox.treinamento.trainee.concursolicitatorio.LimitdateUtil;

public class LimitdateValidator implements ConstraintValidator<LIMITDATE, String>{
	
	@Override
	public void initialize(LIMITDATE constraintAnnotation) {
	}

	public boolean isValid(Date value, ConstraintValidatorContext context) {
		if (value == null) {
			return true;
		}
		return LimitdateUtil.isValid(value);
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return false;
	}

}
