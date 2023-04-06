package AtividadeGrafo;

public class ExemploGrafo {

	public static void main(String[] args) {
		Grafo<String> grafo = new Grafo<String>();
		grafo.adicionaVertice("Torre Central");
		grafo.adicionaVertice("Torre G9IR-Região Itaim Paulista");
		grafo.adicionaVertice("Torre K5LT-Região São Miguel");
		grafo.adicionaVertice("Torre J8NT-Região Ferraz de Vasconcelos");
		grafo.adicionaVertice("Torre F2TW-Região Poá");
		grafo.adicionaVertice("Torre K3ML-Região Kemel Addas");
		
		
		grafo.adicionaAresta(2.0, "Torre Central", "Torre G9IR-Região Itaim Paulista");
		grafo.adicionaAresta(3.0, "Torre Central", "Torre K3ML-Região Kemel Addas");
		grafo.adicionaAresta(1.0, "Torre Central", "Torre F2TW-Região Poá");
		grafo.adicionaAresta(1.0, "Torre Central", "Torre K5LT-Região São Miguel");
		grafo.adicionaAresta(2.0, "Torre Central", "Torre J8NT-Região Ferraz de Vasconcelos");
		grafo.adicionaAresta(3.0, "Torre G9IR-Região Itaim Paulista", "Torre Central");
		grafo.adicionaAresta(3.0, "Torre K3ML-Região Kemel Addas", "Torre Central");
		grafo.adicionaAresta(3.0, "Torre F2TW-Região Poá", "Torre Central");
		grafo.adicionaAresta(3.0, "Torre K5LT-Região São Miguel", "Torre Central");
		grafo.adicionaAresta(3.0, "Torre J8NT-Região Ferraz de Vasconcelos", "Torre Central");
		
		
		grafo.BuscaEmLargura();
		
	}

}
