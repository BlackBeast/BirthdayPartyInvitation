import org.apache.commons.cli.CommandLine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class LabelPrinter {
    private static List<String[]> parseCSV(String filePath) throws IOException {
        List<String[]> res = new LinkedList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = br.readLine()) != null) {
            res.add(line.split(","));
        }
        return res;
    }

    private static List<Person> personfy(List<String[]> records) {
        List<Person> people = new LinkedList<>();
        PersonAttr[] keys = {
                PersonAttr.FIRSTNAME,
                PersonAttr.LASTNAME,
                PersonAttr.GENDER,
                PersonAttr.AGE,
                PersonAttr.CITY,
                PersonAttr.STATE,
                PersonAttr.COUNTRY
        };

        for (String[] record : records) {
            String gender = (record[2].equals("Male")) ? Gender.MALE.toString() : Gender.FEMALE.toString();
            String[] values = {record[0], record[1], gender, record[3], record[4], record[5], record[6]};
            people.add(InvitationMaker.make(keys, values));
        }

        return people;
    }

    private static void present(String item) {
        System.out.println(item + "\n");
    }

    public static void main(String[] args) throws Exception {
        Cli cli = new Cli(args);
        CommandLine commands = cli.parse();
        String[] files = commands.getArgs();

        List<String[]> records = new LinkedList<>();
        for (String file : files) {
            records.addAll(parseCSV(file));
        }

        List<Person> people = personfy(records);
        if (commands.hasOption('f')) {
            for (Person person : people) {
                present(person.getAddressWithCountry());
            }
        } else {
            for (Person person : people) {
                present(person.getAddressWithCountry(false, ", "));
            }
        }
    }
}
