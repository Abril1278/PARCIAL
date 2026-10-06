public class Main {

    public static void main(String[] args) {

        pizzeria pizzeria = new pizzeria();

        Pizza pizza = new Pizza(
            TIPOMASA.DELGADA,
            TIPOSALSA.NORMAL,
            TOPPINGS.PEPPERONNI
        );

        Orden orden = pizzeria.crearOrden("Emily");

        orden.añadirProducto(pizza);

        orden.añadirBebida("Coca Cola");

        orden.añadirNumeroMesa(5);

        orden.setIngredientesEspeciales(
            "Extra queso"
        );

        pizzeria.tipoPizza();

        orden.cobrar();

        pizzeria.enviarOrdenCocina();

        pizzeria.getCocina().prepararOrden();

        pizzeria.getCocina().entregarOrden();
    }
}