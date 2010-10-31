package SpaceInvaders;

public abstract class PowerUp extends ObjetoColisionante {
	private int duracionPowerUp;
	private InvaderRaso invaderRaso;

	public void mover(int direccion, int velocidad) {
		throw new RuntimeException("Not yet implemented");
	}

	public abstract void efecto();

	public void setInvaderRaso(InvaderRaso invaderRaso) {
		this.invaderRaso = invaderRaso;
	}

	public InvaderRaso getInvaderRaso() {
		return this.invaderRaso;
	}

	public void setDuracionPowerUp(int duracionPowerUp) {
		this.duracionPowerUp = duracionPowerUp;
	}

	public int getDuracionPowerUp() {
		return this.duracionPowerUp;
	}
}