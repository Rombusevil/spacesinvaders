package SpaceInvaders;

public class Puntaje {
	private int cantidadPuntos;
	private Persona persona;

	public void sumarPuntos(int cantidadPuntos) {
		throw new RuntimeException("Not yet implemented");
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setCantidadPuntos(int cantidadPuntos) {
		this.cantidadPuntos = cantidadPuntos;
	}

	public int getCantidadPuntos() {
		return this.cantidadPuntos;
	}
}