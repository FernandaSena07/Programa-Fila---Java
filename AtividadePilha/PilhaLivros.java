package AtividadePilha;

import javax.swing.JOptionPane;

public class PilhaLivros <T>{
	private int tamanho; //informa que a variável tamanho é numeros inteiros. 
	private T[] livros;//informa que a variável é genérica.
	
	
	
	//Método construtor 
	public PilhaLivros (int quantidade) {
		this.livros = (T[]) new Object[quantidade]; //A pilha livros recebe uma nova pilha do tipo objeto com a quantidade 
		//recebida no parametro.
		this.tamanho=0; //informa que o tamanho incia no 0.
	}
	
	public PilhaLivros() {
		this(2);//informa que para a pilha livros é determinado 
	}
	
	//Método retornar tamanho
	public void retornarTamanho(){
		JOptionPane.showMessageDialog(null, "Quantidade de livros pilhados: " +
		this.tamanho);//Refere-se ao tamanho(Quantidade de livros que serão pilhados)
	}
	
	
	//Verifica se a pilha está vazia
	public boolean verificar() {
		return this.tamanho == 0; //Retorna verdadeiro caso o tamanho seja zero. 
	}
	
	
	//Método desempilhar
	public void desempilhar() {
		if(this.verificar()) {//caso a pilha esteja vazia:
			JOptionPane.showMessageDialog(null, "A pilha está vazia");
		} else {			
			this.tamanho--;//Indica que será removido um item da pilha.
			JOptionPane.showMessageDialog(null, "O livro removido é: "+
					this.livros[tamanho]);
		}
	}
	
	//Método Ver topo da pilha
	public void topo() {
		if(this.verificar()) {//caso a pilha esteja vazia:
			JOptionPane.showMessageDialog(null, "A pilha está vazia");
		} else {
			JOptionPane.showMessageDialog(null, "O livro do topo é: "+
			this.livros[tamanho-1]);//exibe o ultimo item inserido.
		}
	}
	
	//Método aumenta capacidade. Realizado de forma automática. 
	private void aumentaCapacidade() {
		if(this.tamanho == this.livros.length) {//Caso o tamanho da pilha seja igual a quantidade de itens inseridos:
			T[] novosLivros = (T[]) new Object[this.livros.length+1];//É criada uma nova pilha do mesmo tipo(Genérico).
			for(int i=0; i< this.livros.length; i++) {
				novosLivros[i] = this.livros[i];
			}//Para cada um dos itens que estão na pilha de livros, os mesmos são inseridos na pilha criada acima. 
			this.livros = novosLivros;
		}
	}
	
	// Método empilhar livros.
	public void empilhar(T livro) {
		this.aumentaCapacidade();
		if(this.tamanho < this.livros.length) {//Caso o tamanho da pilha seja menor que a quantidade de itens inseridos na pilha
			this.livros[this.tamanho] = livro;//É inserido um novo livro a pilha. 
			tamanho++;//"Auto incremento"
			//Dependendo do resultado da operação é exibido uma mensagem, seja de sucesso ou de erro.
			JOptionPane.showMessageDialog(null, "Adicionado com sucesso!");
		} else {			
			JOptionPane.showMessageDialog(null, "Não foi possível empilhar!");
		}
		
	}
	
	//Método para converter em texto
	public String toString() {
		StringBuilder retornoString = new StringBuilder();//É criado uma nova classe StringBuilder. 
		
		if (this.tamanho == 0) {//Se a pilha tiver um total de zero itens é exibida a mensagem a seguir:
			return "A pilha está vazia";
		} else {			
			for(int i = this.tamanho-1; i>-1; i--) {
				//Para cada item que estiver na pilha, ele é retornado e separado por uma quebra de linha
				retornoString.append(this.livros[i]);
				retornoString.append("\n");
			}
			return retornoString.toString();
		}
		
	}
	
}
