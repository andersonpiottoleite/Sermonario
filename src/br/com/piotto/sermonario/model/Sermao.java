package br.com.piotto.sermonario.model;
import java.util.ArrayList;
import java.util.List;

public class Sermao {

	private Autor autor;
	private Data data;
	private Tipo tipo;
	private String tema;
	private String textoBiblicoBase;
	private String titulo;
	private String introducao;
	private Corpo corpo;
	private String conclusao;
	private Apelo apelo;
	private List<Ilustracao> ilustracoes;

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getTextoBiblicoBase() {
		return textoBiblicoBase;
	}

	public void setTextoBiblicoBase(String textoBiblicoBase) {
		this.textoBiblicoBase = textoBiblicoBase;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIntroducao() {
		return introducao;
	}

	public void setIntroducao(String introducao) {
		this.introducao = introducao;
	}

	public Corpo getCorpo() {
		return corpo;
	}

	public void setCorpo(Corpo corpo) {
		this.corpo = corpo;
	}

	public String getConclusao() {
		return conclusao;
	}

	public void setConclusao(String conclusao) {
		this.conclusao = conclusao;
	}

	public Apelo getApelo() {
		return apelo;
	}

	public void setApelo(Apelo apelo) {
		this.apelo = apelo;
	}

	public List<Ilustracao> getIlustracoes() {
		return ilustracoes;
	}

	public void adicionaIlustracoes(Ilustracao ilustracao) {
		if(this.ilustracoes == null) {
			this.ilustracoes = new ArrayList<Ilustracao>();
		}
		this.ilustracoes.add(ilustracao);
	}

	

}
