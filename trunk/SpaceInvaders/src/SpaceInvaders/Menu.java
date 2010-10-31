package SpaceInvaders;

import java.awt.*;
import javax.swing.JFrame;

public class Menu{
	private Partida partida;
	private TopScores topScores;
    private Screen screen;

    public void run(DisplayMode dm){
        Imagen fondo = new Imagen("prueba.jpg",80,40);
        Imagen alien = new Imagen("alien.jpeg",20,20);
        screen = new Screen();
               
        try{
            screen.setFullScreen(dm, new JFrame());
            
            Graphics gra = screen.getFullScreenWindow().getGraphics();


            //Que cada objeto sepa dibujarse. Esto debería estar metido
            //en los objetos que heredan de objeto colicionante
            fondo.paint(gra);
            alien.paint(gra);
           


            try{                    //Esto es para que quede en fullscreen
                Thread.sleep(2000); //durante 2 segundos. Sino no llego a ver nada
            }catch(Exception ex){}
            /*
             * Acá llama a MENU y comienza la logica del juego
             */
        }finally{
            screen.restoreScreen();
        }
    }





        /*****************************/
	public void crearPartida() {
		throw new RuntimeException("Not yet implemented");
	}

	public void verTopScores() {
		throw new RuntimeException("Not yet implemented");
	}

	public void cearPartidaMultiplayer() {
		throw new RuntimeException("Not yet implemented");
	}

	public void salirJuego() {
		throw new RuntimeException("Not yet implemented");
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	public Partida getPartida() {
		return this.partida;
	}

	public void setTopScores(TopScores topScores) {
		this.topScores = topScores;
	}

	public TopScores getTopScores() {
		return this.topScores;
	}
}