import javax.swing.JOptionPane;

public class Banco{

	public static void main (String args[]){

	Cliente cliente1;
	Conta conta1;
	
	String nome = JOptionPane.showInputDialog("Digite o nome");
	String cpf = JOptionPane.showInputDialog("Digite o cpf");

	cliente1 = new Cliente (nome, cpf);
	JOptionPane.showMessageDialog(null, cliente1.getCpf() + " " + cliente1.getNome());
	
	//String aux = JOptionPane.showInputDialog("Digite o numero de Conta");
	//int numero = Integer.parseInt(aux); 
	
	int numero = Integer.parseInt( JOptionPane.showInputDialog("Digite o numero de Conta"));
	conta1 = new Conta (numero, cliente1);
	
	JOptionPane.showMessageDialog(null, "O numero da conta = " + conta1.getNumero() + "\ncliente:\nnome " +
	conta1.getCliente().getNome() + "\ncpf: " + conta1.getCliente().getCpf() );

	}

}