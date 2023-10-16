package br.com.poo.pacote;

//Importa todos os métodos do pacote br.com.poo.metodos
import br.com.poo.metodos.*;

import javax.swing.JOptionPane;

public class Tarefa {

	// Atributos do objeto tarefa.

	private int id;

	private String tituloTarefa;

	private String descricaoTarefa;

	private int anoTarefa;

	private Boolean status;

	// Método construtor, inicializando os atributos
	public Tarefa(int id, String tituloTarefa, String descricaoTarefa, int anoTarefa, Boolean status) {

		this.id = id;

		this.tituloTarefa = tituloTarefa;

		this.descricaoTarefa = descricaoTarefa;

		this.anoTarefa = anoTarefa;

		this.status = status;

	}

	// Getters e setters públicos para acessar os atributos encapsulados.

	public int getId() {

		return id;
	}

	public void setId(int id) {

		// Método público para acessar um atributo encapsulado
		TratarDados.tratarInteiros(id);

		this.id = id;
	}

	public String getTituloTarefa() {

		return tituloTarefa;
	}

	public void setTituloTarefa(String tituloTarefa) {

		TratarDados.tratarString(tituloTarefa);

		this.tituloTarefa = tituloTarefa;
	}

	public String getDescricaoTarefa() {

		return descricaoTarefa;
	}

	// Método público para acesso do atributo encapsulado, contém tratamento de
	// dados do tipo String.
	public void setDescricaoTarefa(String descricaoTarefa) {

		TratarDados.tratarString(descricaoTarefa);

		this.descricaoTarefa = descricaoTarefa;
	}

	public int getAnoTarefa() {

		return anoTarefa;
	}

	// Método público para acesso do atributo encapsulado, contém tratamento de
	// dados para números inteiros
	public void setAnoTarefa(int anoTarefa) {

		TratarDados.tratarInteiros(anoTarefa);

		this.anoTarefa = anoTarefa;
	}

	public Boolean getStatus() {
		return status;
	}

	// Método público para acesso dos atributos privados para valores booleanos.
	public void setStatus(Boolean status) {
		
		TratarDados.tratarBoolean(status);

		this.status = status;
	}

	public void mostrarDados() {
		// Imprime no prompt os dados do objeto corrente , como titulo, ID, tarefa, ano
		// corrente e etc.

		JOptionPane.showMessageDialog(null,
				"DADOS DA TAREFA " + "\nTítulo:  " + getTituloTarefa() + "\nID:  " + getId()
						+ "\nDescrição da tarefa:  " + getDescricaoTarefa() + "\nAno da tarefa:  " + getAnoTarefa()
						+ "\nStatus da tarefa:  " + getStatus());
	}

}
