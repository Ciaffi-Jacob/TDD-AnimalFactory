package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testGetCatByID(){
        CatHouse.clear();
        Cat cat = AnimalFactory.createCat(null, null);
        CatHouse.add(cat);
        Cat expected = cat;
        Cat actual = CatHouse.getCatById(0);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemoveCat(){
        CatHouse.clear();
        Cat cat = AnimalFactory.createCat("", new Date());
        CatHouse.add(cat);
        CatHouse.remove(0);
        Integer actual = CatHouse.getNumberOfCats();;
        Integer expected = 0;
        Assert.assertEquals(expected, actual);


    }
    @Test
    public void testAddCat(){
        CatHouse.clear();
        Cat cat = AnimalFactory.createCat(null, null);
        Integer actual = CatHouse.getNumberOfCats();
        Integer expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveIntegerID(){
        CatHouse.clear();
        Cat cat = AnimalFactory.createCat(null, null);
        CatHouse.add(cat);
        CatHouse.remove(0);
        Integer actual = 0;
        Integer expected = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetNumberOfCats() {
        // Given (some
        CatHouse.clear();
        Cat cat = new Cat("", new Date(), 0);
        Integer actual = null;
        Integer expected = null;

        // When
        CatHouse.add(cat);

        // Then
        expected = CatHouse.getNumberOfCats();
    }
}
