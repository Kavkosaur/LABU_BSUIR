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



     public abstract void work ();
     public abstract void print();

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
