package com.br.jogo.adivinhacao.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class VencedorModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotBlank (message = "Esse campo é obrigatório.")
	@NotNull
	private String nome;
	@Min (value = 1, message = "O numero da sorte não pode ser menor que 1.")
	@Max (value = 20, message = "O numero da sorte não pode ser maior que 20.")
	private int numeroDaSorte;
	
	public VencedorModel () {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroDaSorte() {
		return numeroDaSorte;
	}

	public void setNumeroDaSorte(int numeroDaSorte) {
		this.numeroDaSorte = numeroDaSorte;
	}
}
