package LABU.lab7.myTable;

public class BotanicalGarden implements Comparable<BotanicalGarden>
{

    private String name;
    private String family;
    private String genus;
    private String species;
    private String age;

    public BotanicalGarden(String name, String family, String species, String genus, String age) throws MyException
    {
        if(name.isEmpty()) throw new MyException("Ошибка ввода!");
        this.name = name;

        if(family.isEmpty()) throw new MyException ("Ошибка ввода!");
        this.family = family;

        if(species.isEmpty()) throw new MyException("Ошибка ввода!");
        this.species = species;

        if(genus.isEmpty()) throw new MyException ("Ошибка ввода!");
        this.genus = genus;

        if(age.isEmpty()) throw new MyException ("Ошибка ввода!");
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public String getFamily()
    {
        return family;
    }

    public String getGenus()
    {
        return genus;
    }

    public String getSpecies()
    {
        return species;
    }


    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public void setRSpecies(String species) {
        this.species = species;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public int compareTo(BotanicalGarden o) {
        return this.name.compareTo(o.name);
    }
}

