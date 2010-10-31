package SpaceInvaders;

public abstract class Nave extends ObjetoColisionante {
	/**
	 * Salud: Es la salud actual de la nave. Al llegar a cero, la nave muere.
	 */
	private int salud;
	/**
	 * Damage: Es el da�o de disparo. Este atributo varia segun se instancia un Invader, un Boss o un Defender.
	 */
	private int damage;
	/**
	 * Cadencia: Es la cantidad de disparos que puede hacer en determinado tiempo.
	 */
	private int cadencia;
	/**
	 * saludMax: Es la salud maxima de la nave, este valor varia si se sintancia un Boss, un InvaderRaso o un Defender.
	 */
	private int saludMax;
	private Bala bala;

	/**
	 * Disparar: Metodo abstracto, debe ser redefinido en las instancias de Defender, Boss e InvaderRaso
	 */
	public abstract void disparar(int dmg);

	public abstract void morir();

	public void setBala(Bala bala) {
		this.bala = bala;
	}

	public Bala getBala() {
		return this.bala;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getSalud() {
		return this.salud;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getDamage() {
		return this.damage;
	}

	public void setCadencia(int cadencia) {
		this.cadencia = cadencia;
	}

	public int getCadencia() {
		return this.cadencia;
	}

	public void setSaludMax(int saludMax) {
		this.saludMax = saludMax;
	}

	public int getSaludMax() {
		return this.saludMax;
	}
}