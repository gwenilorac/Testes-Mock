package br.com.gwenilorac.leilao.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.gwenilorac.leilao.model.Pagamento;

@Repository
public class PagamentoDao {

	private EntityManager em;

	@Autowired
	public PagamentoDao(EntityManager em) {
		this.em = em;
	}

	public void salvar(Pagamento pagamento) {
		em.persist(pagamento);
	}

}
