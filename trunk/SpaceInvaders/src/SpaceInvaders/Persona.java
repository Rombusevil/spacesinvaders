package SpaceInvaders;

public class Persona {
	private char[]  nombre;
	private Puntaje puntaje;
	private TopScores topScores;

	public void setPuntaje(Puntaje puntaje) {
		this.puntaje = puntaje;
	}

	public Puntaje getPuntaje() {
		return this.puntaje;
	}

	public void setTopScores(TopScores topScores) {
		this.topScores = topScores;
	}

	public TopScores getTopScores() {
		return this.topScores;
	}

	public void setNombre(char[] nombre) {
		this.nombre = nombre;
	}

	public char[] getNombre() {
		return this.nombre;
	}
}