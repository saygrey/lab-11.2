package com.saygrey;

import java.io.File;

public class JavaSourceCodeReader extends SourceCodeReader{
    @Override
    protected JavaSourceCode readFromTextFile(File textFile) {
        return null;
    }
    protected JavaSourceCode readFromConsole(){
        System.out.printf("\nВведите исходный код в консоль.\n");
        return null;
    }
}
