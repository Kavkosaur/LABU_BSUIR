package LABU.lab3.lab3_1;

public class factoryMaster extends Worker {
    double termOfElection;

    public factoryMaster(String fio, double workExperience, double zp, Sex sex, LABU.lab3.lab3_1.birthDate birthDate, double termOfElection) {
        super(fio, workExperience, zp, sex, birthDate);
        this.termOfElection = termOfElection;
    }

    public factoryMaster(String fio, double workExperience, double zp, LABU.lab3.lab3_1.birthDate birthDate, double termOfElection) {
        super(fio, workExperience, zp, birthDate);
        this.termOfElection = termOfElection;
    }

    public factoryMaster(String fio, double zp, LABU.lab3.lab3_1.birthDate birthDate, double termOfElection) {
        super(fio, zp, birthDate);
        this.termOfElection = termOfElection;
    }

    public factoryMaster() {
        termOfElection = 0;
    }

    @Override
    public double getNologi() {
        double tax;
        tax = nologi(zp, 0.3);
        return tax;
    }
    @Override
    public String toString() {
        return super.toString() + "Term of election" + termOfElection+"\n\n\n";
    }
}
