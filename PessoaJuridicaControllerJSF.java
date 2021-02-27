package br.com.infox.treinamento.trainee.pessoajuridica;

/*
Essa classe é responsável pela invocação do serviço de aplicação, para que haja atualizações,
inserções de novas variáveis e definicição do que a aplicação fará em sí. 
*/


import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;

import org.jboss.logging.Logger;


@ManagedBean
@RequestScoped
public class PessoaJuridicaControllerJSF {
	
	private static final Logger LOG = Logger.getLogger("trainee.member");
	
	private PessoaJuridica novaPessoa;
	
	@PostConstruct
	public void init() {
		this.novaPessoa = new PessoaJuridica();		
	}
	
	// registro das opções de cadastro: Nome ou Nome Fantasia, Razão Social e CNPJ.
	public void registrar() {
		LOG.info("NOME FANTASIA => "+this.novaPessoa.getName());
		LOG.info("RAZÃO SOCIAL => "+this.novaPessoa.getSocialreason());
		LOG.info("CNPJ => "+this.novaPessoa.getCnpj());
		
	}
	
	public PessoaJuridica getNovaPessoa() {
		return novaPessoa;
	}
	
}
