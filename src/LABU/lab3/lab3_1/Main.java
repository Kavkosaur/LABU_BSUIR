package LABU.lab3.lab3_1;

public class Main {
    public static void main(String[] args) {
        birthDate bd1 = new birthDate(13,3, 1995);
        birthDate bd2 = new birthDate(7,5, 1986);
        birthDate bd3 = new birthDate(1,12, 1994);
        birthDate bd4 = new birthDate(13,3, 1991);

        divisionMaster dm = new divisionMaster("Ivan" , 500 , bd1 ,"Staleliteyniy division", 25 );
        factoryMaster fm = new factoryMaster("Ignat", 1500 ,bd2 , 5.5);
        factoryWorker fw1 = new factoryWorker("Vasiliy", 300 , bd3 , 4 , 5);
        factoryWorker fw2 = new factoryWorker("Artem", 150 , bd4 , 1 , 2);

        System.out.printf(dm.toString());
        System.out.printf(fm.toString());
        System.out.printf(fw1.toString());
        System.out.printf(fw2.toString());




    }
}
