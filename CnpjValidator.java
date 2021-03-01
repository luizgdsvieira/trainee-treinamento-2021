package br.com.infox.treinamento.trainee.pessoajuridica;
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