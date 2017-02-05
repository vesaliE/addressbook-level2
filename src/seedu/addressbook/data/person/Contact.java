package seedu.addressbook.data.person;

public abstract class Contact {
    
    public final String value;
    private boolean isPrivate;
    
    public Contact(String contact, boolean isPrivate){
        String trimmedContact = contact.trim();
        this.value = trimmedContact;
        this.isPrivate = isPrivate; 
    }
    
    @Override 
    public String toString() {
        return value;
    }
    
    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (this.getClass().isInstance(other) 
                && this.value.equals(getClass().cast(other).value)); // state check
    }
    
    @Override
    public int hashCode() {
        return value.hashCode();
    }

    
    public boolean isPrivate() {
        return isPrivate;
    }
}
