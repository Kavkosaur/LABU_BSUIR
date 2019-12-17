package LABU.lab6;

public class BoxActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == box_1){
            boxA = box_1.getSelectedItem();
        }
        if(e.getSource() == box_2){
            boxB = box_2.getSelectedItem();
        }
        if(e.getSource() == box_3){
            boxC = box_3.getSelectedItem();

        }
    }
}
}