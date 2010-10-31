package SpaceInvaders;

public abstract class ObjetoColisionante{
	private int x;
	private int y;
	private int velocidadMovimiento;
	private int width;
	private int high;
	private Animacion animacion;
	private Sonido sonido;

	public abstract void mover(int direccion, int velocidad);

	public boolean verificarColisiones(ObjetoColisionante objeto1, ObjetoColisionante objeto2) {
		throw new RuntimeException("Not yet implemented");
	}

	public void setAnimacion(Animacion animacion) {
		this.animacion = animacion;
	}

	public Animacion getAnimacion() {
		return this.animacion;
	}

	public void setSonido(Sonido sonido) {
		this.sonido = sonido;
	}

	public Sonido getSonido() {
		return this.sonido;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return this.x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return this.y;
	}

	public void setVelocidadMovimiento(int velocidadMovimiento) {
		this.velocidadMovimiento = velocidadMovimiento;
	}

	public int getVelocidadMovimiento() {
		return this.velocidadMovimiento;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWidth() {
		return this.width;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int getHigh() {
		return this.high;
	}
}