package LABU.lab4;

import java.io.*;

public class Stock {
    private String name;
    private boolean inStock;
    private int price;
    private int amountInStock;

    Stock() throws IOException {
        String str;
//открываем символьный поток ввода
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in, "Cp1251"));
        System.out.println("Введите наименование товара : ");
        this.name = input.readLine();
        System.out.println("Введите цену товара : ");
        this.price = Integer.parseInt(input.readLine());
        while (true) {
            System.out.println("Наличие на складе (Да/Нет): ");
            str = input.readLine();
            if ("Yes".equals(str)) {
                this.inStock = true;
                System.out.println("Введите количество товара :");
                this.amountInStock = Integer.parseInt(input.readLine());
                break;
            }
            if ("No".equals(str)) {
                this.inStock = false;
                this.amountInStock = 0;
                break;
            }
            System.out.println("Ошибка! Повторите ввод");
        }
    }

    //записываем информацию в файл St.txt
    public void InputInFile() throws IOException {
        File file = new File("C:\\Users\\nikita\\Documents\\St.txt");
        file.deleteOnExit();
        FileWriter writer;
        writer = new FileWriter(file, true);
        writer.append("\nТовар: " + this.name + "; Цена : " + this.price + "; ");
        if (this.inStock)
            writer.append("есть на складе.\n");
        else writer.append("нет на складе.\n");
        writer.flush();
        writer.close();
    }


    public static void OutputOfFile() throws IOException {
        File file = new File("St.txt");
        FileReader reader;
        char buffer[];
        int numb;
        buffer = new char[1];
        reader = new FileReader(file);
        do {
            numb = reader.read(buffer);
            System.out.print(buffer[0]);
        } while (numb == 1);
        reader.close();
    }


    public static int price(Stock[] Stock) {
        int p = 0;
        for (int i = 0; i < 3; i++) {
            p += Stock[i].price;
        }
        return p;
    }

    //метод для вычисления количества хвостатых
    public static int overallAmountInStock(Stock[] Stock) {
        int inStock = 0;
        for (int i = 0; i < 3; i++)
            if (Stock[i].inStock == true) { //если имеет долг, то увеличиваем счётчик
                inStock += Stock[i].amountInStock;

            }
        return inStock;
    }
    public static void main(String[] args) throws IOException {
        Stock[] stocks;
        stocks = new Stock[3];
        for (int i = 0; i < 3; i++)
            stocks[i] = new Stock();
        for (int i = 0; i < 3; i++)
            stocks[i].InputInFile();
        OutputOfFile();

        System.out.println("average sum of prices: "+ Stock.price(stocks));
        System.out.println("Overall Amount In Stock: "+ Stock.overallAmountInStock(stocks));

    }


}




