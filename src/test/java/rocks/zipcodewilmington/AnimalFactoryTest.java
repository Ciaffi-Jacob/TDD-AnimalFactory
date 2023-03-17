package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateDog() {
        // Given
        Date today = new Date();
        Dog dog = AnimalFactory.createDog("Lugo", today);


        // When

        String actual = dog.getName();
        String expected = "Lugo";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testCreateCat(){
        Date today = new Date();
        Cat cat = AnimalFactory.createCat("Fatima", today);
        String actual = cat.getName();
        String expected = "Fatima";
        Assert.assertEquals(expected, actual);
    }
}


