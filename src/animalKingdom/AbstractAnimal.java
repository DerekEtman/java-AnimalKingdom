package animalKingdom;

public abstract class AbstractAnimal
{
    // fields
    static int maxId = 0;
    int id;
    String name;
    int year;
    String eats;


    // Constructors
    public AbstractAnimal(String name, int year)
    {   
        maxId++;
        id = maxId;
        this.name = name;
        this.year = year;
    }

    // Getters and Setters
    public abstract int getId();
    public abstract String getName();
    public abstract int getYear();

    public void getFood()
    {
        eats = "By mouth";
    }


}