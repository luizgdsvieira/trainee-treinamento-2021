package br.com.infox.treinamento.trainee.pessoajuridica;


/*
Nesta classe bem simples, declaramos as variáveis que irão compor o registro da Pessoa Juridica
como mencionado e exigido na atividade. São elas, cnpj, nome e razão social. A princípio, só 
modifiquei o Tamanho da String de cnpj para 14, e adicionei logo abaixo os getters e setters da dessas variáveis. 
*/


import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class PessoaJuridica implements Serializable {
  
	private static final long serialVersionUID = 1L;
	
	@NotNull
    @Size(min = 14, max = 14)
	@CNPJ
    private String cnpj;
	
	@NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[^0-9]*", message = "Must not contain numbers")
    private String name;
	
	@NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[^0-9]*", message = "Must not contain numbers")
    private String socialreason;
    
    public String getCnpj() {
    	return cnpj;
    }
    
    public void setCnpj (String cnpj) {
    	this.cnpj = cnpj;
    }
	
    public String getName() {
    	return name;
    }
    
    public void setName (String name) {
    	this.name = name;
    }
    
    public String getSocialreason() {
    	return socialreason;
    }
    
    public void setSocialreason (String socialreason) {
    	this.socialreason = socialreason;
    } 
    
}

