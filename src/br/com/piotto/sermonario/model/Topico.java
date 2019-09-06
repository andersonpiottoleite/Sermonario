package br.com.piotto.sermonario.model;
import java.util.ArrayList;
import java.util.List;

public class Topico {

	private String conteudo;
	private List<SubTopico> subTopicos;

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public List<SubTopico> getSubTopicos() {
		return subTopicos;
	}

	public void adicionaSubTopico(SubTopico subTopico) {
		if(this.subTopicos == null) {
			this.subTopicos = new ArrayList<SubTopico>();
		}
		this.subTopicos.add(subTopico);
	}

}
