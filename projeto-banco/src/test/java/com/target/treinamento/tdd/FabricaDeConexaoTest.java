package com.target.treinamento.tdd;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class FabricaDeConexaoTest {
	
	@Test
	public void testaSeAConexaoFoiCriada() {
		FabricaDeConexao fabricaDeConexao = new FabricaDeConexao();
		
		assertNotNull(fabricaDeConexao.getConexao());
		fabricaDeConexao.fecharConexao();
	
	}

}
