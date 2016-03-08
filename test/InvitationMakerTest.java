import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InvitationMakerTest {
    PersonAttr[] keys = {
            PersonAttr.FIRSTNAME,
            PersonAttr.LASTNAME,
            PersonAttr.GENDER,
            PersonAttr.AGE,
            PersonAttr.CITY,
            PersonAttr.STATE,
            PersonAttr.COUNTRY
    };

    @Test
    public void testmakeCreatesANewPersonForMale() throws Exception {
        String[] values = {"Chiyaan", "Vikram", Gender.MALE.toString(), "45", "Chennai", "TN", "IN"};
        Person vikram = InvitationMaker.make(keys, values);
        String expected = "Mr Chiyaan Vikram, IN";
        assertEquals(expected, vikram.getAddressWithCountry());

    }

    @Test
    public void testMakeCreatesANewPersonForFemale() throws Exception {
        String[] values = {"Shailaja", "Balakrishnan", Gender.FEMALE.toString(), "40", "Chennai", "TN", "IN"};
        Person spouse = InvitationMaker.make(keys, values);
        String expected = "Ms Shailaja Balakrishnan, IN";
        assertEquals(expected, spouse.getAddressWithCountry());
    }
}