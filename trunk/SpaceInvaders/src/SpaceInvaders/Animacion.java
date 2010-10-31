package SpaceInvaders;

import java.awt.Image;
import java.util.ArrayList;

public class Animacion{

    private ArrayList fotogramas; //array de fotogramas
    private int fotogramaIndex;
    private long movieTime;
    private long totalTime;

    public Animacion(){
        fotogramas = new ArrayList();
        totalTime = 0;
        start(0);
    }

    //Agraga un fotograma "i" al array. El fotograma dura un tiempo "t"
    public synchronized void addFotograma(Image i, long t) {
        totalTime += t;
        fotogramas.add(new UnFotograma(i, totalTime)); //Agrega un fotograma al array
    }

    public synchronized void actualizaFotograma(long timePassed) {
            if(fotogramas.size()>1){ //si el tamaño del array es > 1...
            movieTime += timePassed;
            if(movieTime >= totalTime){ //este IF restartea la animacion
                movieTime = 0;          //cuando termina para que la vuelva a hacer
                fotogramaIndex = 0;
            }
            while(movieTime > getFotograma(fotogramaIndex).endTime){
                fotogramaIndex++;
            }
        }
    }

    public void start(int index) {
        movieTime = 0;
        fotogramaIndex = 0;
    }

    public synchronized Image getImagenParaGetFotograma() {
        if(fotogramas.isEmpty()){ //Si el array está vacio...
        return null;
        }else{
            return getFotograma(fotogramaIndex).pic;
        }
    }

    public UnFotograma getFotograma(int x) {
            return (UnFotograma)fotogramas.get(x);
    }  


    //GETTERS Y SETTERS VARIOS
        public void setFotogramaIndex(int fotogramaIndex) {
            this.fotogramaIndex = fotogramaIndex;
    }

    public int getFotogramaIndex() {
            return this.fotogramaIndex;
    }

    public void setMovieTime(long movieTime) {
            this.movieTime = movieTime;
    }

    public long getMovieTime() {
            return this.movieTime;
    }

    public void setTotalTime(long totalTime) {
            this.totalTime = totalTime;
    }

    public long getTotalTime() {
            return this.totalTime;
    }

    //Clase Interna
    public class UnFotograma{
        private Image pic; //imagen del fotograma
        private long endTime; //el tiempo q dura el fotograma

        //Constructor
        public  UnFotograma(Image pic, long endTime) {
            this.pic = pic;
            this.endTime = endTime;
        }        
    }
}