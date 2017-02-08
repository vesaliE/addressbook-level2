package seedu.addressbook.data.person;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {

    @Test
    public void isSimilar_null_returnFalse() {
        Name testName = null; 
        Name other = null;
        assertFalse(testName.isSimilar(other));
    }

}
