package br.com.infox.treinamento.trainee.pessoajuridica;


/*
Nesta classe de validação, inicializamos a validação do cnpj, com o intuito de confirmar 
se ele está ativo e de acordo com o que o sistema exige. A boolean isValid serve para retornar true
caso a String value esteja nula e logo após retorna o value implementado na classe CnpjUtil do mesmo pacote. 
*/


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.hibernate.validator.constraints.br.CNPJ;


public class CnpjValidator implements ConstraintValidator<CNPJ, String> {

		@Override
		public void initialize(CNPJ constraintAnnotation) {
		}

		@Override
		public boolean isValid(String value, ConstraintValidatorContext context) {
			if (value == null) {
				return true;
			}
			return CnpjUtil.isValid(value);
		}

}