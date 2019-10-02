package animalKingdom;

public class Birds extends AbstractAnimal
{
    public Birds(String name, int year)
    {
        super(name, year);
    }

    public String move()
    {
        return "fly";
    }


    public String breath()
    {
        return "lungs";
    }


    public String reproduce()
    {
        return "eggs";
    }

    @Override
    public String toString()
    {
        return "Bird{" +
                "name='" + name + '\'' +
                ", year=" + year + 
                ", moves=" + move() + 
                ", breaths=" + breath()  + 
                ", reproduces=" + reproduce() +
                '}';
    }

}