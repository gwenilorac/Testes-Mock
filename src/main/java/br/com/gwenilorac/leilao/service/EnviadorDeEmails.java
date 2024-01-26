package br.com.gwenilorac.leilao.service;

import org.springframework.stereotype.Service;

import br.com.gwenilorac.leilao.model.Lance;
import br.com.gwenilorac.leilao.model.Leilao;
import br.com.gwenilorac.leilao.model.Usuario;

@Service
public class EnviadorDeEmails {

	// apenas simula o envio de um email...
	public void enviarEmailVencedorLeilao(Lance lanceVencedor) {
		Usuario vencedor = lanceVencedor.getUsuario();
		Leilao leilao = lanceVencedor.getLeilao();
		
		String email = String.format("Parabens {}! Voce venceu o leilao {} com o lance de R${}", vencedor.getNome(), leilao.getNome(), lanceVencedor.getValor());

		System.out.println(email);
	}

}
