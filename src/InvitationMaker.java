import java.util.HashMap;

public class InvitationMaker {
    private static HashMap<PersonAttr, String> generateMap(PersonAttr[] keys, String[] values) {
        HashMap<PersonAttr, String> map = new HashMap<>();

        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }

        return map;
    }

    public static Person make(PersonAttr[] keys, String[] values) {
        HashMap<PersonAttr, String> personMap = generateMap(keys, values);

        Name name = new Name(personMap.get(PersonAttr.FIRSTNAME), personMap.get(PersonAttr.LASTNAME));
        Address address = new Address(personMap.get(PersonAttr.CITY), personMap.get(PersonAttr.STATE), personMap.get(PersonAttr.COUNTRY));
        int age = Integer.parseInt(personMap.get(PersonAttr.AGE));
        String gender = personMap.get(PersonAttr.GENDER);

        Person person;
        if (personMap.containsKey(PersonAttr.GENDER))
            person = (gender.equals(Gender.MALE.toString())) ? new Male(name, address, age) : new Female(name, address, age);
        else person = new Person(name, address, age);

        return person;
    }
}
