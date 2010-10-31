package SpaceInvaders;

public class TopScores {
	private Persona[]  listaPersonas;
	/**
	 * Cuantas personas se almacenan
	 */
	private int cantidadTopScores;
	private Menu menu;
	private Persona persona;

	/**
	 * Pregunta si el puntaje recibido entra a los 10 mejores, si lo hace lo agrega a la lista.
	 * Al agregar una Persona, se sobreescribe el ultimo de la lista siempre, luego se llama a ordenarPuntajes()
	 */
	public void agregarScore(Persona persona) {
		throw new RuntimeException("Not yet implemented");
	}

	public Persona getMinScore() {
		throw new RuntimeException("Not yet implemented");
	}

	public void ordenarPuntajes() {
		throw new RuntimeException("Not yet implemented");
	}

	public void compararPuntajes(int a, int b) {
		throw new RuntimeException("Not yet implemented");
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Menu getMenu() {
		return this.menu;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setListaPersonas(Persona[] listaPersonas) {
		this.listaPersonas = listaPersonas;
	}

	public Persona[] getListaPersonas() {
		return this.listaPersonas;
	}

	public void setCantidadTopScores(int cantidadTopScores) {
		this.cantidadTopScores = cantidadTopScores;
	}

	public int getCantidadTopScores() {
		return this.cantidadTopScores;
	}
}