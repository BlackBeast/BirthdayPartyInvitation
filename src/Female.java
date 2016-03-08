public class Female extends Person{
    public Female(Name name, Address address, int age) {
        super(name, address, age);
        name.addPrefixMs();
    }
}
