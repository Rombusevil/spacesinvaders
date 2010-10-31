package SpaceInvaders;

import java.net.URL;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class Imagen extends JFrame{
	private String path;
    private int posX, posY;

    public Imagen(String picName, int posX, int posY){
        this.path = picName;
        this.posX = posX;
        this.posY = posY;       
    }

	public Image loadPic() {
            path = "Imagenes/" + path;
            URL url = getClass().getClassLoader().getResource(path);
            Image img = new ImageIcon(url).getImage();
            System.out.println(path);
            repaint();
            return img;
	}

    @Override
    public void paint(Graphics g){
        g.drawImage(loadPic(), posX, posX, this);
    }

    
    public void setPosX(int x){
        this.posX = x;        
    }
    public void setPosY(int y){
        this.posY = y;
    }
    public int getPosX(){
        return this.posX;
    }
    public int getPosY(){
        return this.posY;
    }

	public void setPath(String path) {
		this.path = path;
	}

	public String getPath() {
		return this.path;
	}
}