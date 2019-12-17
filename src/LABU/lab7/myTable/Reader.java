package LABU.lab7.myTable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Reader {
    JButton addButton, deleteButton, clearButton, searchButton;
    static JTextField newName, newFamily, newGenus, newSpecies, newAge;
    static JLabel l1, l2, l3, l4, l5;

    JFrame jFrame;
    JPanel panelButton, panelButton1;
    JTable gardenTable;

    BotanicalGardenTableModel tableModel;
    BotanicalGarden g = null, g1 = null, g2 = null, g3 = null, g4 = null;

    public Reader() {
        jFrame = new JFrame("Растения Ботанического Сада");
        jFrame.setSize(new Dimension(600, 400));
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(new BorderLayout());

        addButton = new JButton("Добавить");
        Color c1 = new Color(164, 210, 213);
        addButton.setBackground(c1);
        addButton.addActionListener(new AddActionListener());
        deleteButton = new JButton("Удалить");
        Color c2 = new Color(214, 168,165);
        deleteButton.setBackground(c2);
        deleteButton.addActionListener(new DeleteActionListener());

        clearButton = new JButton("Очистить");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tableModel.clear();
                tableModel.fireTableDataChanged();
            }
        });
        Color c3 = new Color(169,166,215);
        clearButton.setBackground(c3);

        searchButton = new JButton("Поиск растений");
        searchButton.addActionListener(new SearchActionListener());
        Color c4 = new Color(213,216,166);
        searchButton.setBackground(c4);

        tableModel = new BotanicalGardenTableModel();
        gardenTable = new JTable(tableModel);
        jFrame.add(new JScrollPane(gardenTable), BorderLayout.CENTER);
        jFrame.setVisible(true);

        try {
            g = new BotanicalGarden("Ирис", "Ирисовые", "Ирис", "Германский", "4");
            g1 = new BotanicalGarden("Сосна", "Сосновые", "Сосна", "Крымская", "12");
            g2 = new BotanicalGarden("Ландыш", "Спаржевые", "Ландыш", "Майский", "5");
            g3 = new BotanicalGarden("Бузина", "Адоксовые", "Бузина", "Красная", "2");
            g4 = new BotanicalGarden("Артишок", "Астровые", "Артишок", "Посевной", "1");
        } catch (MyException myException) {
            myException.getException();
        }
        tableModel.addData(g);
        tableModel.addData(g1);
        tableModel.addData(g2);
        tableModel.addData(g3);
        tableModel.addData(g4);

        newName = new JTextField(15);
        newFamily = new JTextField(15);
        newGenus = new JTextField(15);
        newSpecies = new JTextField(15);
        newAge = new JTextField(15);

        l1 = new JLabel("Название растения");
        l2 = new JLabel("Семейство");
        l3 = new JLabel("Вид");
        l4 = new JLabel("Род");
        l5 = new JLabel("Возраст");

        panelButton = new JPanel();
        panelButton.setLayout(new GridLayout());

        panelButton.add(addButton);
        panelButton.add(searchButton);
        panelButton.add(deleteButton);
        panelButton.add(clearButton);
        panelButton.setVisible(true);
        jFrame.add(panelButton, BorderLayout.SOUTH);

        panelButton1 = new JPanel();
        panelButton1.setLayout(new BoxLayout(panelButton1,BoxLayout.Y_AXIS));

        panelButton1.add(l1);
        panelButton1.add(newName);
        panelButton1.add(l2);
        panelButton1.add(newFamily);
        panelButton1.add(l3);
        panelButton1.add(newGenus);
        panelButton1.add(l4);
        panelButton1.add(newSpecies);
        panelButton1.add(l5);
        panelButton1.add(newAge);

        panelButton.setVisible(true);
        jFrame.add(panelButton1, BorderLayout.WEST);
        jFrame.pack();
    }

    public class SearchActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String searchInfo = JOptionPane.showInputDialog(null, "Введите возраст растения для поиска",
                    "Поиск растения", JOptionPane.QUESTION_MESSAGE);
            ArrayList<BotanicalGarden> similarArrayList = tableModel.findSimilar(searchInfo);
            SimilarData similarData = new SimilarData(similarArrayList);
            similarData.setVisible(true);
            similarData.setLocationRelativeTo(null);
        }
    }
    public class AddActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = newName.getText();
            String family = newFamily.getText();
            String genus = newGenus.getText();
            String species = newSpecies.getText();
            String age = newAge.getText();

            try {
                tableModel.addData(new BotanicalGarden(name, family, genus, species, age));
            } catch (MyException myException) {
                myException.getException();
            }

            tableModel.fireTableDataChanged();
            newName.setText("");
            newFamily.setText("");
            newGenus.setText("");
            newSpecies.setText("");
            newAge.setText("");
        }

    }
    public class DeleteActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int i = gardenTable.getSelectedRow();
            if(i >= 0){
                tableModel.removeRow(i);
                tableModel.fireTableDataChanged();
            }
            else JOptionPane.showMessageDialog(null, "Выберите строку для удаления", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }
}