package com.malves.modelos;

import com.malves.tipos.Navegador;
import com.malves.tipos.ReprodutorMusical;
import com.malves.tipos.Telefone;

public class IPhone implements Navegador, ReprodutorMusical, Telefone {

	@Override
	public void ligar(String numeroDoTelefone) {
		System.out.println("Ligando para o número: " + numeroDoTelefone);
	}

	@Override
	public void atender(String numeroDoTelefone) {
		System.out.println("Atendendo o número: " + numeroDoTelefone);
	}

	@Override
	public void iniciarCorreioDeVoz(String numeroDoTelefone) {
		System.out.println("Iniciando correio de voz para o número: " + numeroDoTelefone);
	}

	@Override
	public void tocarMusica(String nomeDaMusica) {
		System.out.println("Tocando a música: " + nomeDaMusica);
	}

	@Override
	public void selecionarMusica(String nomeDaMusica) {
		System.out.println("Selecionando a música: " + nomeDaMusica);
	}

	@Override
	public void pausarMusica(String nomeDaMusica) {
		System.out.println("Pausando a música: " + nomeDaMusica);
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo a página: " + url);
	}

	@Override
	public void adicionarNovaAba(String url) {
		System.out.println("Adicionando nova aba para o endereço: " + url);
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página...");
	}

}
