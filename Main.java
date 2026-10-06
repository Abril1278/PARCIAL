import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // En tu proyecto la clase pizzeria esta en minuscula
        pizzeria pizzeria = new pizzeria();

        System.out.println("==============================");
        System.out.println("          PIZZERIA");
        System.out.println("==============================");

        // NOMBRE
        System.out.print("Ingrese su nombre: ");
        String nombreCliente = scanner.nextLine();

        Orden orden = pizzeria.crearOrden(nombreCliente);

        // ==================================
        // MASA
        // ==================================

        System.out.println("\nTIPO DE MASA");
        System.out.println("1. Delgada");
        System.out.println("2. Gruesa");
        System.out.println("3. Vegana");
        System.out.println("4. Integral");
        System.out.print("Seleccione: ");

        int opcionMasa = scanner.nextInt();

        TIPOMASA tipoMasa;

        switch (opcionMasa) {

            case 1:
                tipoMasa = TIPOMASA.DELGADA;
                break;

            case 2:
                tipoMasa = TIPOMASA.GRUESA;
                break;

            case 3:
                tipoMasa = TIPOMASA.VEGANA;
                break;

            case 4:
                tipoMasa = TIPOMASA.INTEGRAL;
                break;

            default:
                tipoMasa = TIPOMASA.DELGADA;
                break;
        }

        // ==================================
        // SALSA
        // ==================================

        System.out.println("\nTIPO DE SALSA");
        System.out.println("1. Normal");
        System.out.println("2. Picante");
        System.out.println("3. Barbacoa");
        System.out.println("4. Queso");
        System.out.println("5. Hongos");
        System.out.print("Seleccione: ");

        int opcionSalsa = scanner.nextInt();

        TIPOSALSA tipoSalsa;

        switch (opcionSalsa) {

            case 1:
                tipoSalsa = TIPOSALSA.NORMAL;
                break;

            case 2:
                tipoSalsa = TIPOSALSA.PICANTE;
                break;

            case 3:
                tipoSalsa = TIPOSALSA.BARBACOA;
                break;

            case 4:
                tipoSalsa = TIPOSALSA.QUESO;
                break;

            case 5:
                tipoSalsa = TIPOSALSA.HONGOS;
                break;

            default:
                tipoSalsa = TIPOSALSA.NORMAL;
                break;
        }

        // ==================================
        // TOPPING
        // ==================================

        System.out.println("\nTOPPING");
        System.out.println("1. Pepperonni");
        System.out.println("2. Jamon");
        System.out.println("3. Salchicha");
        System.out.println("4. Carne");
        System.out.println("5. Esparragos");
        System.out.print("Seleccione: ");

        int opcionTopping = scanner.nextInt();

        TOPPINGS topping;

        switch (opcionTopping) {

            case 1:
                topping = TOPPINGS.PEPPERONNI;
                break;

            case 2:
                topping = TOPPINGS.JAMON;
                break;

            case 3:
                topping = TOPPINGS.SALCHICHA;
                break;

            case 4:
                topping = TOPPINGS.CARNE;
                break;

            case 5:
                topping = TOPPINGS.ESPARRAGOS;
                break;

            default:
                topping = TOPPINGS.PEPPERONNI;
                break;
        }

        // ==================================
        // CREAR PIZZA
        // ==================================

        Pizza pizza = new Pizza(
            tipoMasa,
            tipoSalsa,
            topping
        );

        orden.añadirProducto(pizza);

        scanner.nextLine();

        // ==================================
        // INGREDIENTES ESPECIALES
        // ==================================

        System.out.println(
            "\nDesea ingredientes especiales?"
        );

        System.out.println("1. Si");
        System.out.println("2. No");
        System.out.print("Seleccione: ");

        int opcionEspecial = scanner.nextInt();

        scanner.nextLine();

        String ingredientesEspeciales = "Ninguno";

        if (opcionEspecial == 1) {

            System.out.print(
                "Escriba los ingredientes especiales: "
            );

            ingredientesEspeciales =
                scanner.nextLine();

            // Lo guardamos en Orden
            orden.setIngredientesEspeciales(
                ingredientesEspeciales
            );
        }

        // ==================================
        // BEBIDA
        // ==================================

        System.out.println("\nBEBIDA");
        System.out.println("1. Coca Cola");
        System.out.println("2. Pepsi");
        System.out.println("3. Agua");
        System.out.println("4. Te frio");
        System.out.println("5. Sin bebida");
        System.out.print("Seleccione: ");

        int opcionBebida = scanner.nextInt();

        switch (opcionBebida) {

            case 1:
                orden.añadirBebida("Coca Cola");
                break;

            case 2:
                orden.añadirBebida("Pepsi");
                break;

            case 3:
                orden.añadirBebida("Agua");
                break;

            case 4:
                orden.añadirBebida("Te frio");
                break;

            case 5:
                orden.añadirBebida("Sin bebida");
                break;

            default:
                orden.añadirBebida("Sin bebida");
                break;
        }

        // ==================================
        // TIPO DE PEDIDO
        // ==================================

        System.out.println("\nTIPO DE PEDIDO");
        System.out.println("1. Comer en la pizzeria");
        System.out.println("2. Pedido a domicilio");
        System.out.print("Seleccione: ");

        int tipoPedido = scanner.nextInt();

        scanner.nextLine();

        if (tipoPedido == 1) {

            System.out.print(
                "Numero de mesa: "
            );

            int numeroMesa = scanner.nextInt();

            orden.añadirNumeroMesa(numeroMesa);

        } else if (tipoPedido == 2) {

            System.out.print(
                "Direccion: "
            );

            String direccion =
                scanner.nextLine();

            orden.añadirDireccion(direccion);
        }

        // ==================================
        // RESUMEN
        // ==================================

        System.out.println();
        System.out.println("==============================");
        System.out.println("       RESUMEN DE ORDEN");
        System.out.println("==============================");

        System.out.println(
            "Cliente: "
            + orden.getNombreCliente()
        );

        System.out.println(
            "Masa: "
            + tipoMasa
        );

        System.out.println(
            "Salsa: "
            + tipoSalsa
        );

        System.out.println(
            "Topping: "
            + topping
        );

        System.out.println(
            "Ingredientes especiales: "
            + ingredientesEspeciales
        );

        System.out.println(
            "Bebida: "
            + orden.getBebida()
        );

        if (tipoPedido == 1) {

            System.out.println(
                "Mesa: "
                + orden.getNumeroMesa()
            );

        } else if (tipoPedido == 2) {

            System.out.println(
                "Direccion: "
                + orden.getDireccion()
            );
        }

        // ==================================
        // CONFIRMACION
        // ==================================

        System.out.println();
        System.out.println(
            "Desea confirmar la orden?"
        );

        System.out.println("1. Si");
        System.out.println("2. No");
        System.out.print("Seleccione: ");

        int confirmar = scanner.nextInt();

        if (confirmar == 1) {

            System.out.println();
            System.out.println(
                "Procesando orden..."
            );

            orden.cobrar();

            pizzeria.enviarOrdenCocina();

            pizzeria
                .getCocina()
                .prepararOrden();

            pizzeria
                .getCocina()
                .entregarOrden();

            System.out.println();
            System.out.println("==============================");
            System.out.println("       ORDEN COMPLETADA");
            System.out.println("==============================");

            System.out.println(
                "Gracias por su compra, "
                + orden.getNombreCliente()
                + "!"
            );

        } else {

            System.out.println();
            System.out.println(
                "Orden cancelada."
            );
        }

        scanner.close();
    }
}