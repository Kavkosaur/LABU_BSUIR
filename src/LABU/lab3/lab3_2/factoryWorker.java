package LABU.lab3.lab3_2;

 abstract class factoryWorker implements Object,Worker{
     String name;
     int workDivision , level ;

     public String getName() {
         return name;
     }

     public int getWorkDivision() {
         return workDivision;
     }

     public int getLevel() {
         return level;
     }



     public void work (){

         System.out.println("ОПЯЯЯТЬ РАБОТА..........");
     }
     public void print(){
         System.out.println("Обычный работяга "+name+"\n Работящий в отделении "+workDivision+"\n"+level+"левела \n\n\n");

     }

     public factoryWorker(String name, int workDivision, int level) {
         this.name = name;
         this.workDivision = workDivision;
         this.level = level;
     }

     public factoryWorker(String name, int workDivision) {
         this.name = name;
         this.workDivision = workDivision;
         this.level = level;
     }

     public factoryWorker() {
     }
 }
