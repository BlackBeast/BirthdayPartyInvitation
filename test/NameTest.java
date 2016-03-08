import org.junit.Assert;
import org.junit.Test;

public class NameTest {

    @Test
    public void test_first_and_sir_name_in_sequence() throws Exception {
        Name alfi = new Name("Alfred", "Desousa");
        Assert.assertEquals("Alfred Desousa", alfi.firstAndSir( " "));
    }

    @Test
    public void test_sir_and_first_name_in_sequence() throws Exception {
        Name joy = new Name("Joy", "Aluka");
        Assert.assertEquals("Aluka,Joy", joy.sirAndFirst(","));
    }

    @Test
    public void test_to_check_if_it_adds_prefix_Mr() throws Exception {
        Name joy = new Name("Joy", "Aluka");
        joy.addPrefixMr();
        Assert.assertEquals("Mr Joy Aluka", joy.firstAndSir(" "));
    }

    @Test
    public void testAddPrefixMs() throws Exception {
        Name kala = new Name("Shashi", "Kala");
        kala.addPrefixMs();
        Assert.assertEquals("Ms Shashi Kala", kala.firstAndSir(" "));
    }
}