package com.saygrey;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        JavaSourceCodeReader testReader=new JavaSourceCodeReader();
        JavaSourceCode test=testReader.readFromTextFile(new File("testFile.txt"));
        Compiler testComp=new JavaCompiler(test);
        testComp.compile();
        CompilerResultsPrinter testPrinter=new CompilerResultsPrinter(testComp);
        testPrinter.printAllCompileRes();
    }
}
