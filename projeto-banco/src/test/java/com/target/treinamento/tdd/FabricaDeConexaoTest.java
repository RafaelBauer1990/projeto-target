package com.target.treinamento.tdd;

import static org.junit.Assert.assertNotNull;


import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mock;

public class FabricaDeConexaoTest {

	@Test
	public void testaSeAConexaoFoiCriada() {
		FabricaDeConexao fabricaDeConexao = new FabricaDeConexao();

		assertNotNull(fabricaDeConexao.getConexao());
		fabricaDeConexao.fecharConexao();

	}


	@Mock
	App app;



	@Test
	public void testaSePreparementFoiCriado() {
		FabricaDeConexao fabricaDeConexao = new FabricaDeConexao();

		assertNotNull(fabricaDeConexao.getPreparedStatement());
		fabricaDeConexao.fecharConexao();

	}

}
