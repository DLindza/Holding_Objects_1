package lindsay.devon.phonebook;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by devon on 9/28/16.
 */
public class PhoneBook {

    public static Map<String, String> phoneBook = new LinkedHashMap<String,String>();

    static boolean addEntry(String name, String phoneNumber) {
        System.out.println(name + " has been added to your phonebook.");
          phoneBook.put(name,phoneNumber);
            return true;
    }

    static boolean removeEntry(String name) {
        System.out.println(name + " has been removed from your phonebook.");
        phoneBook.remove(name);
        return true;
    }

    static Set<String > listNames() {
        return phoneBook.keySet();
    }

    static void printPhoneBook() {
        for ( String s : phoneBook.keySet()) {
            System.out.println(s + phoneBook.get(s));

            }
        }
    }


}

