package com.generation.lojadegame.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")

public class Produtos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank (message = "Obrigatório identificar o nome do produto")
	@Size(min = 5, max = 60, message = "O nome do produto tem que ter no minimo 5 caracteres e no máximo 60 caracteres")
	private String nome;
	
	@NotBlank (message = "Obrigatório a descricao do produto")
	@Size(min = 5, max = 200, message = "A descricao do produto tem que ter no minimo 5 caracteres e no máximo 200 caracteres")
	private String descricao;
	
	@NotNull (message = "Obrigatório o preço para o produto")
	private Float preco;
	
	@NotBlank (message = "Obrigatório imagem do produto")
	private String foto;
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;
	

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}	
	
	
	
}
