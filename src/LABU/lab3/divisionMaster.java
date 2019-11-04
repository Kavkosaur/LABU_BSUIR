package LABU.lab3;

public class divisionMaster extends Worker{

    public String divisionName ;
    public int divisionPersonal;

    public divisionMaster(String fio, double workExperience, double zp, Sex sex, LABU.lab3.birthDate birthDate, String divisionName, int divisionPersonal) {
        super(fio, workExperience, zp, sex, birthDate);
        this.divisionName = divisionName;
        this.divisionPersonal = divisionPersonal;
    }

    public divisionMaster(String fio, double workExperience, double zp,birthDate birthDate, String divisionName, int divisionPersonal) {
        super(fio, workExperience, zp, birthDate);
        this.divisionName = divisionName;
        this.divisionPersonal = divisionPersonal;
    }

    public divisionMaster(String fio, double zp,birthDate birthDate, String divisionName, int divisionPersonal) {
        super(fio, zp, birthDate);
        this.divisionName = divisionName;
        this.divisionPersonal = divisionPersonal;
    }

    public divisionMaster() {
        this.divisionName = "NONE";
        this.divisionPersonal = 1;
    }

    @Override
    public double getNologi() {
        double tax ;
        tax = nologi (zp, 0.25 );
        return tax;
    }
    @Override
    public String toString() {
        return "Division Master : " + fio + "\n BD:" + birthDate + "\n Sex:" + sex
                + "\n Work Exp. : " + workExperience + " h. \n Division Name : "
                + divisionName +"\n Division Personal : "+ divisionPersonal + " people" + "\n Wage: " + zp + "\n "
                + "Tax : " + getNologi() + "\n\n\n";
    }
}
