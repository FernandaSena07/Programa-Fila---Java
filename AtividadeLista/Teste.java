package AtividadeLista;

public class Teste {

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		//for (int i=1; i<=10; i++) {
		//		pilha.empilha(i);
		//	}
		//System.out.println(pilha);
		//System.out.println("Tamanho da Pilha: "+ pilha.tamanho());
		
		
		//verifica se a pilha está vazia
		System.out.println(pilha);
		System.out.println(pilha.estaVazia());
		pilha.empilha(1);
		System.out.println(pilha);
		System.out.println(pilha.estaVazia());
		
		
		//Informa o elemento do topo
		//System.out.println(pilha.topo());
		//System.out.println(pilha);
		//pilha.empilha(1);
		//pilha.empilha(2);
		//pilha.empilha(3);
		//System.out.println(pilha.topo());
		//System.out.println(pilha);
		
		
		
		//Desempilha
		//pilha.empilha(1);
		//pilha.empilha(2);
		//pilha.empilha(3);
		//System.out.println(pilha);
		//System.out.println("Desempilhar elemento " + pilha.desempilha());
		//System.out.println(pilha);
		
		
		
	}

}
