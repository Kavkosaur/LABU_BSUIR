package LABU.lab3.lab3_2;

public class Slesar extends factoryWorker implements Worker,Object {
    public Slesar(String name, int workDivision, int level) {
        super(name, workDivision, level);
    }

    public void work(){
        System.out.println("*Звук включаемого паяльника и открытия ящика с инструментами* \n Опять работа.....");


    }
    public void print(){

        System.out.println("Слесарь " + name + "\n Работящий в цеху №"+ workDivision +"\n"+level+" левела");

    }



}
