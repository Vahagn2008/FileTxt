package room;

import room.model.Name;
import room.service.NameService;
import room.service.NameService1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Test {

    public static final String URL = "Names.txt";
    

    public static void main(String[] args) throws Exception{

        String [] list = Files.readAllLines(Path.of(URL)).toArray(new String[0]);

        for (String element: list) {
            System.out.println(element);
        }

        String [] data = NameService.read(URL);
        Name[] names = NameService1.convert(data);
        Name name = NameService1.maxName(names);

        NameService.write(URL, "\nMax = " + name.toString());



        for (Name name1 : names) {
            NameService.create(name1);
            NameService.write(String.valueOf(name1), name1.print());
        }


    }
}
