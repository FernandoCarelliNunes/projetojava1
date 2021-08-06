package curso.java.fernando;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	
	private int idade;
	
	private Date data_nascimento;
	private Date data_nascimento2;
		
	public Date getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome(){
		return nome;
		
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome(){
		return sobrenome;
		
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	

}
