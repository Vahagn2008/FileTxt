package room.service;

import room.model.Name;

import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NameService {

    public static String[] read(String url) throws Exception{
        return Files.readAllLines(Path.of(url)).toArray(new String[0]);
    }

    public static void write(String url, String text) throws Exception{
        Files.write(Path.of(url), text.getBytes(), StandardOpenOption.APPEND);

    }

    public static void create(Name name) throws Exception {
        Files.createFile(Path.of(name.toString()));
    }

    public static void write1(String url, String text) throws Exception{
        Files.write(Path.of(url), text.getBytes(), StandardOpenOption.APPEND);

    }
}
