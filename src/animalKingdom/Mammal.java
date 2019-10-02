package animalKingdom;

public class Mammal extends AbstractAnimal
{
    // Fields
    // public String move;
    // public String breath;
    // public String reproduce;

    // Constructor
    public Mammal( String name, int year)
    {
        super(name, year);
    }

    public String move()
    {
        return "walk";
    }

    public String breath()
    {
        return "lungs";
    }
    public String reproduce()
    {
        return "live Birth";
    }

}