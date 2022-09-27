package phonebook;

public class Main {
    public static void main(String[] args) {

        PhoneBook x = new PhoneBook();

        x.add("Bobby", "610");
        x.addAll("Hannah", "874", "302");
        x.addAll("Reign", "567");
        x.remove("Hannah");
        System.out.println(x.hasEntry("op"));
        System.out.println(x.lookup("Reign"));
        System.out.println(x.reverseLookup("610"));
        System.out.println(x.getAllContactNames());
        System.out.println(x.getMap());

    }


}
