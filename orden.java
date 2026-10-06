public class Orden {

    private String nombreCliente;
    private String ingredientesEspeciales;
    private Pizza pizza;
    private String bebida;
    private String direccion;
    private int numeroMesa;
    private boolean pagada;

    public Orden() {
        nombreCliente = "";
        ingredientesEspeciales = "";
        bebida = "";
        direccion = "";
        numeroMesa = 0;
        pagada = false;
    }

    public Orden(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.ingredientesEspeciales = "";
        this.bebida = "";
        this.direccion = "";
        this.numeroMesa = 0;
        this.pagada = false;
    }

    public void cobrar() {
        pagada = true;
        System.out.println("La orden ha sido cobrada.");
    }

    public boolean añadirProducto(Pizza pizza) {

        if (pizza != null) {
            this.pizza = pizza;
            return true;
        }

        return false;
    }

    public boolean añadirBebida(String bebida) {

        if (bebida != null && !bebida.isEmpty()) {
            this.bebida = bebida;
            return true;
        }

        return false;
    }

    public boolean añadirDireccion(String direccion) {

        if (direccion != null && !direccion.isEmpty()) {
            this.direccion = direccion;
            return true;
        }

        return false;
    }

    public void añadirNumeroMesa(int numeroMesa) {

        if (numeroMesa > 0) {
            this.numeroMesa = numeroMesa;
        }
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(String ingredientesEspeciales) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getBebida() {
        return bebida;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public boolean isPagada() {
        return pagada;
    }
}