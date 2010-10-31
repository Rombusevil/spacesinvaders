package SpaceInvaders;

public class Jugador extends Persona {
	private int vidas;
	private Defender defender;
	private Partida partida;
	private Teclado teclado;

	public Jugador Jugador() {
		throw new RuntimeException("Not yet implemented");
	}

	public void perderVida() {
		throw new RuntimeException("Not yet implemented");
	}

	public void setDefender(Defender defender) {
		this.defender = defender;
	}

	public Defender getDefender() {
		return this.defender;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	public Partida getPartida() {
		return this.partida;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Teclado getTeclado() {
		return this.teclado;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public int getVidas() {
		return this.vidas;
	}
}