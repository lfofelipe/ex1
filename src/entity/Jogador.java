package entity;

import control.Pontuacao;

public class Jogador {

	private Integer idJogador;
	private String nome;

	private Pontuacao pontuacao;

	public Jogador() {
		
	}

	public Jogador(Integer idJogador, String nome) {
		super();
		this.idJogador = idJogador;
		this.nome = nome;
	}

	public Jogador(Integer idJogador, String nome, Pontuacao pontuacao) {
		super();
		this.idJogador = idJogador;
		this.nome = nome;
		this.pontuacao = pontuacao;
	}

	public Integer getIdJogador() {
		return idJogador;
	}

	public void setIdJogador(Integer idJogador) {
		this.idJogador = idJogador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pontuacao getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Pontuacao pontuacao) {
		this.pontuacao = pontuacao;
	}
	

	@Override
	public String toString() {
		return "Jogador [idJogador=" + idJogador + ", nome=" + nome +"]";
	}
	public String toString(String op) {
		switch (op) {
		case "csv":
			return idJogador + ";" + nome + ";" + pontuacao.getPontos();
		case "txt":
			return idJogador + "," + nome + "," + pontuacao.getPontos();
		default:
			return toString();
		}
	}
	public static void main(String[] args) {
		Jogador j = new Jogador(1, "luis felipe");
		Pontuacao p = new Pontuacao(10);
		j.setPontuacao(p);
		System.out.println(j);
		j.getPontuacao().adicionarPontos(10);
		System.out.println(j.toString(""));

	}

}
