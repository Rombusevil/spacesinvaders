package SpaceInvaders;

public class Bala extends ObjetoColisionante {
	private int damage;
	private Nave nave;

	public Bala Bala(int x, int y, int dmg, boolean direccion) {
		throw new RuntimeException("Not yet implemented");
	}

	public void mover(int direccion, int velocidad) {
		throw new RuntimeException("Not yet implemented");
	}

	public void setNave(Nave nave) {
		this.nave = nave;
	}

	public Nave getNave() {
		return this.nave;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getDamage() {
		return this.damage;
	}
}