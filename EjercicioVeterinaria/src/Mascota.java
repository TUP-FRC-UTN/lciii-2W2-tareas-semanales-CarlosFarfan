public class Mascota {
    private String nombreMascota;
    private double edadMascota;

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public double getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(double edadMascota) {
        this.edadMascota = edadMascota;
    }

    public Mascota(){

    }

    public Mascota(String nombreMascota, double edadMascota) {
        this.nombreMascota = nombreMascota;
        this.edadMascota = edadMascota;
    }

    @Override
    public String toString() {
        return "Nombre Mascota: " + nombreMascota + "\n" +
                "Edad Mascota: " + edadMascota;
    }

}
