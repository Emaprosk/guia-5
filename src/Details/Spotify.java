package Details;

import List.BasicList;

import java.util.ArrayList;
import java.util.Stack;

public class Spotify {

    public ArrayList<Cancion> crearArraylistCanciones(){
        ArrayList<Cancion> listCanciones = new ArrayList<>();
        Cancion song1= new Cancion("Waka waka",120,Genero.POP);
        Cancion song2= new Cancion("Goteo", 120,Genero.TRAP);
        Cancion song3= new Cancion("Salio el Sol",120, Genero.POP);
        Cancion song4= new Cancion("Parabrisas",120,Genero.POP);

        listCanciones.add(song1);
        listCanciones.add(song2);
        listCanciones.add(song3);
        listCanciones.add(song4);

        return listCanciones;
    }

    public BasicList crearListaBasica(){
        ArrayList<Cancion> listC = crearArraylistCanciones();
        Stack<Cancion> pilaSong = new Stack<>();
        pilaSong.addAll(listC);

        BasicList bList = new BasicList("myList");
        return bList;
    }
}
