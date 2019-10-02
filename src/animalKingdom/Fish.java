package animalKingdom;

public class Fish extends AbstractAnimal
{
    // constructor. Passing in the name and year into the abstraction
    public Fish(String name, int year)
    {
        super(name, year);
    }

    // methods
    public String move()
    {
        return "Swim";
    }

    public String breath()
    {
        return "Gills";
    }

    public String reproduce()
    {
        return "eggs";
    }

    @Override
    public String toString()
    {
        return "Fish{" +
                "name='" + name + '\'' +
                ", year=" + year + 
                ", moves=" + move() + 
                ", breaths=" + breath()  + 
                ", reproduces=" + reproduce() +
                '}';
    }

}