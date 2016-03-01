import org.junit.Assert;
import org.junit.Test;

public class NameTest{

    @Test
    public void test_first_and_sir_name_in_sequence() throws Exception {
        Name alfi = new Name("Alfred","Desousa");
        Assert.assertEquals("Alfred Desousa",alfi.firstAndSir());
    }

    @Test
    public void test_sir_and_first_name_in_sequence() throws Exception {
        Name joy = new Name("Joy","Aluka");
        Assert.assertEquals("Aluka Joy",joy.sirAndFirst());
    }
}