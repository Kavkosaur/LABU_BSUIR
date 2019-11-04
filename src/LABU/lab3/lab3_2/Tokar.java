package LABU.lab3.lab3_2;

public class Tokar extends factoryWorker implements Worker,Object{
    public Tokar(String name, int workDivision, int level) {
        super(name, workDivision, level);
    }

    public void work(){
        System.out.println("*Звук включаемого станка* \n Опять работа.....");


    }
    public void print(){

        System.out.println("Токарь " + name + "\n Работящий в цеху №"+ workDivision +"\n"+level+" левела");

    }



}
