public class Male extends Person {
    public Male(Name name, Address address, int age) {
        super(name, address, age);
        name.addPrefixMr();
    }
}
