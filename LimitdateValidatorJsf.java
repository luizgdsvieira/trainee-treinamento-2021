package br.com.infox.treinamento.trainee.concursolicitatorio;


/*
Implementação do JSF para utilizar a operação de validação na aplicação. 
*/


import java.util.Date;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


@FacesValidator("concursolicitatorio.LimitdateValidator")
public class LimitdateValidatorJsf implements Validator {
	private static final Logger LOG = Logger.getLogger("trainee.converters");
	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		try {
			LOG.info("Iniciando método validate de LimitdateValidator");
			Date limitdate = (Date) value;
			if (!LimitdateUtil.isValid(limitdate)) {
				throw new ValidatorException(new FacesMessage("DATA LIMITE inválida"));
			}
		} catch (Exception e) {
			throw new ValidatorException(new FacesMessage("DATA LIMITE inválida"), e);
		} finally {
			LOG.info("Encerrando método validate de LimitdateValidator");
		}
	}

}