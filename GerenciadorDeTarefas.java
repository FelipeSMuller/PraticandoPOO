package br.com.poo.pacote;

import br.com.poo.metodos.*;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GerenciadorDeTarefas {

	public static void main(String[] args) {

		// Permite ao usuário selecionar as diversas opções disponíveis no gerenciador.

		// Declaração de um array dinâmico, que armazena objetos
		ArrayList<Object> objetos = new ArrayList<>();

		int opcao = 0;

		int escolha = 0;

		do {

			try {

				// Entrada de dados , onde o usuário pode selecionar as opções abaixo
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
						"SEJA BEM VINDO AO GERENCIADOR DE TAREFAS \n1-Adicionar tarefa \n2-Excluir tarefa \n3-Excluir todas as tarefas"));

				switch (opcao) {

				case 1:

					// Instanciando um novo objeto do tipo Tarefa.
					Tarefa tarefa1 = new Tarefa(0, null, null, 0, null);

					// Acessando os getters e setters do objeto tarefa

					// Acessando o método encapsulado através dos métodos públicos, definindo o
					// título do objeto tarefa
					tarefa1.setTituloTarefa(JOptionPane.showInputDialog(null, "Insira o título da tarefa"));

					// Acessando o método encapsulado através dos métodos públicos, definindo o
					// ano do objeto tarefa
					tarefa1.setAnoTarefa(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o ano da tarefa")));

					// Acessando o método encapsulado através dos métodos públicos, definindo a
					// descrição do objeto tarefa
					tarefa1.setDescricaoTarefa(JOptionPane.showInputDialog(null, "Insira a descrição da tarefa"));

					// Acessando o método encapsulado através dos métodos públicos, definindo o ID
					// do objeto tarefa
					tarefa1.setId(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o ID da tarefa")));

					// Acessando o método encapsulado através dos métodos públicos, definindo o
					// Status
					// do objeto tarefa
					tarefa1.setStatus(Boolean.parseBoolean(JOptionPane.showInputDialog(null,
							"Insira nesse campo TRUE ou FALSE para definir o status da tarefa")));

					escolha = JOptionPane.showConfirmDialog(null, "Deseja verificar os dados da tarefa??");

					// Se o usuário pressionar o botão SIM
					if (escolha == 0) {
						// Imprime no prompt os dados
						tarefa1.mostrarDados();
					}

					// Gera no prompt uma mensagem de finalização do programa
					else {

						JOptionPane.showMessageDialog(null, "A aplicação foi finalizada", null,
								JOptionPane.WARNING_MESSAGE);
					}

					// Adicionando o objeto em um array de objetos;F
					objetos.add(tarefa1);

					break;

				case 2:

					// Chama o método sem retorno que verifica o array dinâmico de objetos e procura
					// uma busca existente
					TratarDados.tratarVetor(objetos);

					break;

				case 3:

					// Excluindo todos os objetos presentes no array.

					// Não retorna nenhum parãmetro
					objetos.clear();

					JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!!", null,
							JOptionPane.INFORMATION_MESSAGE);

					break;

				default:

					// Gera uma mensagem no prompt informando ao usuário que a aplicação foi
					// finalizada, pois nenhuma opção foi selecionada
					JOptionPane.showMessageDialog(null,
							"Nenhuma opção foi escolhida, portanto a aplicação foi finalizada!!", null,
							JOptionPane.WARNING_MESSAGE);
				}

				// Gera uma mensagem de erro caso o valor inserido seja algo diferente de um
				// número, ou caso o programa seja fechado!!
			} catch (NumberFormatException | NullPointerException erro) {

				// Mensagem de erro com um ícone que permite uma melhor visualização

				JOptionPane.showMessageDialog(null,
						"Dados não numéricos foram inseridos ou o programa foi finalizado incorretamente", null,
						JOptionPane.WARNING_MESSAGE);

			}

			// Enquanto o número inserido for maior do que zero
		} while (opcao > 0);

	}

}
