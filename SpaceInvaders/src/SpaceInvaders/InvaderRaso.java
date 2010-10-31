package SpaceInvaders;

public class InvaderRaso extends Invader {
	/**
	 * Indica el tipo de invaderRaso, hay algunos mas fuertes que otros.
	 */
	private int[]  tipoInvaderRaso;
	/**
	 * La probabilidad de soltar un powerup al morir
	 */
	private int numProbabilidadPowerUp;
	private PowerUp powerUp;

	public InvaderRaso InvaderRaso(int x, int y, int tipoInvaderRaso) {
		throw new RuntimeException("Not yet implemented");
	}
	/**
	 * Este metodo calcula la probabilidad de soltar un powerup, usando numProbabilidadPowerUp.
	 * Si suelta un powerup, instancia un nuevo powerup segun el tipo deseado.
	 */
	public void probabilidadSoltarPowerUp(int prob) {
		throw new RuntimeException("Not yet implemented");
	}

	//Redefine disparar() que hereda de Nave
	public void disparar(int dmg) {
		throw new RuntimeException("Not yet implemented");
	}

	//redefine mover() que hereda de Nave
	public void mover(int direccion, int velocidad) {
		throw new RuntimeException("Not yet implemented");
	}

	public void morir() {
		throw new RuntimeException("Not yet implemented");
	}

	public void setPowerUp(PowerUp powerUp) {
		this.powerUp = powerUp;
	}

	public PowerUp getPowerUp() {
		return this.powerUp;
	}

	public void setTipoInvaderRaso(int[] tipoInvaderRaso) {
		this.tipoInvaderRaso = tipoInvaderRaso;
	}

	public int[] getTipoInvaderRaso() {
		return this.tipoInvaderRaso;
	}

	public void setNumProbabilidadPowerUp(int numProbabilidadPowerUp) {
		this.numProbabilidadPowerUp = numProbabilidadPowerUp;
	}

	public int getNumProbabilidadPowerUp() {
		return this.numProbabilidadPowerUp;
	}
}