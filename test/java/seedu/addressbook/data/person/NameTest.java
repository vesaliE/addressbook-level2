package seedu.addressbook.data.person;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {

    @Test
    public void isSimilar_null_returnFalse() {
        Name testName = null;
        try {
            testName = new Name("Ellango Vesali");
        } catch (IllegalValueException e) {
            e.printStackTrace();
        } 
        Name other = null;
        assertFalse(testName.isSimilar(other));
    }
    
    @Test
    public void isSimilar_sameName_returnTrue() {
        Name testName = null;
        Name other = null;
        try {
            testName = new Name("Ellango Vesali");
            other = new Name ("Ellango Vesali");
        } catch (IllegalValueException e) {
            e.printStackTrace();
        } 
        assertTrue(testName.isSimilar(other));
    }
    
    @Test
    public void isSimilar_differentCase_returnTrue() {
        Name testName = null;
        Name other = null;
        try {
            testName = new Name("Ellango Vesali");
            other = new Name ("ellAngo VeSali");
        } catch (IllegalValueException e) {
            e.printStackTrace();
        } 
        assertTrue(testName.isSimilar(other));
    }
    
    @Test
    public void isSimilar_differentName_returnFalse() {
        Name testName = null;
        Name other = null;
        try {
            testName = new Name("Ellango Vesali");
            other = new Name ("Emily");
        } catch (IllegalValueException e) {
            e.printStackTrace();
        } 
        assertFalse(testName.isSimilar(other));
    }
    
    @Test
    public void isSimilar_sameFirstName_returnFalse() {
        Name testName = null;
        Name other = null;
        try {
            testName = new Name("Emily Koh");
            other = new Name ("Emily Goh");
        } catch (IllegalValueException e) {
            e.printStackTrace();
        } 
        assertTrue(testName.isSimilar(other));
    }
    
    @Test
    public void isSimilar_sameLastName_returnFalse() {
        Name testName = null;
        Name other = null;
        try {
            testName = new Name("Emily Koh");
            other = new Name ("Gerald Koh");
        } catch (IllegalValueException e) {
            e.printStackTrace();
        } 
        assertTrue(testName.isSimilar(other));
    }
    
    

}
