package br.com.infox.treinamento.trainee.concursolicitatorio;


/*
Classe de inicialização do Serviço.

*/


import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;

import org.jboss.logging.Logger;


@ManagedBean
@RequestScoped
public class ConcursoLicitatorioControllerJSF {
	
	private static final Logger LOG = Logger.getLogger("trainee.member");
	
	private ConcursoLicitatorio novaPessoa;
	
	@PostConstruct
	public void init() {
		this.novaPessoa = new ConcursoLicitatorio();		
	}
	
	public void registrar() {
		LOG.info("NOME => "+this.novaPessoa.getName());
		LOG.info("DESCRIÇÃO => "+this.novaPessoa.getDescricao());
		LOG.info("DATA => "+this.novaPessoa.getDatadisponivel());
		LOG.info("DATA LIMITE => "+this.novaPessoa.getLimitdata());
		LOG.info("QUANTIDADE => "+this.novaPessoa.getQuantidade());
		
	}
	
	public ConcursoLicitatorio getNovaPessoa() {
		return novaPessoa;
	}
	
}