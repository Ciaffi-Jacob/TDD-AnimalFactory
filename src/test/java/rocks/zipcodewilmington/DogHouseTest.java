package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`


    @Test
    public void testGetDogByID(){
        DogHouse.clear();
        Dog dog = AnimalFactory.createDog(null, null);
        DogHouse.add(dog);
        Dog actual = DogHouse.getDogById(0);
        Dog expected = dog;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemoveDog(){
        DogHouse.clear();
        Dog dog = AnimalFactory.createDog(null, null);
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 0;
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testAddDog(){
        DogHouse.clear();
        Dog dog = AnimalFactory.createDog(null, null);
        DogHouse.add(dog);
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveIntegerID(){
        DogHouse.clear();
        Dog dog = AnimalFactory.createDog(null, null);
        DogHouse.add(dog);
        DogHouse.remove(0);
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 0;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetNumberOfDogs() {
        DogHouse.clear();
        Dog dog = AnimalFactory.createDog("", new Date());
        DogHouse.add(dog);
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }
}
