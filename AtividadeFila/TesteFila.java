package Projeto_Fila;


import javax.swing.JOptionPane;

public class TesteFila {

	public static void main(String[] args) {
		FilaPessoa <String> pessoasFila = new FilaPessoa <>();
		int i = 1;
		String condicao;
		do {
			
			
		condicao = JOptionPane.showInputDialog(null,
				"Escolha uma opção:"
				+ "\n1 - Adicionar pessoa na fila"
				+ "\n2 - Retirar nome da fila"
				+ "\n3 - Ver tamanho da fila"
				+ "\n4 - Ver a primeira pessoa da fila"
				+ "\n5 - Visualizar fila"
				+ "\n0 - Encerrar programa"
			);
		
		// Condicional 1 - Adicionar nome de pessoa na fila
		if (condicao.equals("1")) {
		// Caso a opção selecionada seja 1, ou seja, "Adicionar pessoa na fila"
		// É solicitado o nome da pessoa que o usuário deseja inserir. 
			String nome = JOptionPane.showInputDialog("Digite o nome da "+ i + "° pessoa: ");	
						pessoasFila.enfileira(nome);//Adiciona a fila 
						
		i++;
		}
		// Condicional 2 - Retirar nome da fila
		else if (condicao.equals("2")) {
			pessoasFila.desenfileira();
		}
		
		
		// Condicional 3 - Retorna a quantidade de pessoas na fila.
		else if (condicao.equals("3")) {
			pessoasFila.retornarTamanho();
		}
		
		// Condicional 4 - Exibe o nome da primeira pessoa da fila.
		else if (condicao.equals("4")) {
			pessoasFila.espiar();
		}
		
		// Condicional 5 - Exibe os nomes das pessoas adicionadas a fila.
		else if (condicao.equals("5")) {
			JOptionPane.showMessageDialog(null, pessoasFila.toString());
		}
		
		// Caso não seja solicitado pelo usuário que o sistema realize uma operação inexistente ou da forma errada é exibida a mensagem:
		else if (condicao.equals("0")){
			JOptionPane.showMessageDialog(null, "Programa encerrado");
		}else {JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");}
			
		}while(!condicao.equals("0"));
		
	}

}
