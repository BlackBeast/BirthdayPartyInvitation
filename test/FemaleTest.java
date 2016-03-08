import org.junit.Assert;
import org.junit.Test;

public class FemaleTest {
    @Test
    public void testGetAddressGivesRepresentationOfAddressWithPrefixMs() throws Exception {
        Name name = new Name("Amal", "Sufiya");
        Address addr = new Address("EKM", "KL", "IN");
        Person amal = new Female(name, addr, 28);
        String expected = "Ms Amal Sufiya\nEKM, KL, IN";
        Assert.assertEquals(expected,amal.getAddress());
    }

    @Test
    public void testGetAddressWithOptionsGivenGivesAddressWithPrefixMr() throws Exception {
        Name name = new Name("Amal", "Sufiya");
        Address addr = new Address("EKM", "KL", "IN");
        Person amal = new Female(name, addr, 28);
        String expected = "Ms Amal, Sufiya\nEKM, KL, IN";
        Assert.assertEquals(expected, amal.getAddress(true, ", "));

        expected = "Ms Sufiya, Amal\nEKM, KL, IN";
        Assert.assertEquals(expected, amal.getAddress(false, ", "));
    }

    @Test
    public void testGetAddressWithCountryGivesAddressWithPrefixMr() throws Exception {
        Name name = new Name("Amal", "Sufiya");
        Address addr = new Address("EKM", "KL", "IN");
        Person amal = new Female(name, addr, 28);
        String expected = "Ms Amal Sufiya, IN";
        Assert.assertEquals(expected, amal.getAddressWithCountry());
    }

    @Test
    public void testGetAddressWithCountryWithGivenOptionsGivesAddressWithPrefixMr() throws Exception {
        Name name = new Name("Amal", "Sufiya");
        Address addr = new Address("EKM", "KL", "IN");
        Person amal = new Female(name, addr, 28);
        String expected = "Ms Amal, Sufiya, IN";
        Assert.assertEquals(expected, amal.getAddressWithCountry(true, ", "));

        expected = "Ms Sufiya, Amal, IN";
        Assert.assertEquals(expected, amal.getAddressWithCountry(false, ", "));
    }
}