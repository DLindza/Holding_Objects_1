package lindsay.devon.phonebook;

import java.util.*;
//import java.util.stream.Collectors;

/**
 * Created by devon on 9/28/16.
 */
public class PhoneBook {

    public static Map<String, String> phoneBook = new LinkedHashMap<>();

    public void addEntry(String name, List<String> phoneNumber) {
        System.out.println(name + " has been added to your phonebook.");
        for (String number : phoneNumber) {
            phoneBook.put(name, number);
        }
    }

    public void removeEntry(String name) {
        System.out.println(name + " has been removed from your phonebook.");
        phoneBook.remove(name);
    }

    public void removeIndividualPhoneNumber(String name, String phonenumber) {
        System.out.println(phonenumber + " has been removed from your phonebook");
         phoneBook.remove(name,phonenumber);
    }

    public String lookUp(String name) {
       return phoneBook.get(name);
    }

    public Set<String > listNames() {
        return phoneBook.keySet();
    }

    public Set<Map.Entry<String,String>> getPhoneBook() {
      return phoneBook.entrySet();

    }

    //Thank you - StackOverflow!
    public String reverseLookUp(String phoneNumber) {
        for ( String s : phoneBook.keySet()) {
            if (phoneBook.get(s).equals(phoneNumber)) {
                return s;
            }
        }  return "Sorry, I couldn't find that selection.";
    }


    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("Devon Lindsay", Arrays.asList("508-867-5309", "000-111-2222"));
        phoneBook.addEntry("Alex Lindsay", Arrays.asList("508-555-5555", "111-222-3333"));
        phoneBook.addEntry("Erin Lindsay", Arrays.asList("555-555-5555", "333-444-5555"));

        System.out.println(phoneBook.lookUp("Devon"));

        System.out.println(phoneBook.listNames());
        System.out.println(phoneBook.getPhoneBook());

       System.out.println(phoneBook.reverseLookUp("508-867-5309"));
    }


}




