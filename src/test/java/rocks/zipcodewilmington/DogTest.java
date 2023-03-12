package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Bubba";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void testSpeak(){
        Dog dog = new Dog(null, null, null);
        String speakExpected = "bark!";
        String speakActual = dog.speak();
        Assert.assertEquals(speakExpected, speakActual);
    }
    @Test
    public void testBirthDate(){
        Dog dog = new Dog(null, null, null);
        Date date = new Date(2011, 4, 20);
        dog.setBirthDate(date);
        Assert.assertEquals(date, dog.getBirthDate());
    }
    @Test
    public void testEat(){
        Dog dog = AnimalFactory.createDog(null, null);
        Food food = new Food();
        dog.eat(food);
        Assert.assertEquals(1,(int)dog.getNumberOfMealsEaten());
    }
    @Test
    public void testgetID(){
        Dog dog = AnimalFactory.createDog(null,null);
        DogHouse.add(dog);
        Assert.assertEquals(0, (int)dog.getId());
    }
    @Test
    public void testAnimalInheritance(){
        Dog dog = AnimalFactory.createDog(null,null);

        Assert.assertTrue(dog instanceof Animal);
    }
    @Test
    public void testMammalInheritance(){
        Dog dog = AnimalFactory.createDog(null,null );

        Assert.assertTrue(dog instanceof Mammal);
    }
}
