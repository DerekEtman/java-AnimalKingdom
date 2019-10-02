package animalKingdom;

import java.util.ArrayList;

public class Main
{
    public static ArrayList<AbstractAnimal> filteredList = new ArrayList<AbstractAnimal>();

    public static void printAnimals(ArrayList<AbstractAnimal> animals, CheckAnimal tester)
    {
        for (AbstractAnimal a : animals)
        {
            if(tester.test(a))
            {
                System.out.println(a.getName() + " " + a.getYear());
            }
        }
    }




    public static void main(String[] args)
    {
        // Mammals
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("BigFoot", 2021);

        // Birds
        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        // Fish
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("CatFish", 1817);
        Fish perch = new Fish("Perch", 1758);

        // New ArrayList with all of the animals
        ArrayList<AbstractAnimal> allList = new ArrayList<AbstractAnimal>();
        allList.add(panda);
        allList.add(zebra);
        allList.add(koala);
        allList.add(sloth);
        allList.add(armadillo);
        allList.add(raccoon);
        allList.add(bigfoot);
        allList.add(pigeon);
        allList.add(peacock);
        allList.add(toucan);
        allList.add(parrot);
        allList.add(swan);
        allList.add(salmon);
        allList.add(catfish);
        allList.add(perch);

        System.out.println("*** All List***");
        System.out.println(allList.toString());


        // Lambda Expressions
        printAnimals(allList, l -> l.getYear() < 0 );

        // List all the animals in descending order by year named
        System.out.println("\n*** Descending year ***");
        allList.sort((a1, a2) -> a1.getYear() -  a2.getYear());
        allList.forEach((a) -> System.out.println(a.getName() + " " + a.getYear()));
        System.out.println();

        // List alphabetically
        System.out.println("\n*** Alphabetically ***");
        allList.sort((a1,a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        allList.forEach((a) -> System.out.println(a.getName()));

        // Order by how they move.
        System.out.println("\n*** Movement Type ***");
        allList.sort((a1,a2) -> a1.move().compareTo(a2.move()));
        allList.forEach((a) -> System.out.println(a.getName() + " " + a.move()));

        // Animals with lungs
        System.out.println("\n*** Lungs Only ***");
        printAnimals(allList, a -> (a.breath() == "lungs"));

        // Animals with lungs
        System.out.println("\n*** Lungs && 1758 Only ***");
        printAnimals(allList, a -> (a.breath() == "lungs") && (a.getYear() == 1758));
        
        // Animals that lay eggs and have lungs
        System.out.println("\n*** Lungs && Eggs ***");
        printAnimals(allList, a -> (a.breath() == "lungs") && (a.reproduce() == "eggs"));

        // Alphabetically and named in 1758
        System.out.println("\n*** Alphabetically and 1758 ***");
        allList.sort((a1,a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(allList, a -> (a.getYear() == 1758));


        // Stretch 
        System.out.println("\n*** Alphabetically Animals that are mammals ***");
        allList.sort((a1,a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(allList, a -> (a instanceof Mammal));
    }
}