package com.saygrey;

import java.io.File;

public class JavaSourceCodeReader implements SourceCodeReader{
    @Override
    public JavaSourceCode readFromTextFile(File textFile) {
        return null;
    }
    public JavaSourceCode readFromConsole(){
        System.out.printf("\nВведите исходный код в консоль.\n");
        return null;
    }
}
