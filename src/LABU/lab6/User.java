package LABU.lab6;

    import java.awt.*;

    public class User {
        public static void main(String[] args) {
            Reader med = new Reader("Регистрация игрушек");
            med.setVisible(true);
            med.setResizable(false);
            med.setLocationRelativeTo(null);
            med.getContentPane().setBackground(new Color(255,192,203));
        }
    }
