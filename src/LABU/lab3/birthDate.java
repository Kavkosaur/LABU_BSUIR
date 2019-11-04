package LABU.lab3;

public class birthDate {
    public int day , month , year;

    public birthDate(int day, int month, int year) {
        if ((day < 31) && (month <= 12) && (day > 0) && (month > 0) )  {
            this.day = day;
            this.month = month;
            this.year = year;
        } else System.out.println("This person wasn't born ");
    }

    public birthDate(int month, int year) {
        if ((day < 31) && (month < 12) && (day > 0) && (month > 0) )  {
            this.day = 1;
            this.month = month;
            this.year = year;
        } else System.out.println("This person wasn't born ");
    }

    public birthDate() {

        this.day = 1;
        this.month = 1;
        this.year = 1990;

    }

    @Override
    public String toString() {
        return day + "." + month + "." + year;
    }
}
