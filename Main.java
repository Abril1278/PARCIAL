import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            VistaPizzeria vista = new VistaPizzeria();

            vista.setVisible(true);
        });
    }
}