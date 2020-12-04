package org.sydlabz.demo;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class LoadData {
    public static List<LinkedHashMap<?, ?>> load() throws IOException {
        final String RESOURCE_PATH = "Absolute path of fruits.json";
        Gson gsonHandle = new Gson();
        Reader jsonReader = Files.newBufferedReader(Paths.get(RESOURCE_PATH));
        return new LinkedList<>(gsonHandle.fromJson(jsonReader, List.class));
    }
}
