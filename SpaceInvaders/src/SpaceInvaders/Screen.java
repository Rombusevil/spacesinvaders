package SpaceInvaders;

/* CLASE CON METODOS PARA FULL SCREEN */

import java.awt.*;
import javax.swing.JFrame;

public class Screen {

    private GraphicsDevice vc; //Variable que representa la Placa de Video

    public Screen(){
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        vc = env.getDefaultScreenDevice(); //Ganamos acceso al monitor
    }

    public void setFullScreen(DisplayMode dm, JFrame window){
        window.setUndecorated(true); //Le quitamos los bordes a la ventana
        window.setResizable(false);  //La ventana no se puede redimensionar
        vc.setFullScreenWindow(window); //Fullscreen a la ventana
        
        //Chequeamos que haya algo en el parametro "dm" y chequeamos 
        //que la Placa de Video soporte full screen
        if (dm != null && vc.isDisplayChangeSupported()){
            try{
                vc.setDisplayMode(dm);
            }catch(Exception ex){}
        }
    }

    //Este metodo me devuelve la ventana en FullScreen
    public Window getFullScreenWindow(){
        return vc.getFullScreenWindow();
    }

    //Este metodo quita el fullscreen
    public void restoreScreen(){
        Window w = vc.getFullScreenWindow();
        if (w != null){
            w.dispose();
        }
        vc.setFullScreenWindow(null); //Esta linea saca el fullscreen
    }


}
