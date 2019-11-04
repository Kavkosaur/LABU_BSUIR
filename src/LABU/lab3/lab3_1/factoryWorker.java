package LABU.lab3.lab3_1;

public class factoryWorker extends Worker {
    int workDivision , level ;

    public factoryWorker(String fio, double workExperience, double zp, Sex sex, LABU.lab3.lab3_1.birthDate birthDate, int workDivision, int level) {
        super(fio, workExperience, zp, sex, birthDate);
        this.workDivision = workDivision;
        this.level = level;
    }

    public factoryWorker(String fio, double workExperience, double zp, LABU.lab3.lab3_1.birthDate birthDate, int workDivision, int level) {
        super(fio, workExperience, zp, birthDate);
        this.workDivision = workDivision;
        this.level = level;
    }

    public factoryWorker(String fio, double zp, LABU.lab3.lab3_1.birthDate birthDate, int workDivision, int level) {
        super(fio, zp, birthDate);
        this.workDivision = workDivision;
        this.level = level;
    }

    public factoryWorker(int workDivision, int level) {
        this.workDivision = workDivision;
        this.level = level;
    }

    public factoryWorker() {
        this.workDivision = 0;
        this.level = 0;
    }

    @Override
    public double getNologi() {
        double tax ;
        tax = nologi (zp, 0.15 );
        return tax;
    }

    @Override
    public String toString() {
        return super.toString() + "Work division"+workDivision + "\n Work Exp."+workExperience+"\n\n\n";
    }
}
