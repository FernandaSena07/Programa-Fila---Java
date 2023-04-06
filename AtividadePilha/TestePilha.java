package AtividadePilha;

import javax.swing.JOptionPane;

public class TestePilha {

	public static void main(String[] args) {
		String condicao;
		
		PilhaLivros<String> pl = new PilhaLivros<String>();
		
		// Laço de repetição para as diferentes operações disponível para pilha
		do {
			condicao = JOptionPane.showInputDialog(null,
				"Escolha uma opção:"
				+ "\n1 - Adicionar a pilha"
				+ "\n2 - Retirar da pilha"
				+ "\n3 - Ver tamanho da pilha"
				+ "\n4 - Ver o último livro da pilha"
				+ "\n5 - Visualizar pilha"
			);
			
			// Condicional 1 - Adicionar a pilha
			if (condicao.equals("1")) {
				// Caso a opção selecionada seja 1, ou seja, "Adicionar a pilha"
				
				// É solicitado o noem do livro que o usuário deseja inserir. 
				String livro = JOptionPane.showInputDialog("Digite o nome do livro: ");
				pl.empilhar(livro);//Adiciona a pilha 
			}
			
			// Condicional 2 - desempilha um item.
			else if (condicao.equals("2")) {
				pl.desempilhar();
			}
			
			// Condicional 3 - Retorna a quantidade de itens adicionado a pilha.
			else if (condicao.equals("3")) {
				pl.retornarTamanho();
			}
			
			// Condicional 4 - Exibe o item que foi adicionado primeiro(o último item da pilha)
			else if (condicao.equals("4")) {
				pl.topo();
			}
			
			// Condicional 5 - Exibe os itens da pilha.
			else if (condicao.equals("5")) {
				JOptionPane.showMessageDialog(null, pl.toString());
			}
			
			// Caso não seja solicitado pelo usuário que o sistema realize uma operação inexistente ou da forma errada é exibida a mensagem:
			else {
				JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
			}
		//Para o usuário finalizar o programa, ele deve digitar o numero zero. 
		}while(!condicao.equals("0"));
	}

}
