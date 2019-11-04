package LABU.lab3.lab3_1;

public class Worker {

    public String fio;
    public double workExperience , zp ;
    Sex sex;
    birthDate birthDate;
    public double nolog;

    public Worker(String fio, double workExperience, double zp, Sex sex, LABU.lab3.lab3_1.birthDate birthDate) {
        this.fio = fio;
        this.workExperience = workExperience;
        this.zp = zp;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    public Worker(String fio, double workExperience, double zp, LABU.lab3.lab3_1.birthDate birthDate) {
        this.fio = fio;
        this.workExperience = workExperience;
        this.zp = zp;
        this.sex = Sex.NA;
        this.birthDate = birthDate;
    }

    public Worker(String fio, double zp, LABU.lab3.lab3_1.birthDate birthDate) {
        this.fio = fio;
        this.workExperience = 0;
        this.zp = zp;
        this.birthDate = birthDate;
        this.sex = Sex.NA;
    }

    public Worker() {
        this.fio = "somebody";
        this.workExperience = 0;
        this.sex = Sex.NA;
        this.zp = 0;
        this.birthDate = new birthDate();
    }

    public String getFio() {
        return fio;
    }

    public double getWorkExperience() {
        return workExperience;
    }

    public double getZp() {
        return zp;
    }

    public Sex getSex() {
        return sex;
    }

    public LABU.lab3.lab3_1.birthDate getBirthDate() {
        return birthDate;
    }

    public double nologi (double zp , double taxKoef){
        nolog = zp * taxKoef;
        return nolog;
    }

    public double getNologi (){
        double tax ;
        tax = nologi (zp, 0.2 );
        return tax;

    }
}
