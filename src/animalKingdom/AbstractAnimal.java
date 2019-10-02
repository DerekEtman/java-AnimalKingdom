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

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();


    // Getters and Setters
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getYear()
    {
        return year;
    }

    public void getFood()
    {
        eats = "By mouth";
    }


}