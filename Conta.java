public class Conta {
	private int numero;
	private Cliente cliente;

public Conta(int numero, Cliente cliente){
	this.numero = numero;
	this.cliente = cliente;
	}

public int getNumero (){
	return this.numero;
	}
	
public Cliente getCliente(){
	return this.cliente;
	}	
	
public void setNumero(){
	this.numero = numero;
	}

public void setCliente(){
	this.cliente = cliente;
	}
	
}