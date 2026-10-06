public class Cocina {

    private int ordenesListas;
    private String datosEspeciales;
    private int ordenesPendientes;
    private String[] ingredientes;

    // Constructor vacío
    public Cocina() {
        this.ordenesListas = 0;
        this.datosEspeciales = "";
        this.ordenesPendientes = 0;
        this.ingredientes = new String[5];
    }

    // Constructor con parámetros
    public Cocina(
        int ordenesListas,
        int ordenesPendientes,
        String datosEspeciales
    ) {
        this.ordenesListas = ordenesListas;
        this.ordenesPendientes = ordenesPendientes;
        this.datosEspeciales = datosEspeciales;
        this.ingredientes = new String[5];
    }

    // Recibir una nueva orden
    public void recibirOrden() {
        ordenesPendientes++;
    }

    // Preparar una orden
    public boolean prepararOrden() {

        if (ordenesPendientes > 0) {
            ordenesPendientes--;
            ordenesListas++;

            System.out.println("Orden preparada correctamente.");

            return true;
        }

        System.out.println("No existen órdenes pendientes.");

        return false;
    }

    // Ordenar ingredientes
    public String[] ordenarIngredientes() {
        return ingredientes;
    }

    // Entregar una orden
    public boolean entregarOrden() {

        if (ordenesListas > 0) {
            ordenesListas--;

            System.out.println("Orden entregada correctamente.");

            return true;
        }

        System.out.println("No existen órdenes listas.");

        return false;
    }

    // Getters y Setters

    public int getOrdenesListas() {
        return ordenesListas;
    }

    public int getOrdenesPendientes() {
        return ordenesPendientes;
    }

    public String getDatosEspeciales() {
        return datosEspeciales;
    }

    public void setDatosEspeciales(String datosEspeciales) {
        this.datosEspeciales = datosEspeciales;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }
}