import org.junit.Assert;
import org.junit.Test;

public class MaleTest {
    @Test
    public void testGetAddressGivesRepresentationOfAddressWithPrefixMr() throws Exception {
        Name name = new Name("Dulquar", "Salman");
        Address addr = new Address("EKM", "KL", "IN");
        Person dulqur = new Male(name, addr, 28);
        String expected = "Mr Dulquar Salman\nEKM, KL, IN";
        Assert.assertEquals(expected,dulqur.getAddress());

    }

    @Test
    public void testGetAddressWithOptionsGivenGivesAddressWithPrefixMr() throws Exception {
        Name name = new Name("Dulquar", "Salman");
        Address addr = new Address("EKM", "KL", "IN");
        Person dulqur = new Male(name, addr, 28);
        String expected = "Mr Dulquar, Salman\nEKM, KL, IN";
        Assert.assertEquals(expected, dulqur.getAddress(true, ", "));

        expected = "Mr Salman, Dulquar\nEKM, KL, IN";
        Assert.assertEquals(expected, dulqur.getAddress(false, ", "));
    }

    @Test
    public void testGetAddressWithCountryGivesAddressWithPrefixMr() throws Exception {
        Name name = new Name("Dulquar", "Salman");
        Address addr = new Address("EKM", "KL", "IN");
        Person dulqur = new Male(name, addr, 28);
        String expected = "Mr Dulquar Salman, IN";
        Assert.assertEquals(expected, dulqur.getAddressWithCountry());
    }

    @Test
    public void testGetAddressWithCountryWithGivenOptionsGivesAddressWithPrefixMr() throws Exception {
        Name name = new Name("Dulquar", "Salman");
        Address addr = new Address("EKM", "KL", "IN");
        Person dulqur = new Male(name, addr, 28);
        String expected = "Mr Dulquar, Salman, IN";
        Assert.assertEquals(expected, dulqur.getAddressWithCountry(true, ", "));

        expected = "Mr Salman, Dulquar, IN";
        Assert.assertEquals(expected, dulqur.getAddressWithCountry(false, ", "));
    }
}