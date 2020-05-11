public class Cliente extends Mascota {
    private int numeroCliente;
    private String nombreCliente;
    private double antiguedadCliente;

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getAntiguedadCliente() {
        return antiguedadCliente;
    }

    public void setAntiguedadCliente(double antiguedadCliente) {
        this.antiguedadCliente = antiguedadCliente;
    }

    public Cliente(){

    }

    public Cliente(int numeroCliente, String nombreCliente, double antiguedadCliente, String nombreMascota, double edadMascota) {
        super(nombreMascota, edadMascota);
        this.numeroCliente = numeroCliente;
        this.nombreCliente = nombreCliente;
        this.antiguedadCliente = antiguedadCliente;
    }

    @Override
    public String toString() {
        return "Número de Cliente: " + numeroCliente + "\n" +
                "Nombre Cliente: " + nombreCliente + "\n" +
                "Antiguedad Cliente: " + antiguedadCliente + "\n" +
                "Nombre de la mascota: " + getNombreMascota() + "\n" +
                "Edad de la mascota: " + getEdadMascota();
    }

}