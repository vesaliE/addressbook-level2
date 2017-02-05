package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
    
    String isAdd;
    Person person;
    Tag tag; 
    
    public Tagging(boolean isAdd, Tag tag, Person person){
        this.tag = tag;
        this.person = person; 
        if(isAdd){
            this.isAdd = "+"; 
        }else{
            this.isAdd = "-";
        }
    }
    
    @Override
    public String toString() {
        return this.isAdd + " " + person.getName() + " " + tag.toString();
    }

}
