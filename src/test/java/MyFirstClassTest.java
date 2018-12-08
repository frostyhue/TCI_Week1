import junit.extensions.TestSetup;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyFirstClassTest {
    MyFirstClass gameTest;

    @Before
    public void setUp() {
        gameTest = new MyFirstClass("Smash", "Switch", 59);
    }

    @Test
    public void getTitle() {
        assertEquals("Smash",  gameTest.getTitle());
    }

    @Test
    public void getPlatform() {
        assertEquals("Switch",  gameTest.getPlatform());
    }

    @Test
    public void getPrice() {
        assertEquals(59,  gameTest.getPrice());
    }
    @Test
    public void constructorShouldSetTitlePlatformAndPrice() {
        MyFirstClass gameTest = new MyFirstClass("Pokken", "Switch", 54);

        assertEquals("Pokken",  gameTest.getTitle());
        assertEquals("Switch",  gameTest.getPlatform());
        assertEquals(54,     gameTest.getPrice());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIfThrowExceptionWhenValuesAreNotRight(){
        String Invalid_Title = "";
        String Invalid_Platform = "";
        int Invalid_price = -50;

        String Valid_Title = "Mario";
        String Valid_Platform = "Nintendo";
        int Valid_price = 50;

        //Expected to raise exception!
        MyFirstClass Invalid_Game_Test = new MyFirstClass(Invalid_Title, Invalid_Platform, Invalid_price);
        //Expected to not raise exception.
        MyFirstClass Valid_Game_Test = new MyFirstClass(Valid_Title, Valid_Platform, Valid_price);
        //Expected to raise exception!
        MyFirstClass Invalid_Game_Test2 = new MyFirstClass(Invalid_Title, Valid_Platform, Invalid_price);
    }
}