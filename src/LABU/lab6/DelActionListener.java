package LABU.lab6;

public class DelActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == del){
            text.setText(null);
            area.setText(null);

        }
    }
}