package com.blannoo.adventofcode.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileUtil {

    public BufferedReader getBufferedReader(String inputFileName) {
        final InputStream stream = this.getClass().getResourceAsStream(inputFileName);
        final InputStreamReader reader = new InputStreamReader(stream);
        return new BufferedReader(reader);
    }
}
