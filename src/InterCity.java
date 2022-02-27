public class InterCity extends Tren {
    private boolean vagonRestaurant;

    public InterCity(char ruta, float durata, int numar, boolean vagonRestaurant) {
        super(ruta, durata, numar);
        this.vagonRestaurant = vagonRestaurant;
    }

    @Override
    public void accelereaza() {
        System.out.println("trenul InterCity accelereaza spre urmatoarea gara");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
