package personobject;

public class PersonHandler {

    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;

    }
    public String whileLoop(){
        int x =0;
        String result = "";

        while(x<personArray.length){
            Person allPersons = personArray[x];
            result += allPersons.toString();
            x++;
          

        }


        return result;
    }

    public String forLoop() {
        String result = "";
        for(int x=0; x< personArray.length;x++){
            result += personArray[x].toString();

        }
        return result;


    }

    public String forEachLoop(){
        String result = "";
        for (Person allPersons : personArray) {
            result += allPersons.toString();
            
        }




        return result;
    }

    public Person[] getPersonArray(){
        return personArray;
    }
}
