package br.com.piotto.sermonario.test;

import br.com.piotto.sermonario.model.Apelo;
import br.com.piotto.sermonario.model.Autor;
import br.com.piotto.sermonario.model.Corpo;
import br.com.piotto.sermonario.model.Data;
import br.com.piotto.sermonario.model.Ilustracao;
import br.com.piotto.sermonario.model.Sermao;
import br.com.piotto.sermonario.model.SubTopico;
import br.com.piotto.sermonario.model.Tipo;
import br.com.piotto.sermonario.model.Topico;

public class TestSermoes {
	
	public static void main(String[] args) {
		
		Sermao s = new Sermao();
		
		Autor autor = new Autor();
		autor.setNome("Piotto");
		s.setAutor(autor );
		
		Data data = new Data();
		data.setDia(23);
		data.setMes(03);
		data.setAno(2018);
		s.setData(new Data());
		
		Tipo tipo = new Tipo();
		tipo.setDescricao("Temático");
		s.setTipo(tipo );
		
		s.setTextoBiblicoBase("Jo 3:16");
		s.setTema("TesteTema");
		s.setTitulo("TesteTitulo");
		s.setIntroducao("testeIntroducao");
		
		Corpo corpo = new Corpo();
		
		Topico topico = new Topico();
		
		SubTopico subTopico = new SubTopico();
		subTopico.setConteudo("Teste Subtopico1");
		SubTopico subTopico2 = new SubTopico();
		subTopico2.setConteudo("Teste Subtopico2");
		
		topico.adicionaSubTopico(subTopico);
		topico.adicionaSubTopico(subTopico2);
		topico.setConteudo("testeTopico1");
		
		Topico topico2 = new Topico();
		topico2.setConteudo("TesteTopico2");
		
		corpo.adicionaTopico(topico);
		corpo.adicionaTopico(topico2);
		
		s.setCorpo(corpo);
		
		Apelo apelo = new Apelo();
		apelo.setConteudo("TestApelo");
		s.setApelo(apelo );
		
		s.setConclusao("TestConclusao");
		
		Ilustracao ilustracao = new Ilustracao();
		ilustracao.setConteudo("textIustracao");
		
		Ilustracao ilustracao2 = new Ilustracao();
		ilustracao2.setConteudo("textIustracao2");
		
		s.adicionaIlustracoes(ilustracao);
		s.adicionaIlustracoes(ilustracao2);
		
	}

}
