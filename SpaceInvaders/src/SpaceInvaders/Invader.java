package SpaceInvaders;

public abstract class Invader extends Nave {
	/**
	 * Puntos que deja al morir
	 */
	private int cantPuntos;
	/**
	 * Este numero indica la probabilidad que tiene el invader de realizar un disparo.
	 * Puede variar segun el tipo de invader.
	 */
	private int numProbabilidadDisparo;
	private Nivel nivel;

	/**
	 * Este metodo calcula, en base a probabilidadDisparo. Si el invader va a realizar un disparo.
	 * En caso de hacerlo retorna True.
	 */
	public boolean probabilidadDisparar(int prob) {
		throw new RuntimeException("Not yet implemented");
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public Nivel getNivel() {
		return this.nivel;
	}

	public void setCantPuntos(int cantPuntos) {
		this.cantPuntos = cantPuntos;
	}

	public int getCantPuntos() {
		return this.cantPuntos;
	}

	public void setNumProbabilidadDisparo(int numProbabilidadDisparo) {
		this.numProbabilidadDisparo = numProbabilidadDisparo;
	}

	public int getNumProbabilidadDisparo() {
		return this.numProbabilidadDisparo;
	}
}