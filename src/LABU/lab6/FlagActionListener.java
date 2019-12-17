package LABU.lab6;


public class FlagActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        k = 0;
        if(e.getSource() == flag1){
            k++;
        }
        else if(e.getSource() == flag2){
            k--;
        }
    }
}
