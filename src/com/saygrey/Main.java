package com.saygrey;

public class Main {

    public static void main(String[] args) {
        JavaSourceCodeReader testReader = new JavaSourceCodeReader();
        JavaSourceCode test = testReader.readFromConsole();
        Compiler testComp = new JavaCompiler(test);
        testComp.compile();
        CompilerResultsPrinter testPrinter = new CompilerResultsPrinter(testComp);
        testPrinter.printAllCompileRes();
    }
}
