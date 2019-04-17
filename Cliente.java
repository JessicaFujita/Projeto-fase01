/*Composição de Objetos

Cliente                         Conta
-nome    1..1           0..1    -numero
-CPF    ______________________

*/

public class Cliente{
	private String nome;
	private String cpf;
	
	
	public Cliente(String nome, String cpf){
	this.nome = nome;
	this.cpf  = cpf;
	
	}
	public String getCpf (){
	return this.cpf;
	}
	
	public String getNome (){
	return this.nome;
	}
	
	public void setNome(){
		this.nome = nome;
	}
	
	public void setCpf(){
		this.cpf = cpf;
	}
}