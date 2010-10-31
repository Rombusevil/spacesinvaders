package SpaceInvaders;

public class Partida {
	private Nivel listaNiveles;
	private Nivel nivelActual;
	private Menu menu;
	private Jugador jugador;
	private Nivel nivel;

	/**
	 * Este metodo destruye el objeto Nivel y crea otro con diferentes parametros, pasa de nivel
	 */
	public void pasarNivel() {
		throw new RuntimeException("Not yet implemented");
	}

	public Partida Partida(int dificultad) {
		throw new RuntimeException("Not yet implemented");
	}

	public void perderPartida() {
		throw new RuntimeException("Not yet implemented");
	}

	/**
	 * Al terminar la partida, se carga el puntaje en TopScores
	 */
	public void cargarTopScores() {
		throw new RuntimeException("Not yet implemented");
	}

	public void gameLoop() {
		throw new RuntimeException("Not yet implemented");
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Menu getMenu() {
		return this.menu;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Jugador getJugador() {
		return this.jugador;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public Nivel getNivel() {
		return this.nivel;
	}

	public void setListaNiveles(Nivel listaNiveles) {
		this.listaNiveles = listaNiveles;
	}

	public Nivel getListaNiveles() {
		return this.listaNiveles;
	}

	public void setNivelActual(Nivel nivelActual) {
		this.nivelActual = nivelActual;
	}

	public Nivel getNivelActual() {
		return this.nivelActual;
	}
}