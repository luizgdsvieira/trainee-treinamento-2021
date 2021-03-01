package br.com.infox.treinamento.trainee.pessoajuridica;

import java.util.List;

import javax.ejb.Local;

@Local
public interface PessoaJuridicaService {

	List<PessoaJuridica> recuperarPessoas();

	void registrar(PessoaJuridica novaPessoa);

	List<PessoaJuridica> recuperarPessoas(Integer offset, Integer limit);

	PessoaJuridica remover(Long idPessoa);

}