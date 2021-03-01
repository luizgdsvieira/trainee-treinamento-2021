package br.com.infox.treinamento.trainee.pessoajuridica;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.naming.InitialContext;
import javax.naming.NamingException;

@ManagedBean
@ViewScoped
public class PessoaJuridicaControllerJSF implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Logger LOG = Logger.getLogger("trainee.member");

	@EJB
	private PessoaJuridicaService pessoaJuridicaService;

	private PessoaJuridica novaPessoa;

	private List<PessoaJuridica> pessoas;

	@PostConstruct
	public void init() {
		LOG.info("PostConstruct PessoaJuridicaControllerJSF");
		novoCadastro();
		pessoas = getPessoaJuridicaService().recuperarPessoas();
	}
	@PreDestroy
	public void destroy() {
		LOG.info("PreDestroy PessoaJuridicaControllerJSF");
	}

	public void registrar() {
		pessoaJuridicaService.registrar(getNovaPessoa());
		pessoas = pessoaJuridicaService.recuperarPessoas();
		novoCadastro();
	}

	private PessoaJuridicaService getPessoaJuridicaService() {
		try {
			InitialContext initialContext = new InitialContext();
			PessoaJuridicaService lookup = (PessoaJuridicaService) initialContext.lookup("java:module/PessoaFisicaStatelessEJB");
			return lookup;
		} catch (NamingException e) {
			throw new IllegalStateException(e);
		}
	}

	private void novoCadastro() {
		this.novaPessoa = new PessoaJuridica();
	}

	public PessoaJuridica getNovaPessoa() {
		return novaPessoa;
	}

	public List<PessoaJuridica> getPessoas() {
		return pessoas;
	}

}