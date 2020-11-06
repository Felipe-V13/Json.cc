public class Cartas {
    private int id;
    private String nombre;
    private int daño;
    private int coste;
    private int vida;
    private int hechizo;
    private int cartas;

    public Cartas() {

    }

    public Cartas(int id,String nombre, int daño, int coste, int vida, int hechizo, int cartas) {
        this.id = id;
        this.nombre = nombre;
        this.daño = daño;
        this.coste = coste;
        this.vida = vida;
        this.hechizo = hechizo;
        this.cartas = cartas;


    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getHechizo() {
        return hechizo;
    }

    public void setHechizo(int hechizo) {
        this.hechizo = hechizo;
    }

    public int getCartas() {
        return cartas;
    }

    public void setCartas(int cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Cartas{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", daño=" + daño +
                ", coste=" + coste +
                ", vida=" + vida +
                ", hechizo=" + hechizo +
                ", cartas=" + cartas +
                '}';
    }
}
