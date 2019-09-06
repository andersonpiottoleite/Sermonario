package br.com.piotto.sermonario.model;
import java.util.ArrayList;
import java.util.List;

public class Corpo {
	private List<Topico> topicos = new ArrayList<Topico>();

	public List<Topico> getTopicos() {
		return topicos;
	}

	public void adicionaTopico(Topico topico) {
		this.topicos.add(topico);
	}
	
	
}
