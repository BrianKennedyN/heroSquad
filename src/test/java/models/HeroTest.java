package models;

//import static org.junit.jupiter.api.Assertions.*;

import junit.framework.TestCase;
import org.junit.Test;

import java.lang.reflect.Member;

public class HeroTest extends TestCase {
    @Test
    public void testMembers_getCorrectName_String() {
        Hero hero = new Hero("Brian", 24, "Smart", "Sleeping", "Squad 1");
        assertEquals("Brian", hero.getName());
    }

    @Test
    public void testMembers_getCorrectAge_String() {
        Hero hero = new Hero("Brian", 24, "Smart", "Sleeping", "Squad 1");
        assertEquals(24, hero.getAge());
    }

    @Test
    public void testMembers_getCorrectStrength_String() {
        Hero hero = new Hero("Brian", 24, "Smart", "Sleeping", "Squad 1");
        assertEquals("Smart", hero.getSpecialPowers());
    }

    @Test
    public void testMembers_getCorrectWeakness_String() {
        Hero hero = new Hero("Brian", 24, "Smart", "Sleeping", "Squad 1");
        assertEquals("Sleeping", hero.getWeakness());
    }

    @Test
    public void testMembers_getCorrectSquad_String() {
        Hero hero = new Hero("Brian", 24, "Smart", "Sleeping", "Squad 1");
        assertEquals("Squad 1", hero.getSquad());
    }



}