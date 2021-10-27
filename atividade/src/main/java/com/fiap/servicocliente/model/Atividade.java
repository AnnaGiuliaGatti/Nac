package com.fiap.servicocliente.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "clientes")
public class Atividade {

	@Id
	private String id; 
	private String nome;
	private String urlGitHub;
	private int rm;
	private int numero;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUrlGitHub() {
		return urlGitHub;
	}
	public void setUrlGitHub(String urlGitHub) {
		this.urlGitHub = urlGitHub;
	}
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public int getNúmero() {
		return numero;
	}
	public void setNúmero(int número) {
		this.numero = número;
	}
}
