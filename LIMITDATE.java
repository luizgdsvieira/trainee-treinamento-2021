package br.com.infox.treinamento.trainee.concursolicitatorio;


/*
Mais uma vez a classe LIMITDATE, não diferente da classe CNPJ, define o Validator limitdate de forma geral 
em toda aplicação, além da JSF também.
*/


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
@Constraint(validatedBy = LimitdateValidator.class)
public @interface LIMITDATE {

	String message() default "formato inválido";
	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}