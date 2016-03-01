public class Name {
    private String  firstName;
    private String sirName;

    public Name(String firstName, String sirName) {
        this.firstName = firstName;
        this.sirName = sirName;
    }
    public String firstAndSir(){
        return firstName+" "+sirName;
    }
    public String sirAndFirst(){
        return sirName+" "+firstName;
    }
}
