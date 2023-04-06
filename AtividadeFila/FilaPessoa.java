package Projeto_Fila;


import javax.swing.JOptionPane;

//Atividade com o tema "Dados de passageiros de um ônibus, excursão"

	public class FilaPessoa <P> {
		private P[] pessoas;//informa que a variável é genérica.
		private int tamanho;
		
		//Método construtor
		public FilaPessoa (int quantidade) {
			this.pessoas = (P[]) new Object[quantidade]; //A Fila pessoas recebe uma nova fila do tipo objeto com a quantidade 
			//recebida no parametro.
			this.tamanho=0; //informa que o tamanho incia no 0.
		}
		
		//Método construtor sem parâmetros, que invoca método construtor com parâmetros.
		public FilaPessoa() {
			this(0);
		}
		
		//Método retornar tamanho
		public void retornarTamanho(){
			JOptionPane.showMessageDialog(null, "Quantidade de pessoas na fila: " +
			this.tamanho);//Refere-se ao tamanho(Quantidade de pessoas que serão adicionados a fila)
		}
		
		//Método aumenta capacidade. Realizado de forma automática. 
		private void aumentaCapacidade() {
			if(this.tamanho == this.pessoas.length) {//Caso o tamanho da fila seja igual a quantidade de itens inseridos:
				P[] novosNomes = (P[]) new Object[this.pessoas.length+1];//É criada uma nova fila do mesmo tipo(Genérico).
				for(int i=0; i< this.pessoas.length; i++) {
					novosNomes[i] = this.pessoas[i];
				}//Para cada um dos itens que estão na fila de Pessoas, os mesmos são inseridos na fila criada acima. 
				this.pessoas = novosNomes;
			}
		}
		
		//Método enfileirar
		public void enfileira(P nomePessoa) {//Criação de uma variável interna. 
			this.aumentaCapacidade();
			if(this.tamanho < this.pessoas.length) {//Caso o tamanho da fila seja menor que a quantidade de nomes inseridos na fila
				this.pessoas[this.tamanho] = nomePessoa;//É inserido um novo nome a fila. 
				tamanho++;//"Auto incremento"
				//Dependendo do resultado da operação é exibido uma mensagem, seja de sucesso ou de erro.
				JOptionPane.showMessageDialog(null, "Adicionado com sucesso!");
			} else {			
				JOptionPane.showMessageDialog(null, "Não foi possível enfileirar!");
			}
		}
		
		//Método verificar tamanho da fila
		public boolean verificar() {
			return this.tamanho == 0; //Retorna verdadeiro caso o tamanho seja zero. 
		}
		
		//Método desenfileirar
		public void desenfileira() {
			if(this.verificar()) {//caso a fila esteja vazia:
				JOptionPane.showMessageDialog(null, "A fila está vazia");
			} else {
			
			final int posic = 0;
			
			P pessoa = pessoas[posic];

			for(int i = posic; i<tamanho-1; i++){
				pessoas[i] = pessoas[i+1];
			}
			tamanho--; 	//Indica que será removido um item da fila.
				JOptionPane.showMessageDialog(null, "Nome da pessoa que foi removida: "+
						pessoa);
				

			}
		}
		
		
		public void espiar() {
			if(this.verificar()) {//caso a pilha esteja vazia:
				JOptionPane.showMessageDialog(null, "A fila está vazia");
			}else {
				JOptionPane.showMessageDialog(null, "Primeira pessoa da fila: " + pessoas[0]); //Exibe a primeira pessoa da fila. 
			}
		}
		
		
		//Método para converter em texto
		public String toString() {
			StringBuilder retornoString = new StringBuilder();//É criado uma nova classe StringBuilder. 
			
			for(int i = 0; i< this.tamanho-1; i++) {
				//Para cada item que estiver na fila, ele é retornado e separado por uma quebra de linha
				retornoString.append(this.pessoas[i]);
				retornoString.append("\n");
			}
			if (this.tamanho > 0) {//Se a fila tiver um total de zero itens é exibida a mensagem a seguir:
				retornoString.append(this.pessoas[this.tamanho-1]);
			} 
			return retornoString.toString();
			
		}
}

		