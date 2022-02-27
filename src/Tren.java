public abstract class Tren {
    private char ruta;
    private  float durata;
    protected int numar;

    public Tren(char ruta, float durata, int numar) {
        this.ruta = ruta;
        this.durata = durata;
        this.numar = numar;
    }

    public char getRuta() {
        return ruta;
    }

    public void setRuta(char ruta) {
        this.ruta = ruta;
    }

    public float getDurata() {
        return durata;
    }

    public void setDurata(float durata) {
        this.durata = durata;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }
    public abstract void accelereaza();
}
