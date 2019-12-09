package LABU.lab5;

import java.io.*;

public class WorkWithString {
    String data;
    String filename;
    String choice;
    String choice2;
    RandomAccessFile fio;
    BufferedReader in;

    public WorkWithString() throws UnsupportedEncodingException {
        this.in = new BufferedReader(new InputStreamReader(System.in,"Cp1251"));
    }

    public void runConsole() throws IOException {
        while (true){
            printMenu();
            choice = in.readLine();
            if (choice.compareTo("1") == 0){
                textIntoFile();
            }
            else if (choice.compareTo("2") == 0){
                printRedactMenu();
                choice2 = in.readLine();
                if (choice2.compareTo("1") == 0){
                    addStart();
                }
                else if (choice2.compareTo("2") == 0){
                    addEnd();
                }
                else if (choice2.compareTo("3") == 0){
                    addRandom();
                }
            }
            else if (choice.compareTo("3") == 0){
                textFromFile();
            }
            else if (choice.compareTo("4") == 0){
                return;
            }
/* else if (choice.compareTo("5") == 0){
StringBuffer();
}*/

        }
    }

    public void printMenu(){
        System.out.println("Enter your choice: ");
        System.out.println("1.Enter text and write it to a file");
        System.out.println("2.Edit text in file");
        System.out.println("3.Read text from a file and perform actions on it");
        System.out.println("4.Exit");
        System.out.println("5.delete");
    }


    public void textIntoFile() throws IOException {
        fio = new RandomAccessFile(new File("C:\\Users\\nikita\\Documents\\St.txt"), "r");
        data = fio.readLine();//чтение информации из заданного файла
        fio.close();
        System.out.println("Information from file: " + data);//вывод информации из файла
    }


    public void printRedactMenu(){
        System.out.println("1 - adding text to the beginning of the file");
        System.out.println("2 - adding text to the end of the file");
        System.out.println("3 - adding text to an arbitrary position in the file");
    }

    public void addStart() throws IOException{
        fio = new RandomAccessFile(new File("C:\\Users\\nikita\\Documents\\St.txt"), "rw");
        data = fio.readLine();
        System.out.println("Enter the line to add to the beginning");
        String s;
        s = in.readLine();
        fio.seek(0);
        fio.writeBytes(s);
        fio.seek(s.length());
        fio.writeBytes(data);
        fio.close();
        System.out.println("The line is written to the beginning of the file");
    }


    public void addEnd() throws IOException {//метод добавления текста в конец файла
        fio = new RandomAccessFile(new File("C:\\Users\\nikita\\Documents\\St.txt"), "rw");
        data = fio.readLine();//чтение информации из заданного файла
        System.out.println("Enter the line to add to the end");
        String s;
        s = in.readLine();//ввод строки
        fio.seek(fio.length());//переход в конец файла
        fio.writeBytes(s);//запись введенной строки в конец файла
        fio.close();
        System.out.println("The line is written to the end of the file");
    }

    public void addRandom() throws IOException{
        fio = new RandomAccessFile(new File("C:\\Users\\nikita\\Documents\\St.txt"), "rw");
        System.out.println("Enter a line to add to the specified position in the file");
        String s;
        s = in.readLine();
        System.out.println("Enter the desired position in the file");
        int n;
        n = Integer.parseInt(in.readLine());
        fio.seek(n);
        data = fio.readLine();
        fio.seek(n);
        fio.writeBytes(s);
        fio.writeBytes(data);
        fio.close();
        System.out.println("String written to file.");
    }
/*public void StringBuffer () throws IOException{
fio = new RandomAccessFile(new File("C:\Users\nikita\Documents\St.txt"), "rw");
data = fio.readLine();
System.out.println("Enter the desired position in the file");
int n;
n = Integer.parseInt(in.readLine());
fio.seek(n);
data = fio.readLine();
fio.seek(n);
StringBuffer sb = new StringBuffer(data);
for (n = 0; n < sb.charAt()1; n++){
System.out.println(sb[n]);
sb.delete();
}
fio.close();
System.out.println("String written to file.");
}*/

/*public void StringBuffer () throws IOException{
fio = new RandomAccessFile(new File("C:\Users\nikita\Documents\St.txt"), "rw");
data = fio.readLine();
String s;
s = in.readLine();
System.out.println("Enter the desired position in the file");
int n;
n = Integer.parseInt(in.readLine());
fio.seek(n);
data = fio.readLine();
fio.close();
StringBuffer sb = new StringBuffer(data);
for (int i = 0; i < s.charAt() - 1; i++){

sb.delete(i);
System.out.println(sb);
}
}*/


    public void textFromFile() throws IOException {
        fio = new RandomAccessFile(new File("C:\\Users\\nikita\\Documents\\St.txt"), "r");
        data = fio.readLine();//чтение информации из заданного файла
        fio.close();
        String []arrayWords = data.split(" ");
        String last_1, first_1;
        char first, last;
        for (int i = 0; i < arrayWords.length - 1; i++) {
            first = arrayWords[i+1].charAt(0);
            last = arrayWords[i].charAt(arrayWords[i].length()-1);
            last_1 = toString();

            first_1 = toString();
            if (first == last) {
                System.out.println(arrayWords[i]);
// System.out.println(last_1.equalsIgnoreCase(first_1));
            }
        }
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\nikita\\Documents\\St.txt");
        outputStream.write(data.getBytes());
        outputStream.close();
    }

    public static void main(String[] args) throws UnsupportedEncodingException, IOException {
        WorkWithString n = new WorkWithString();
        n.runConsole();
    }
}

