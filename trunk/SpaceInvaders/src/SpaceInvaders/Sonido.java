package SpaceInvaders;

import java.applet.AudioClip;

public class Sonido {
	private String path;
	private ObjetoColisionante objetoColisionante;

	public AudioClip loadAudio(String name) {
		throw new RuntimeException("Not yet implemented");
	}

	public void playMid() {
		throw new RuntimeException("Not yet implemented");
	}

	public void playWav() {
		throw new RuntimeException("Not yet implemented");
	}

	public void setObjetoColisionante(ObjetoColisionante objetoColisionante) {
		this.objetoColisionante = objetoColisionante;
	}

	public ObjetoColisionante getObjetoColisionante() {
		return this.objetoColisionante;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPath() {
		return this.path;
	}
}