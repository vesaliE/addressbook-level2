package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

import java.util.Arrays;
import java.util.List;

/**
 * Represents a Person's name in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidName(String)}
 */
public class Name {

    public static final String EXAMPLE = "John Doe";
    public static final String MESSAGE_NAME_CONSTRAINTS = "Person names should be spaces or alphabetic characters";
    public static final String NAME_VALIDATION_REGEX = "[\\p{Alpha} ]+";
    public final String fullName;

    /**
     * Validates given name.
     *
     * @throws IllegalValueException if given name string is invalid.
     */
    public Name(String name) throws IllegalValueException {
        String trimmedName = name.trim();
        if (!isValidName(trimmedName)) {
            throw new IllegalValueException(MESSAGE_NAME_CONSTRAINTS);
        }
        this.fullName = trimmedName;
    }

    /**
     * Returns true if a given string is a valid person name.
     */
    public static boolean isValidName(String test) {
        return test.matches(NAME_VALIDATION_REGEX);
    }

    /**
     * Retrieves a listing of every word in the name, in order.
     */
    public List<String> getWordsInName() {
        return Arrays.asList(fullName.split("\\s+"));
    }

    @Override
    public String toString() {
        return fullName;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Name // instanceof handles nulls
                        && this.fullName.equals(((Name) other).fullName)); // state check
    }

    @Override
    public int hashCode() {
        return fullName.hashCode();
    }

    /**
     * Returns true of the other name is very similar to this name.
     * Two names are considered similar if they are the same, have the same 
     * first or last names and have different casing.
     * 
     * @param other name that is to be compared with current user's name
     * 
     */
    public boolean isSimilar(Name other) {
        if(other == null){
            return false; 
        }
        if(this.equals(other)){
            return true;
        }

        String otherName = other.toString().toLowerCase();
        String thisName = this.toString().toLowerCase(); 

        if(thisName.equals(otherName)){
            return true;
        }
       
        isSameFirstOrLastName(other);

        return false;

    }

    /**
     * @param other
     */
    private boolean isSameFirstOrLastName(Name other) {
        String[] splitCurrentName = this.toString().toLowerCase().split(" ");
        String[] splitOtherName = other.toString().toLowerCase().split(" ");

        for(String otherNameTest : splitOtherName){
            for(String nameTest: splitCurrentName){
                if(otherNameTest.equals(nameTest)){
                    return true; 
                }
            }
        }
        return false; 
    }

}
