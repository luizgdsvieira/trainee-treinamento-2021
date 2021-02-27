package br.com.infox.treinamento.trainee.concursolicitatorio;


/*
Mesma coisa do pacote PessoaJuridica, apenas declarando as variáveis. Neste caso, são elas:
Nome, Descricao, Data Disponível, Data limite e quantidade. Importe a classe Date para realizar as operações
com as datas, especificamente com a Data Limite, que exige um validator. 
*/


import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/*
import br.com.infox.treinamento.trainee.concursolicitatorio.NAME; //Limited Date
*/

public class ConcursoLicitatorio {

		@NotNull
	    @Size(min = 1, max = 25)
	    @Pattern(regexp = "[^0-9]*", message = "Must not contain numbers")
	    private String name;
		
		@NotNull
	    @Size(min = 1, max = 100)
	    @Pattern(regexp = "[^0-9]*", message = "Must contain numbers or not")
	    private String descricao;
		
		@NotNull
		@Column(name = "dt_date")
		private Date datadisponivel;
		
		@NotNull
		@Column(name = "dt_birth_date")
		private Date limitdata;
		
		@NotNull
	    @Size(min = 14, max = 14)
		@Pattern(regexp = "[^0-9]*", message = "Must contain only numbers")
	    private String quantidade;		
	
		
	    public String getName() {
	    	return name;
	    }
	    
	    public void setName (String name) {
	    	this.name = name;
	    }
	    
	    public String getDescricao() {
	    	return descricao;
	    }
	    
	    public void setDescricao (String descricao) {
	    	this.descricao = descricao;
	    }
	    
	    public Date getDatadisponivel() {
	    	return datadisponivel;
	    }
	    
	    public void setDatadisponivel (Date datadisponivel) {
	    	this.datadisponivel = datadisponivel;
	    }
	    
	    public Date getLimitdata() {
	    	return limitdata;
	    }
	    
	    public void setLimitdata (Date limitdata) {
	    	this.limitdata = limitdata;
	    }
	    
	    public String getQuantidade() {
	    	return quantidade;
	    }
	    
	    public void setQuantidade (String quantidade) {
	    	this.quantidade = quantidade;
	    }
	    
}
