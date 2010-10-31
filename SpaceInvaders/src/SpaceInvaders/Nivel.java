package SpaceInvaders;

public class Nivel {
	private int numeroNivel;
	/**
	 * Lista de los Invaders del nivel
	 */
	private Invader[]  listaInvaderRasos;
	private Nivel nivel;
	private Partida partida;
	private Invader invader;

	/**
	 * Este metodo define las caracteristicas que tendr� el Boss en el nivel. El AtaqueEspecial, la Cadencia, etc..
	 */
	public void defineBoss() {
		throw new RuntimeException("Not yet implemented");
	}

	/**
	 * Crea todos los InvaderRaso del principio del nivel.
	 */
	public void creaInvaders() {
		throw new RuntimeException("Not yet implemented");
	}

	/**
	 * Si no hay mas invaders, este metodo crea al Boss
	 */
	public void creaBoss() {
		throw new RuntimeException("Not yet implemented");
	}

	public Nivel Nivel(int numeroNivel) {
		throw new RuntimeException("Not yet implemented");
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public Nivel getNivel() {
		return this.nivel;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	public Partida getPartida() {
		return this.partida;
	}

	public void setInvader(Invader invader) {
		this.invader = invader;
	}

	public Invader getInvader() {
		return this.invader;
	}

	public void setNumeroNivel(int numeroNivel) {
		this.numeroNivel = numeroNivel;
	}

	public int getNumeroNivel() {
		return this.numeroNivel;
	}

	public void setListaInvaderRasos(Invader[] listaInvaderRasos) {
		this.listaInvaderRasos = listaInvaderRasos;
	}

	public Invader[] getListaInvaderRasos() {
		return this.listaInvaderRasos;
	}
}