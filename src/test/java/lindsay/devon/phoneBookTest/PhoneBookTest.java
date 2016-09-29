package lindsay.devon.phoneBookTest;

import lindsay.devon.phonebook.PhoneBook;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by devon on 9/28/16.
 */
public class PhoneBookTest {


   @Test
   public void addEntryTest() {
       PhoneBook phoneBook = new PhoneBook();
       phoneBook.addEntry("Devon Lindsay", Arrays.asList("555-867-5309", "111-222-3333"));
       int expected = 1;
       int actual = PhoneBook.phoneBook.size();
       Assert.assertEquals("Phonebook size should be 1", expected, actual);


    }

    @Test
    public void removeIndividualPhoneNumberTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("Devon Lindsay", Arrays.asList( "555-867-5309", "111-222-3333"));
        phoneBook.addEntry("Alex Lindsay", Arrays.asList("555-555-5555", "222-333-4444"));
        phoneBook.removeIndividualPhoneNumber("Alex Lindsay", "555-555-5555");
        int expected = 2;
        int actual = PhoneBook.phoneBook.size();
        Assert.assertEquals("Phonebook size should be 1", expected,actual);
    }

    @Test
    public void lookUpTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("Devon Lindsay", Arrays.asList("508-867-5309", "111-222-3333"));
        phoneBook.addEntry("Alex Lindsay", Arrays.asList("555-555-5555", "222-333-4444"));
        String expected = "508-867-5309";
        String actual = phoneBook.lookUp("Devon Lindsay");
        Assert.assertEquals("This should be 508-867-5309", expected, actual);
    }

    @Test
    public void listNamesTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("Devon Lindsay", Arrays.asList("508-867-5309", "111-222-3333"));
        phoneBook.addEntry("Alex Lindsay", Arrays.asList("555-555-5555", "222-333-4444"));
        Assert.assertTrue(phoneBook.listNames().contains("Devon Lindsay"));
    }

    @Test
    public void getPhoneBookTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("Devon Lindsay", Arrays.asList( "508-867-5309", "111-222-3333"));
        phoneBook.addEntry("Alex Lindsay", Arrays.asList("555-555-5555", "222-333-4444"));
        Assert.assertNotNull(phoneBook.getPhoneBook());
    }

    @Test
    public void reverseLookUpTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("Devon Lindsay", Arrays.asList( "508-867-5309", "111-222-3333"));
        phoneBook.addEntry("Alex Lindsay", Arrays.asList( "555-555-5555", "222-333-4444"));
        String expected = "Devon Lindsay";
        String actual = phoneBook.reverseLookUp("508-867-5309");
        Assert.assertEquals("This should be Devon Lindsay", expected,actual);
    }


}
