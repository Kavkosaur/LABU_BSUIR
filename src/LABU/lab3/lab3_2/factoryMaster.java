package LABU.lab3.lab3_2;

public class factoryMaster implements Worker,Object{
    double termOfElection;
    String name;

    public factoryMaster(double termOfElection, String name) {
        this.termOfElection = termOfElection;
        this.name = name;
    }

    public factoryMaster(String name) {
        this.name = name;
        this.termOfElection = 99999999.999999;
    }

    @Override
    public void print() {
        System.out.println("Босс "+name+"\n Избранный работягами на "+termOfElection+"лет \n\n\n\n");
    }

    @Override
    public void work() {
        System.out.println("ОПАСНОСТЬ! \n Вы пытаетесь заставить работать босса \nЗа неповиновение вас отправляют работать в Сибирь");

    }
}
