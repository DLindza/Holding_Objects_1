package lindsay.devon.phonebook;

import java.util.*;

/**
 * Created by devon on 9/28/16.
 */
public class PhoneBook {

    public static Map<String, ArrayList<String>> phoneBook = new LinkedHashMap<>();

    public void addEntry(String name, ArrayList<String> phoneNumber) {
        System.out.println(name + " has been added to your phonebook.");
        phoneBook.put(name, phoneNumber);

    }

    public void removeEntry(String name) {
        System.out.println(name + " has been removed from your phonebook.");
        phoneBook.remove(name);
    }

    public void addIndividualPhoneNumber(String name, String phonenumber) {
        System.out.println(phonenumber + " has been added to " + name + "'s record.");
        List<String> newNumber = phoneBook.get(name);
        newNumber.add(phonenumber);

    }

    public void removeIndividualPhoneNumber(String name, String phonenumber) {
        System.out.println(phonenumber + " has been removed from your phonebook");
         phoneBook.remove(name,phonenumber);
    }

    public List<String> lookUp(String name) {
        return phoneBook.get(name);
    }

    public Set<String > listNames() {
        return phoneBook.keySet();
    }

    public Set<Map.Entry<String,ArrayList<String>>> getPhoneBook() {
      return phoneBook.entrySet();

    }

    //Thank you - StackOverflow!
    public String reverseLookUp(String phoneNumber) {
        for ( String s : phoneBook.keySet()) {
            for (String number : phoneBook.get(s)) {
                if (number.equals(phoneNumber)) {
                    return s;
                }
            }
        }  return "Sorry, I couldn't find that selection.";
    }


    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("Devon Lindsay", new ArrayList<>(Arrays.asList("508-867-5309", "000-111-2222")));
        phoneBook.addEntry("Alex Lindsay", new ArrayList<>(Arrays.asList("508-555-5555", "111-222-3333")));
        phoneBook.addEntry("Erin Lindsay", new ArrayList<>(Arrays.asList("555-555-5555", "333-444-5555")));

        System.out.println("Look up return: " + phoneBook.lookUp("Devon Lindsay"));
        System.out.println(phoneBook.listNames());
        System.out.println(phoneBook.getPhoneBook());

       System.out.println(phoneBook.reverseLookUp("508-867-5309"));


    }


}




