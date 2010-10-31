package SpaceInvaders;

public class Defender extends Nave {
	private Teclado teclado;
	private Jugador jugador;

	public void mover(int direccion, int velocidad) {
		throw new RuntimeException("Not yet implemented");
	}

	public void disparar(int dmg) {
		throw new RuntimeException("Not yet implemented");
	}

	//Resta una vida y muestra animacion de explosion.
	public void morir() {
		throw new RuntimeException("Not yet implemented");
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Teclado getTeclado() {
		return this.teclado;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Jugador getJugador() {
		return this.jugador;
	}
}