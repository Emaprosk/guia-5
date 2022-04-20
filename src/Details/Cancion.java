package Details;

public class Cancion {
    private String name;
    private int duration;           // Duracion en Segundos.
    private String genero;

    public Cancion(String name, int duration, String genero) {
        this.name = name;
        this.duration = duration;
        this.genero = genero;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public java.lang.String toString() {
        return "Cancion{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", genero=" + genero +
                '}';
    }
}
