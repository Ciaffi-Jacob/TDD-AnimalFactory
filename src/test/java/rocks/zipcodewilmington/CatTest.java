package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void testCatName(){
        Cat cat = new Cat(null, null, null);
        String name = "Lugo";
        cat.setName(name);
        Assert.assertEquals(name, cat.getName());
}
    @Test
    public void testSpeak(){
        Cat cat = new Cat(null, null, null);
        String speakExpected = "meow!";
        String speakActual = cat.speak();
        Assert.assertEquals(speakExpected, speakActual);
    }
    @Test
    public void testBirthDate(){
        Cat cat = new Cat(null, null, null);
        Date date = new Date(2011, 4, 20);
        cat.setBirthDate(date);
        Assert.assertEquals(date, cat.getBirthDate());
    }
    @Test
    public void testEat(){
        Cat cat = AnimalFactory.createCat(null, null);
        Food food = new Food();
        cat.eat(food);
        Assert.assertEquals(1,(int)cat.getNumberOfMealsEaten());
    }
    @Test
    public void testgetID(){
        Cat cat = AnimalFactory.createCat(null,null);
        CatHouse.add(cat);
        Assert.assertEquals(0, (int)cat.getId());
    }
    @Test
    public void testAnimalInheritance(){
        Cat cat = AnimalFactory.createCat(null,null);

        Assert.assertTrue(cat instanceof Animal);
    }
    @Test
    public void testMammalInheritance(){
        Cat cat = AnimalFactory.createCat(null,null );

        Assert.assertTrue(cat instanceof Mammal);
    }


}
