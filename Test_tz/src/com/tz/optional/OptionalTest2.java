package com.tz.optional;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

/**
 * create by tz on 2018-07-14
 */
public class OptionalTest2 {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("../gutenberg/alice30.txt")), StandardCharsets.UTF_8);

    }

}
