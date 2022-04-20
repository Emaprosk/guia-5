package List;

import Details.Cancion;
import Details.Spotify;

import java.util.ArrayList;
import java.util.Stack;

public class BasicList extends Spotify implements iPlay {

    private String name;
    private Stack<Cancion> myList;

    public BasicList(String name) {
        this.name = name;

        ArrayList<Cancion> listC = crearArraylistCanciones();

        Stack<Cancion> aux = new Stack<>();
        aux.addAll(listC);
        this.myList= aux;
    }

    @Override
    public void play(Cancion song) {

    }

    @Override
    public void addSong(Cancion song) {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    @Override
    public void deleteSong() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");

    }

    @Override
    public void viewListSong() {

    }

    @Override
    public String toString() {
        return "BasicList{" +
                "name='" + name + '\'' +
                ", myList=" + myList +
                '}';
    }
}
