package com.stackroute;

import java.io.File;

public class ExtensionFiles {

    public static void main(String[] args) {

        File file = new File("/home/cgi/Downloads/random/");
        String fileName = "hello.txt";
        ExtensionFiles ef = new ExtensionFiles(".txt");
        Boolean x = ef.accept(file,fileName);

    }


    String fileExtension;

    public ExtensionFiles(String fileExtension) {
        this.fileExtension = fileExtension;
    }


    public boolean accept(File directory, String fileName) {
        return (fileName.endsWith(this.fileExtension));
    }
}
