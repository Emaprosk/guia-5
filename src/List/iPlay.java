package List;

import Details.Cancion;

public interface iPlay {

    void play(Cancion song);
    void addSong(Cancion song);
    void deleteSong();
    void viewListSong();

///region CONSIGNA
    /*
    Crear una interfaz llamada Reproducción, que tendrá los siguientes métodos:
    - Reproducir: Debe mostrar la canción en reproducción, junto con el nombre del
    álbum, género y nombre del artista junto con el artista invitado si es que hay.
    - AñadirCancion: recibe una canción por parámetro y la guarda en la lista en
    reproducción.
    - EliminarCancion: mostrará las canciones de la lista en reproducción y
    permitirá elegir una para eliminar.
    - VerMiLista: Nos permite ver nuestra lista de reproducción
    */
///endregion
}
