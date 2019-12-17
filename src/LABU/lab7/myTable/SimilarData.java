package LABU.lab7.myTable;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SimilarData extends JFrame{
    JTable similarTable;
    BotanicalGardenTableModel model;

    public SimilarData(ArrayList<BotanicalGarden> similarArrayList)
    {
        super("Растения с одинаковым возрастом");
        setSize(new Dimension(600, 200));
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        model = new BotanicalGardenTableModel();
        similarTable = new JTable(model);
        add(new JScrollPane(similarTable), BorderLayout.CENTER);
        for(int i = 0; i <  similarArrayList.size();i++)
        {
            model.addData(similarArrayList.get(i));
        }
    }
}