import org.apache.commons.cli.*;

public class Cli {
    private String[] args = null;
    private Options options = new Options();

    public Cli(String[] args) {
        this.args = args;
        options.addOption("f", "firstLast", false, "Display Name as First Last");
        options.addOption("l", "lastFirst", false, "Display Name as First Last");
    }

    public CommandLine parse() throws ParseException {
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);
        return cmd;
    }
}
