package control;

public class Pontuacao {
	private Integer pontos;
	
	public Pontuacao(Integer pontos) {	
		this.pontos=pontos;
	}
	public void adicionarPontos(Integer pontos){
		this.pontos = this.pontos + pontos;
	}
	
	public Integer getPontos() {
		return pontos;
	}
	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}
	@Override
	public String toString() {
		return "Pontuacao [pontos=" + pontos + "]";
	}
	

}
