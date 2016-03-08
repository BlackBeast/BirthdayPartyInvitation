public class Name {
    private String firstName;
    private String sirName;
    private String prefix;

    public Name(String firstName, String sirName) {
        this.firstName = firstName;
        this.sirName = sirName;
        this.prefix = "";
    }

    public String firstAndSir(String separator) {
        return prefix + firstName + separator + sirName;
    }

    public String sirAndFirst(String separator) {
        return prefix + sirName + separator + firstName;
    }

    public void addPrefixMr(){
        this.prefix = "Mr ";
    }
    public void addPrefixMs(){
        this.prefix = "Ms ";
    }
}
