import Details.Cancion;
import Details.Genero;
import List.BasicList;
import Details.Spotify;



public class Main {
    public static void main(String[] args) {
        Spotify sp = new Spotify();
        BasicList bL = new BasicList("Lista Basica");
        System.out.println(bL);
        Cancion song1 = new Cancion("Levels", 120, Genero.CLASICA);
        bL.addSong(song1);

    }
}
