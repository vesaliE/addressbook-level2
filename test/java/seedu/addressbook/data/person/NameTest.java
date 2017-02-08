package seedu.addressbook.data.person;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {

    @Test
    public void isSimilar_null_returnFalse() {
        try{
            Name other = new Name (null);
            assertFalse(Name.isSimilar(other));
        }
        catch(IllegalValueException e ){
            System.out.println("Illegal value");
        }
    }

}
