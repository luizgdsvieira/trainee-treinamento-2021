package br.com.infox.treinamento.trainee.pessoajuridica;

import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


@FacesValidator("pessoafisica.CnpjValidator")
public class CnpjValidatorJsf implements Validator {
	private static final Logger LOG = Logger.getLogger("trainee.converters");
	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		try {
			LOG.info("Iniciando método validate de CnpjValidator");
			String cnpj = (String) value;
			if (!CnpjUtil.isValid(cnpj)) {
				throw new ValidatorException(new FacesMessage("CNPJ inválido. Dígitos verificadores inválidos"));
			}
		} catch (Exception e) {
			throw new ValidatorException(new FacesMessage("CNPJ inválido"), e);
		} finally {
			LOG.info("Encerrando método validate de CnpjValidator");
		}
	}

}