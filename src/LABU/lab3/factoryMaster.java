package LABU.lab3;

public class factoryMaster extends Worker {
    double termOfElection;

    public factoryMaster(String fio, double workExperience, double zp, Sex sex, LABU.lab3.birthDate birthDate, double termOfElection) {
        super(fio, workExperience, zp, sex, birthDate);
        this.termOfElection = termOfElection;
    }

    public factoryMaster(String fio, double workExperience, double zp, LABU.lab3.birthDate birthDate, double termOfElection) {
        super(fio, workExperience, zp, birthDate);
        this.termOfElection = termOfElection;
    }

    public factoryMaster(String fio, double zp, LABU.lab3.birthDate birthDate, double termOfElection) {
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
        return "Factory Master : " + fio + "\n BD:" + birthDate + "\n Sex:" + sex
                + "\n Work Exp. : " + workExperience + " h. \n term of election : "
                + termOfElection + " years" + "\n Wage: " + zp + "\n " + "Tax : " + getNologi() + "\n\n\n";
    }
}
