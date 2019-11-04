package LABU.lab3.lab3_2;

public class divisionMaster implements Worker,Object {
    public String name;
    public String divisionName ;
    public int divisionPersonal;
    public divisionMaster() {
    }

    public divisionMaster(String name, String divisionName, int divisionPersonal) {
        this.name = name;
        this.divisionName = divisionName;
        this.divisionPersonal = divisionPersonal;
    }

    public divisionMaster(String name, String divisionName) {
        this.name = name;
        this.divisionName = divisionName;
        this.divisionPersonal = 1;
    }

    public divisionMaster(String name, int divisionPersonal) {
        this.name = name;
        this.divisionPersonal = divisionPersonal;
        this.divisionName = "Unknown Division";
    }

    @Override
    public void print() {
        System.out.println("Элитный работяга "+name+"\n Слудящий за отделением "+divisionName+"\n"+"Состоящиего из "
                +divisionPersonal+" лоботрясов \n\n\n");

    }

    @Override
    public void work() {
        System.out.println("Недельный план за день!!");
    }
}
