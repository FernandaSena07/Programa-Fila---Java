package ProjetoListaCompras;

import java.util.ArrayList; //Importação da classe arrayList

import javax.swing.JOptionPane; //Importação da classe JOptionPane.

public class EstoqueLoja {
	
	public static void main(String[] args) {
		// Criação das Variáveis de Vetores para os Tipos 'String' e 'Double'
		ArrayList<String> arrayListNome = new ArrayList<String>(); 
		ArrayList<Double> arrayListPreco = new ArrayList<Double>(); 
		
		// Criação das variáveis de auxílio para leitura de valores, textos e números inteiros na aplicação
		String nome, novoNome;
		double preco, novoPreco;
		String variavelCondicao;
		String condicao;
		int posicao;

		// Laço de repetição que é executando enquanto a opção selecionada for diferente de '0 - Sair'
		do {
			// Leitura da 'condicao', referente às opções disponíveis de execução
			condicao = JOptionPane.showInputDialog(null, "Escolha uma das opções:"
			+ "\n1 - Adicionar item e valor"
			+ "\n2 - Adicionar item e valor em uma posição específica"
			+ "\n3 - Alterar nome de um item"
			+ "\n4 - Alterar valor do item"
			+ "\n5 - Verificar existencia de Item."
			+ "\n6 - Remover item"
			+ "\n7 - Visualizar Itens e Valores"
			+ "\n8 - Quantidade de itens"
			+ "\n0 - Sair");
			
			
			// Condicional 1 - Adicionar item e valor
			if(condicao.equals("1")) {
				// Caso a opção que o usuário selecionou seja a '1', ou seja, 'Adicionar item e valor'
				// É criado um laço de repetição 'do-while'
				do {
				// Onde são lidos o nome e o preço do produto a ser adicionado
					nome = JOptionPane.showInputDialog(null, "Digite o nome do item a ser adicionado: "); 
					arrayListNome.add(nome);
					preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço do produto:"));
					arrayListPreco.add(preco);
					 
					// Em seguida, é exibida uma mensagem de sucesso
					JOptionPane.showMessageDialog(null, "Adicionado com sucesso");
					
			 		do {
			 		// Logo após, outro laço de repetição é criado para a verificação de uma condicional, caso o usuário deseje adicionar mais valores
					// Caso ele opte por adicionar mais valores, então, o processo é repetido, caso contrário, é exibido a primeira caixa de diálogo
					 	variavelCondicao = JOptionPane.showInputDialog(null,
							"Deseja inserir mais algum item?"
							+ "\n1 - Sim"
							+ "\n0 - Não");
				 
					 		//Caso o usuário tente executar uma opção inexistente, é exibido uma mensagem de erro.
					 		if(!(variavelCondicao.equals("1") || variavelCondicao.equals("0")))
					 			JOptionPane.showMessageDialog(null, "Operação inválida, tente novamente!");
					 		
			 		} while (!(variavelCondicao.equals("1") || variavelCondicao.equals("0")));
				 }while (!(variavelCondicao.equals("0")));
			}
			

			// Condicional 2 - Adiciona item e valor em uma posição específica.
			else if(condicao.equals("2")){
				// Caso a opção que o usuário selecionou seja a '2', ou seja, 'Adicionar item e valor em uma posição específica'
				// É criado um laço de repetição 'do-while'
				do {
					// Onde são lidos posição, nome e preço do produto a ser adicionado
					posicao =  Integer.parseInt( JOptionPane.showInputDialog(null, "Digite a posição em que será inserido o nome do item: ")); 
					nome = JOptionPane.showInputDialog(null, "Digite o nome do produto:");
					preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do item: "));
					
					// Bloco de Try-Catch, para a Exceção de Erros
					try {
						// Tenta adicionar um novo item baseado nas informações que o usuário inserir
						arrayListNome.add(posicao, nome);
						arrayListPreco.add(posicao, preco);
					} catch (Exception e) {
						// Caso não seja executado com sucesso, é exibida uma mensagem de erro
						JOptionPane.showMessageDialog(null, "Não foi possível adicionar o "+ nome +" na posição desejada.");
					}
				 
					do {
				 		// Logo após, outro laço de repetição é criado para a verificação de uma condicional, caso o usuário deseje adicionar mais valores
						// Caso ele opte por adicionar mais valores, então, o processo é repetido, caso contrário, é exibido a primeira caixa de diálogo
						variavelCondicao = JOptionPane.showInputDialog(null,
							"Deseja inserir mais algum item?"
							+ "\n1 - Sim"
							+ "\n0 - Não");
				 
						// Caso o usuário tente executar uma opção inexistente, é exibido uma mensagem de erro.
					 	if(!(variavelCondicao.equals("1") || variavelCondicao.equals("0")))
				 			JOptionPane.showMessageDialog(null, "Operação inválida, tente novamente!");
				 		
					} while (!(variavelCondicao.equals("1") || variavelCondicao.equals("0")));
				} while (!(variavelCondicao.equals("0")));
			}
			
			// Condicional 3 - Alterar nome de um item no vetor nome
			else if(condicao.equals("3")){
				// Caso a opção que o usuário selecionou seja a '3', ou seja, 'Alterar nome de um item no vetor nome'
				// É criado um laço de repetição 'do-while'
				do {
					// Onde é lido o nome do item a ser alterado
					nome = JOptionPane.showInputDialog(null, "Digite o nome do item a ser alterado: ");
					
						if (arrayListNome.contains(nome)) {
							// Caso o produto exista no vetor
							// É solicitado um novo nome ao produto
							novoNome = JOptionPane.showInputDialog(null, "Digite o novo nome do item: ");
							
							// E o mesmo é atualizado no vetor
							arrayListNome.set(arrayListNome.indexOf(nome), novoNome);
						}
						
						// Logo após, outro laço de repetição é criado para a verificação de uma condicional, caso o usuário deseje adicionar mais valores
						// Caso ele opte por adicionar mais valores, então, o processo é repetido, caso contrário, é exibido a primeira caixa de diálogo
						do {
							variavelCondicao = JOptionPane.showInputDialog(null,
									"Deseja inserir mais algum item?"
											+ "\n1 - Sim"
											+ "\n0 - Não");
							// Caso o usuário tente executar uma opção inexistente, é exibido uma mensagem de erro.
							if(!(variavelCondicao.equals("1") || variavelCondicao.equals("0")))
					 			JOptionPane.showMessageDialog(null, "Operação inválida, tente novamente!");
					 		
						} while (!(variavelCondicao.equals("1") || variavelCondicao.equals("0")));
				}while (!(variavelCondicao.equals("0")));
			}
			
			// Condicional 4 - Alterar valor no vetor preço
			else if(condicao.equals("4")){
				// Caso a opção que o usuário selecionou seja a '4', ou seja, 'Alterar valor no vetor preço'
				// É criado um laço de repetição 'do-while'
				do {
					// Onde é lido o nome do item a ser alterado
					nome = JOptionPane.showInputDialog(null, "Digite o nome do item a ser alterado: ");
					
					if (arrayListNome.contains(nome)) {
						// Caso o produto exista, é exibido o nome e preço atual do item
						// E é solicitado o novo preço a ser inserido
						novoPreco = Double.parseDouble( JOptionPane.showInputDialog(null, "Preço atual do " + nome 
								+"\nR$"+arrayListPreco.get(arrayListNome.indexOf(nome))
								+"\n\nInsira novo preço do item: "));
						
						// E o preço é atualizado no vetor
						arrayListPreco.set(arrayListNome.indexOf(nome), novoPreco);
					}
				
					do {
						// Logo após, outro laço de repetição é criado para a verificação de uma condicional, caso o usuário deseje adicionar mais valores
						// Caso ele opte por adicionar mais valores, então, o processo é repetido, caso contrário, é exibido a primeira caixa de diálogo
						variavelCondicao = JOptionPane.showInputDialog(null,
								"Deseja inserir mais algum item?"
										+ "\n1 - Sim"
										+ "\n0 - Não");
						
						// Caso o usuário tente executar uma opção inexistente, é exibido uma mensagem de erro.
						if(!(variavelCondicao.equals("1") || variavelCondicao.equals("0")))
				 			JOptionPane.showMessageDialog(null, "Operação inválida, tente novamente!");
				 		
					} while (!(variavelCondicao.equals("1") || variavelCondicao.equals("0")));
				}while (!(variavelCondicao.equals("0")));
			}
			
			
			// Condicional 5 - Verificação de existencia de Item no vetor.
			else if(condicao.equals("5")){
				// Caso a opção que o usuário selecionou seja a '5', ou seja, 'Alterar valor no vetor preço'
				// É criado um laço de repetição 'do-while'
				do {
					// Onde é lido o nome do item a ser pesquisado
					nome = JOptionPane.showInputDialog(null, "Digite o nome do item para busca: ");
				 
					if (arrayListNome.contains(nome)) {
						// Caso o produto exista, é exibido a posição do item  nome e preço atual do item
						// E é solicitado o novo preço a ser inserido
						JOptionPane.showMessageDialog(null,
							"Item encontrado: \n\n"
							+ "\nNome do Item:\n"
							+ arrayListNome.get(arrayListNome.indexOf(nome))
							+ "Posição:\n"
							+ (arrayListNome.indexOf(nome) +1)
							+ "\nValor:\nR$ "
							+ arrayListPreco.get(arrayListNome.indexOf(nome))
						);
					} else {
						// Caso não exista, é exibida uma mensagem informando que não foi encontrado
						JOptionPane.showMessageDialog(null, "Item não encontrado");
					}
					
					// Logo após, outro laço de repetição é criado para a verificação de uma condicional, caso o usuário deseje buscar mais itens
					// Caso ele opte por adicionar mais valores, então, o processo é repetido, caso contrário, é exibido a primeira caixa de diálogo
					do {
					 	variavelCondicao = JOptionPane.showInputDialog(null,
							"Deseja procurar mais algum item?"
							+ "\n1 - Sim"
							+ "\n0 - Não");
				 
						// Caso o usuário tente executar uma opção inexistente, é exibido uma mensagem de erro
					 	if(!(variavelCondicao.equals("1") || variavelCondicao.equals("0")))
				 			JOptionPane.showMessageDialog(null, "Operação inválida, tente novamente!");
				 		
					} while (!(variavelCondicao.equals("1") || variavelCondicao.equals("0")));
					
				 } while (!(variavelCondicao.equals("0")));
			}
			

			// Condicional 6 - Remover um item do vetor
			else if(condicao.equals("6")){
				// Caso a opção que o usuário selecionou seja a '6', ou seja, 'Remover um item do vetor'
				// É criado um laço de repetição 'do-while'
				do {
					// Onde é lido o nome do item a ser removido
					nome = JOptionPane.showInputDialog(null, "Insira a nome do item a ser excluído: ");
					
					if (arrayListNome.contains(nome)) {
						// Caso o produto exista, é exibido o nome e preço do item
                        JOptionPane.showMessageDialog(null,
                            "Item encontrado!\n\n"
                            + arrayListNome.get(arrayListNome.indexOf(nome))
                            + "\nR$ "
                            + arrayListPreco.get(arrayListNome.indexOf(nome))
                        );
                        
						// É criado um laço onde é perguntado se ele deseja prosseguir com a operação de remover o item
                        do {
                            variavelCondicao = JOptionPane.showInputDialog(null,
                                "É esse mesmo o item que deseja remover?"
                                + "\n1 - Sim"
                                + "\n0 - Não"
                            );
                            
                            // Caso o usuário tente executar uma opção inexistente, é exibido uma mensagem de erro
                            if (!(variavelCondicao.equals("1") || variavelCondicao.equals("0")))
                                JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
                            
                        } while (!(variavelCondicao.equals("1") || variavelCondicao.equals("0")));
                        
                        if (variavelCondicao.equals("1")) {
                        	// Caso o cliente realmente deseje remover o item
                            // O item é removido, junto com o preço
                            arrayListNome.remove(arrayListNome.indexOf(nome));
                            arrayListPreco.remove(arrayListPreco.get(arrayListNome.indexOf(nome)));
                            
                            // E é exibidida uma mensagem de sucesso
                            JOptionPane.showMessageDialog(null, "Item removido com sucesso!");
                        }
                        
                    } else {
						// Caso o produto não exista, é exibido uma mensagem informando que o item não foi encontrado
                        JOptionPane.showMessageDialog(null, "Item não encontrado");
                    }
					
					// Logo após, outro laço de repetição é criado para a verificação de uma condicional, caso o usuário deseje remover mais itens
					// Caso ele opte por adicionar mais valores, então, o processo é repetido, caso contrário, é exibido a primeira caixa de diálogo
					do {
						variavelCondicao = JOptionPane.showInputDialog(null,
							"Deseja remover mais algum item?"
							+ "\n1 - Sim"
							+ "\n0 - Não");
						
						// Caso o usuário tente executar uma opção inexistente, é exibido uma mensagem de erro
				 		if(!(variavelCondicao.equals("1") || variavelCondicao.equals("0")))
				 			JOptionPane.showMessageDialog(null, "Operação inválida, tente novamente!");
			 		
					} while (!(variavelCondicao.equals("1") || variavelCondicao.equals("0")));
				
				} while (!(variavelCondicao.equals("0")));
			}
			
			// Condicional 7 - Visualisar vetores
			else if (condicao.equals("7")) {
				// Caso a opção que o usuário selecionou seja a '7', ou seja, 'Visualisar vetores'
				
				// São exibidos os produtos registrados, por meio de uma função criada para a exibição dos vetores formatados corretamente
			    JOptionPane.showMessageDialog(null,"Produtos registrados:\n\n" + asyncPriceName(arrayListPreco, arrayListNome));
			}
			
			// Condicional 8 - Quantidade de itens no vetor de nomes
			else if(condicao.equals("8")){
				// Caso a opção que o usuário selecionou seja a '8', ou seja, 'Quantidade de itens no vetor de nomes'
				JOptionPane.showMessageDialog(null, "Quantidade de itens adicionados: " + arrayListNome.size());
			}
			
			// Condicional 0 - Sair
			else if(condicao.equals("0")){
				// Caso a opção que o usuário selecionou seja a '0', ou seja, 'Sair'

				// É exibida a mensagem: 'Programa encerrado'
				JOptionPane.showMessageDialog(null, "Programa encerrado.");
			}
			
			// Caso não seja nenhum dos casos acima
			else {
				// É exibida uma mensagem informando que a opção selecionada é inválida
				JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente!");
			}
		
		} while(!condicao.equals("0"));
	
	}
		
	// Função 'asyncPriceName', que recebe como parâmetro dois objetos 'ArrayList', um de tipo 'Double' e outro do tipo 'String'
	public static String asyncPriceName(ArrayList<Double> arrayListPreco, ArrayList<String> arrayListNome) {
		// É criado um novo StringBuilder para construirmos a String a ser exibida
		StringBuilder sb = new StringBuilder();
		        
		// Laço de repetição 'for'
		for (int i = 0; i < arrayListNome.size(); i++) {
		  // Para cada nome e preço encontrado em ambos os vetores
		  // Ambos são adicionados para a construção da mensagem
		  sb.append(arrayListNome.get(i));
		  sb.append(" - R$ " + arrayListPreco.get(i) + "\n");
		}
		   
		// É retornado a mensagem completa, exibida formatada corretamente
		return sb.toString();
	}
}