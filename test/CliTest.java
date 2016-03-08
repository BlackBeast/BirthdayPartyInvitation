import org.apache.commons.cli.CommandLine;
import org.junit.Test;

import static org.junit.Assert.*;
public class CliTest {
    @Test
    public void testParseRetursACommandLineWithOptions() throws Exception {
        String[] args = {"-f","records"};
        Cli cli = new Cli(args);
        CommandLine cmd = cli.parse();
        assertTrue(cmd.hasOption('f'));

        String[] nonOptions = cmd.getArgs();
        assertEquals(1,nonOptions.length);
        assertEquals("records",nonOptions[0]);
    }

}