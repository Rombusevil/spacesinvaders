package SpaceInvaders;

public class Teclado {
	private Jugador jugador;
	private Defender defender;

	public void teclaMover() {
		throw new RuntimeException("Not yet implemented");
	}

	public void teclaDisparar() {
		throw new RuntimeException("Not yet implemented");
	}

	public void teclaNavegarMenu() {
		throw new RuntimeException("Not yet implemented");
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Jugador getJugador() {
		return this.jugador;
	}

	public void setDefender(Defender defender) {
		this.defender = defender;
	}

	public Defender getDefender() {
		return this.defender;
	}
}