package br.com.poo.metodos;

import java.time.LocalDate;

import java.util.*;

import javax.swing.JOptionPane;

import br.com.poo.pacote.Tarefa;

public class TratarDados {

	// Método sem retorno que recebe como parâmetro uma String.
	public static void tratarString(String palavra) {

		// remove os espaços iniciais e finais de uma String.

		palavra = palavra.trim();

		// Converte os caracteres em letras minúsculas, para obter uma padronização

		palavra = palavra.toLowerCase();

		// Verifica se a palavra é igual a nulo
		if (palavra.equals(null)) {

			// Gera uma mensagem de erro no prompt
			JOptionPane.showMessageDialog(null, "O campo está vazio, porém precisa ser preenchido adequadamente!", null,
					JOptionPane.ERROR_MESSAGE);

		}

		// Limitando a quantidade de caracteres que usuário pode digitar nesse campo
		else if (palavra.length() > 50) {

			// Gera uma mensagem de erro no prompt
			JOptionPane.showMessageDialog(null,
					"A quantidade de caracteres que você inseriu ultrapassou os limites, tente novamente", null,
					JOptionPane.WARNING_MESSAGE);

		}

	}

	// Método sem retorno para tratamento de ano
	public static void tratarInteiros(int ano) {

		LocalDate anoAtual = LocalDate.now();

		// Se o ano for um número negativo ou igual a zero, gera uma mensagem de erro no
		// prompt.

		if (ano <= 0) {

			// Imprime no prompt uma verificação de erro
			JOptionPane.showMessageDialog(null,
					"Digite um valor maior do que zero, apenas números inteiros positivos são aceitos", null,
					JOptionPane.ERROR_MESSAGE);

		}

		// Se o ano que foi inserido for maior do que o ano atual (2023), gera um erro!
		else if (ano > anoAtual.getYear()) {

			JOptionPane.showMessageDialog(null,
					"Digite apenas valores menores do que o ano atual : " + anoAtual.getYear(), null,
					JOptionPane.ERROR_MESSAGE);

		}

	}

	// Método sem retorno para tratamento de valores booleanos
	public static void tratarBoolean(Boolean status) {

		// Se o "status" for igual a vazio, gera um erro
		if (status.equals(null)) {

			JOptionPane.showMessageDialog(null,
					"Nenhum valor válido foi fornecido, insira nesse campo apenas TRUE ou FALSE", null,
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void tratarVetor(ArrayList<Object> objetos) {

		// Início do método tratarVetor

		try {

			// Início de um bloco try-catch para tratar exceções

			int idExcluir = Integer.parseInt(JOptionPane.showInputDialog("Insira o ID da tarefa que deseja excluir:"));

			// Solicita ao usuário que insira o ID da tarefa a ser excluída e o converte
			// para um número inteiro.

			Iterator<Object> iterator = objetos.iterator();

			// Cria um objeto Iterator para percorrer a lista de objetos.

			while (iterator.hasNext()) {
				// Inicia um loop enquanto houver elementos na lista.

				Object elemento = iterator.next();
				// Obtém o próximo elemento da lista.

				if (elemento instanceof Tarefa) {

					Tarefa tarefa = (Tarefa) elemento;

					// Verifica se o elemento é uma instância da classe Tarefa.

					if (tarefa.getId() == idExcluir) {

						// Compara o ID da tarefa com o ID inserido pelo usuário.

						// Se for, remove.

						iterator.remove();

						// Imprime no prompt uma mensagem
						JOptionPane.showMessageDialog(null, "Tarefa removida com sucesso!");

						return; // Sai do loop assim que a tarefa é encontrada e removida
					}
				}
			}

			// Se o ID não corresponde a nenhuma tarefa, exibe uma mensagem de aviso.

			JOptionPane.showMessageDialog(null, "Tarefa com ID " + idExcluir + " não encontrada.", null,

					JOptionPane.WARNING_MESSAGE);

		} catch (NumberFormatException e) {

			// Captura uma possível exceção de conversão de número.

			JOptionPane.showMessageDialog(null, "ID inválido. Insira um número válido.", null,

					JOptionPane.ERROR_MESSAGE);

			// Exibe uma mensagem de erro se o ID inserido não for um número válido.

		}
	}

}
