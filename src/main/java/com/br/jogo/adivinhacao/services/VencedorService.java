package com.br.jogo.adivinhacao.services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.jogo.adivinhacao.models.VencedorModel;
import com.br.jogo.adivinhacao.repositories.VencedorRepository;

@Service
public class VencedorService {

	@Autowired
	private VencedorRepository vencedorRepository;

	public int criarNumero() {
		Random numero = new Random();
		return numero.nextInt(20 +1);
	}

	public String salvarVencedores(VencedorModel vencedor) {
		int number = criarNumero();
		if (vencedor.getNumeroDaSorte() == number) { 
			vencedorRepository.save(vencedor);
			return "Você Ganhou, parabéns." + number;
		} else {
			return "Infelizmente não foi desta vez, tente novamente.";
		}
	}

	public Iterable<VencedorModel> exibirVencedores() {
		return vencedorRepository.findAll();
	}
}