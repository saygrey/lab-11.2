package com.saygrey;

public class CompilerResultsPrinter {
    private Compiler comp;
    public CompilerResultsPrinter(Compiler inComp){
        comp=inComp;
    }

    protected void printAllCompileRes(){
        printCompilerInfo();
        printObjCode();
    }
    protected void printCompilerInfo(){
        System.out.printf("\nИспользуется компилятор - %s\nРезультаты компиляции :\n",this.comp.getClass());
    }

    protected void printObjCode(){
        System.out.printf("\nОбъектный код :\n%s\n",comp.getObjCode());
    }
}
