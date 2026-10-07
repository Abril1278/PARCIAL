import javax.swing.*;
import java.awt.*;

public class VistaPizzeria extends JFrame {

    

    private Pizza pizza;
    private Orden orden;

    

    private TIPOMASA masaSeleccionada;
    private TIPOSALSA salsaSeleccionada;
    private TOPPINGS toppingSeleccionado;
    private String bebidaSeleccionada;


    private JPanel panelPrincipal;

    private JTextField txtNombre;
    private JTextField txtIngredientes;

    private JLabel lblMasaSeleccionada;
    private JLabel lblSalsaSeleccionada;
    private JLabel lblToppingSeleccionado;
    private JLabel lblBebidaSeleccionada;

    private JTextArea areaResultado;


    public VistaPizzeria() {

        
        setTitle("Pizzeria");

        setSize(700, 750);

        setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
        );

        setLocationRelativeTo(null);

        
        panelPrincipal = new JPanel();

        panelPrincipal.setLayout(
            new BoxLayout(
                panelPrincipal,
                BoxLayout.Y_AXIS
            )
        );


        JLabel titulo =
            new JLabel("Papa Johns");

        titulo.setFont(
            new Font(
                "Cursive",
                Font.BOLD,
                25
            )
        );

        titulo.setAlignmentX(
            Component.CENTER_ALIGNMENT
        );

        panelPrincipal.add(titulo);

        panelPrincipal.add(
            Box.createVerticalStrut(15)
        );


        JPanel panelNombre =
            new JPanel();

        panelNombre.add(
            new JLabel("Nombre del cliente:")
        );

        txtNombre =
            new JTextField(20);

        panelNombre.add(txtNombre);

        panelPrincipal.add(panelNombre);


        JPanel panelMasa =
            new JPanel();

        panelMasa.setBorder(
            BorderFactory.createTitledBorder(
                "Seleccione la masa"
            )
        );

        JButton btnDelgada =
            new JButton("Delgada");

        JButton btnGruesa =
            new JButton("Gruesa");

        JButton btnVegana =
            new JButton("Vegana");

        JButton btnIntegral =
            new JButton("Integral");

        panelMasa.add(btnDelgada);
        panelMasa.add(btnGruesa);
        panelMasa.add(btnVegana);
        panelMasa.add(btnIntegral);

        panelPrincipal.add(panelMasa);

        lblMasaSeleccionada =
            new JLabel(
                "Masa seleccionada: Ninguna"
            );

        lblMasaSeleccionada.setAlignmentX(
            Component.CENTER_ALIGNMENT
        );

        panelPrincipal.add(
            lblMasaSeleccionada
        );


        btnDelgada.addActionListener(
            e -> {

                masaSeleccionada =
                    TIPOMASA.DELGADA;

                lblMasaSeleccionada.setText(
                    "Masa seleccionada: DELGADA"
                );
            }
        );

        btnGruesa.addActionListener(
            e -> {

                masaSeleccionada =
                    TIPOMASA.GRUESA;

                lblMasaSeleccionada.setText(
                    "Masa seleccionada: GRUESA"
                );
            }
        );

        btnVegana.addActionListener(
            e -> {

                masaSeleccionada =
                    TIPOMASA.VEGANA;

                lblMasaSeleccionada.setText(
                    "Masa seleccionada: VEGANA"
                );
            }
        );

        btnIntegral.addActionListener(
            e -> {

                masaSeleccionada =
                    TIPOMASA.INTEGRAL;

                lblMasaSeleccionada.setText(
                    "Masa seleccionada: INTEGRAL"
                );
            }
        );



        JPanel panelSalsa =
            new JPanel();

        panelSalsa.setBorder(
            BorderFactory.createTitledBorder(
                "Seleccione la salsa"
            )
        );

        JButton btnNormal =
            new JButton("Normal");

        JButton btnPicante =
            new JButton("Picante");

        JButton btnBarbacoa =
            new JButton("Barbacoa");

        JButton btnQueso =
            new JButton("Queso");

        JButton btnHongos =
            new JButton("Hongos");

        panelSalsa.add(btnNormal);
        panelSalsa.add(btnPicante);
        panelSalsa.add(btnBarbacoa);
        panelSalsa.add(btnQueso);
        panelSalsa.add(btnHongos);

        panelPrincipal.add(panelSalsa);

        lblSalsaSeleccionada =
            new JLabel(
                "Salsa seleccionada: Ninguna"
            );

        lblSalsaSeleccionada.setAlignmentX(
            Component.CENTER_ALIGNMENT
        );

        panelPrincipal.add(
            lblSalsaSeleccionada
        );


        btnNormal.addActionListener(
            e -> {

                salsaSeleccionada =
                    TIPOSALSA.NORMAL;

                lblSalsaSeleccionada.setText(
                    "Salsa seleccionada: NORMAL"
                );
            }
        );

        btnPicante.addActionListener(
            e -> {

                salsaSeleccionada =
                    TIPOSALSA.PICANTE;

                lblSalsaSeleccionada.setText(
                    "Salsa seleccionada: PICANTE"
                );
            }
        );

        btnBarbacoa.addActionListener(
            e -> {

                salsaSeleccionada =
                    TIPOSALSA.BARBACOA;

                lblSalsaSeleccionada.setText(
                    "Salsa seleccionada: BARBACOA"
                );
            }
        );

        btnQueso.addActionListener(
            e -> {

                salsaSeleccionada =
                    TIPOSALSA.QUESO;

                lblSalsaSeleccionada.setText(
                    "Salsa seleccionada: QUESO"
                );
            }
        );

        btnHongos.addActionListener(
            e -> {

                salsaSeleccionada =
                    TIPOSALSA.HONGOS;

                lblSalsaSeleccionada.setText(
                    "Salsa seleccionada: HONGOS"
                );
            }
        );


        JPanel panelToppings =
            new JPanel();

        panelToppings.setBorder(
            BorderFactory.createTitledBorder(
                "Seleccione el topping"
            )
        );

        JButton btnPepperonni =
            new JButton("Pepperonni");

        JButton btnJamon =
            new JButton("Jamon");

        JButton btnSalchicha =
            new JButton("Salchicha");

        JButton btnCarne =
            new JButton("Carne");

        JButton btnEsparragos =
            new JButton("Esparragos");

        panelToppings.add(btnPepperonni);
        panelToppings.add(btnJamon);
        panelToppings.add(btnSalchicha);
        panelToppings.add(btnCarne);
        panelToppings.add(btnEsparragos);

        panelPrincipal.add(panelToppings);

        lblToppingSeleccionado =
            new JLabel(
                "Topping seleccionado: Ninguno"
            );

        lblToppingSeleccionado.setAlignmentX(
            Component.CENTER_ALIGNMENT
        );

        panelPrincipal.add(
            lblToppingSeleccionado
        );

        // EVENTOS TOPPINGS

        btnPepperonni.addActionListener(
            e -> {

                toppingSeleccionado =
                    TOPPINGS.PEPPERONNI;

                lblToppingSeleccionado.setText(
                    "Topping seleccionado: PEPPERONNI"
                );
            }
        );

        btnJamon.addActionListener(
            e -> {

                toppingSeleccionado =
                    TOPPINGS.JAMON;

                lblToppingSeleccionado.setText(
                    "Topping seleccionado: JAMON"
                );
            }
        );

        btnSalchicha.addActionListener(
            e -> {

                toppingSeleccionado =
                    TOPPINGS.SALCHICHA;

                lblToppingSeleccionado.setText(
                    "Topping seleccionado: SALCHICHA"
                );
            }
        );

        btnCarne.addActionListener(
            e -> {

                toppingSeleccionado =
                    TOPPINGS.CARNE;

                lblToppingSeleccionado.setText(
                    "Topping seleccionado: CARNE"
                );
            }
        );

        btnEsparragos.addActionListener(
            e -> {

                toppingSeleccionado =
                    TOPPINGS.ESPARRAGOS;

                lblToppingSeleccionado.setText(
                    "Topping seleccionado: ESPARRAGOS"
                );
            }
        );


        JPanel panelIngredientes =
            new JPanel();

        panelIngredientes.add(
            new JLabel(
                "Ingredientes especiales si/no:"
            )
        );

        txtIngredientes =
            new JTextField(20);

        panelIngredientes.add(
            txtIngredientes
        );

        panelPrincipal.add(
            panelIngredientes
        );


        JPanel panelBebidas =
            new JPanel();

        panelBebidas.setBorder(
            BorderFactory.createTitledBorder(
                "Seleccione la bebida"
            )
        );

        JButton btnCocaCola =
            new JButton("Coca Cola");

        JButton btnPepsi =
            new JButton("Pepsi");

        JButton btnAgua =
            new JButton("Agua");

        JButton btnTe =
            new JButton("Te frio");

        JButton btnSinBebida =
            new JButton("Sin bebida");

        panelBebidas.add(btnCocaCola);
        panelBebidas.add(btnPepsi);
        panelBebidas.add(btnAgua);
        panelBebidas.add(btnTe);
        panelBebidas.add(btnSinBebida);

        panelPrincipal.add(panelBebidas);

        lblBebidaSeleccionada =
            new JLabel(
                "Bebida seleccionada: Ninguna"
            );

        lblBebidaSeleccionada.setAlignmentX(
            Component.CENTER_ALIGNMENT
        );

        panelPrincipal.add(
            lblBebidaSeleccionada
        );

        // EVENTOS BEBIDAS

        btnCocaCola.addActionListener(
            e -> {

                bebidaSeleccionada =
                    "Coca Cola";

                lblBebidaSeleccionada.setText(
                    "Bebida seleccionada: Coca Cola"
                );
            }
        );

        btnPepsi.addActionListener(
            e -> {

                bebidaSeleccionada =
                    "Pepsi";

                lblBebidaSeleccionada.setText(
                    "Bebida seleccionada: Pepsi"
                );
            }
        );

        btnAgua.addActionListener(
            e -> {

                bebidaSeleccionada =
                    "Agua";

                lblBebidaSeleccionada.setText(
                    "Bebida seleccionada: Agua"
                );
            }
        );

        btnTe.addActionListener(
            e -> {

                bebidaSeleccionada =
                    "Te frio";

                lblBebidaSeleccionada.setText(
                    "Bebida seleccionada: Te frio"
                );
            }
        );

        btnSinBebida.addActionListener(
            e -> {

                bebidaSeleccionada =
                    "Sin bebida";

                lblBebidaSeleccionada.setText(
                    "Bebida seleccionada: Sin bebida"
                );
            }
        );


        JPanel panelBotones =
            new JPanel();

        JButton btnRealizarOrden =
            new JButton(
                "REALIZAR ORDEN"
            );

        JButton btnLimpiar =
            new JButton(
                "LIMPIAR"
            );

        panelBotones.add(
            btnRealizarOrden
        );

        panelBotones.add(
            btnLimpiar
        );

        panelPrincipal.add(
            panelBotones
        );


        areaResultado =
            new JTextArea(
                10,
                45
            );

        areaResultado.setEditable(
            false
        );

        JScrollPane scroll =
            new JScrollPane(
                areaResultado
            );

        panelPrincipal.add(
            scroll
        );


        btnRealizarOrden.addActionListener(
            e -> realizarOrden()
        );


        btnLimpiar.addActionListener(
            e -> limpiar()
        );

        JScrollPane scrollPrincipal =
            new JScrollPane(
                panelPrincipal
            );

        add(scrollPrincipal);

        setVisible(true);
    }


    private void realizarOrden() {

        String nombre =
            txtNombre.getText().trim();

        String ingredientes =
            txtIngredientes.getText().trim();


        if (nombre.isEmpty()) {

            JOptionPane.showMessageDialog(
                this,
                "Ingrese el nombre del cliente."
            );

            return;
        }

        if (masaSeleccionada == null) {

            JOptionPane.showMessageDialog(
                this,
                "Seleccione un tipo de masa."
            );

            return;
        }

        if (salsaSeleccionada == null) {

            JOptionPane.showMessageDialog(
                this,
                "Seleccione un tipo de salsa."
            );

            return;
        }

        if (toppingSeleccionado == null) {

            JOptionPane.showMessageDialog(
                this,
                "Seleccione un topping."
            );

            return;
        }

        if (bebidaSeleccionada == null) {

            JOptionPane.showMessageDialog(
                this,
                "Seleccione una bebida."
            );

            return;
        }

        // =====================================
        // OBJETO TIPO PIZZA
        // =====================================

        pizza = new Pizza(
            masaSeleccionada,
            salsaSeleccionada,
            toppingSeleccionado
        );


        orden = new Orden(
            nombre
        );

        // Agregar objeto Pizza
        // dentro del objeto Orden
        orden.añadirProducto(
            pizza
        );

        // Ingredientes especiales
        if (!ingredientes.isEmpty()) {

            orden.setIngredientesEspeciales(
                ingredientes
            );
        }

        // Bebida
        orden.añadirBebida(
            bebidaSeleccionada
        );


        areaResultado.setText(
            "=========== ORDEN ===========\n"
        );

        areaResultado.append(
            "Cliente: "
            + orden.getNombreCliente()
            + "\n"
        );

        areaResultado.append(
            "Masa: "
            + masaSeleccionada
            + "\n"
        );

        areaResultado.append(
            "Salsa: "
            + salsaSeleccionada
            + "\n"
        );

        areaResultado.append(
            "Topping: "
            + toppingSeleccionado
            + "\n"
        );

        if (!ingredientes.isEmpty()) {

            areaResultado.append(
                "Ingredientes especiales: "
                + ingredientes
                + "\n"
            );

        } else {

            areaResultado.append(
                "Ingredientes especiales: Ninguno\n"
            );
        }

        areaResultado.append(
            "Bebida: "
            + bebidaSeleccionada
            + "\n"
        );

        areaResultado.append(
            "=============================\n"
        );

        areaResultado.append(
            "Orden realizada correctamente."
        );

        JOptionPane.showMessageDialog(
            this,
            "Orden realizada correctamente."
        );
    }


    private void limpiar() {

        txtNombre.setText("");

        txtIngredientes.setText("");

        masaSeleccionada = null;

        salsaSeleccionada = null;

        toppingSeleccionado = null;

        bebidaSeleccionada = null;

        lblMasaSeleccionada.setText(
            "Masa seleccionada: Ninguna"
        );

        lblSalsaSeleccionada.setText(
            "Salsa seleccionada: Ninguna"
        );

        lblToppingSeleccionado.setText(
            "Topping seleccionado: Ninguno"
        );

        lblBebidaSeleccionada.setText(
            "Bebida seleccionada: Ninguna"
        );

        areaResultado.setText("");

        pizza = null;

        orden = null;
    }
}