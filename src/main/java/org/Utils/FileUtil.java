package org.Utils;

import org.Day2.Main;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileUtil {

    public static List<String> getFileContent(String fileName) {
        Path path = null;
        List<String> collect;
        try {
            path = Paths.get(Main.class.getClassLoader()
                    .getResource(fileName).toURI());
            Stream<String> lines = Files.lines(path);
            collect = lines.collect(Collectors.toList());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return collect;
    }
}
