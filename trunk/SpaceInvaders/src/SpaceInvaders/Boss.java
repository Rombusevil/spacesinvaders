package SpaceInvaders;

public class Boss extends Invader {
	/**
	 * Cada cuanto el Boss puede realizar su ataqueEspecial
	 */
	private int cadenciaAtaqueEspecial;

	/**
	 * Metodo constructor
	 */
	public Boss Boss(int x, int y, int tipoBoss) {
		throw new RuntimeException("Not yet implemented");
	}

	public void ataqueEspecial() {
		throw new RuntimeException("Not yet implemented");
	}

	public void morir() {
		throw new RuntimeException("Not yet implemented");
	}

	public void setCadenciaAtaqueEspecial(int cadenciaAtaqueEspecial) {
		this.cadenciaAtaqueEspecial = cadenciaAtaqueEspecial;
	}

	public int getCadenciaAtaqueEspecial() {
		return this.cadenciaAtaqueEspecial;
	}

	/**
	 * Disparar: Metodo abstracto, debe ser redefinido en las instancias de Defender, Boss e InvaderRaso
	 */
	public void disparar(int dmg) {
		throw new RuntimeException("Not yet implemented");
	}

	public void mover(int direccion, int velocidad) {
		throw new RuntimeException("Not yet implemented");
	}
}