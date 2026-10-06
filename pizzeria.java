public class pizzeria {

    private Orden orden;
    private Cocina cocina;
    private int numeroOrden;

    // Constructor
    public pizzeria() {
        this.cocina = new Cocina();
        this.numeroOrden = 0;
    }

    // Crear una nueva orden
    public Orden crearOrden(String nombreCliente) {

        numeroOrden++;

        orden = new Orden(nombreCliente);

        System.out.println(
            "Orden #" + numeroOrden + " creada para " + nombreCliente
        );

        return orden;
    }

    // Enviar la orden a cocina
    public boolean enviarOrdenCocina() {

        if (orden != null) {
            cocina.recibirOrden();

            System.out.println(
                "Orden #" + numeroOrden + " enviada a cocina."
            );

            return true;
        }

        return false;
    }

    // Obtener número de orden
    public int getNumeroOrden() {
        return numeroOrden;
    }

    // Obtener la orden actual
    public Orden getOrden() {
        return orden;
    }

    // Obtener la cocina
    public Cocina getCocina() {
        return cocina;
    }

    // Obtener el tipo de pizza
    public void tipoPizza() {

            if (orden != null && orden.getPizza() != null) {

        Pizza pizza = orden.getPizza();

        System.out.println("Tipo de pizza:");
        System.out.println("Masa: " + pizza.getTipoMasa());
        System.out.println("Salsa: " + pizza.getTipoSalsa());
        System.out.println("Topping: " + pizza.getToppings());

    } else {
        System.out.println("No hay una pizza registrada.");
    }
}
}