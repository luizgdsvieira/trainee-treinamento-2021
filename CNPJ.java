package br.com.infox.treinamento.trainee.pessoajuridica;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD, PARAMETER })
@Constraint(validatedBy = CnpjValidator.class)
public @interface CNPJ {

	String message() default "formato inválido";
	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}