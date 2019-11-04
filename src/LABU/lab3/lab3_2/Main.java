package LABU.lab3.lab3_2;

public class Main {
    public static void main(String[] args) {
        divisionMaster dm = new divisionMaster("Игнат",13);
        factoryMaster fm = new factoryMaster("Аркадий");
        Tokar fw1 = new Tokar("Саня",4,80);
        Slesar fw2 = new Slesar("Вася" , 6 , 80);

        dm.print();
        dm.work();
        fw1.print();
        fw1.work();
        fw2.print();
        fw2.work();
        fm.print();
        fm.work();


    }
}
