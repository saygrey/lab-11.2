package com.saygrey;

public class CompilerResultsPrinter {
    private Compiler comp;
    public CompilerResultsPrinter(Compiler inComp){
        comp=inComp;
    }

    protected void printAllCompileRes(){
        System.out.printf("\nИспользуется компилятор - %s\nРезультаты компиляции :\n",this.comp.getClass());
        printObjCode();

    }
    protected void printObjCode(){
        System.out.printf("\nОбъектный код :\n%s\n",comp.getObjCode());
    }

}
