package SpaceInvaders;

import java.awt.*;
import javax.swing.JFrame;



public class Main{
    public static void main(String[] args){
        //Creo DisplayMode Fullscreen, con su resolucion, colores y refresco de pantalla
        DisplayMode dm = new DisplayMode(800,600,16, DisplayMode.REFRESH_RATE_UNKNOWN);
        //Creo el MENU y llamo a run(dm) <-- le paso el DisplayMode
        Menu mainMenu = new Menu();
        mainMenu.run(dm);
    }
    private Screen screen; //La pantalla
    private Imagen fondo;

    
}
