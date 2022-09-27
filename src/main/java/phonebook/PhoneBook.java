package phonebook;

import java.util.*;


public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {
        this.phonebook = new HashMap<String, List<String>>();
    }

    public void add(String name, String phoneNumber) {
        phonebook.put(name, Collections.singletonList(phoneNumber));
    }

    public void addAll(String name, String... phoneNumbers) {
        phonebook.put(name, new ArrayList<>(Arrays.asList(phoneNumbers)));
    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return phonebook.containsKey(name);

    }

    public List<String> lookup(String name) {
        for (Map.Entry<String, List<String>> entry : phonebook.entrySet()) ;
        if (phonebook.containsKey(name)) {

        }
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber) {
        for (Map.Entry<String, List<String>> entry : phonebook.entrySet()) {
            if (entry.getValue().contains(phonebook)) {


            }
            return entry.getKey();
        } return null;
    }



        public List<String> getAllContactNames () {
            return new ArrayList<>(phonebook.keySet());

        }


        public Map<String, List<String>> getMap () {
            return phonebook;

        }
    }

