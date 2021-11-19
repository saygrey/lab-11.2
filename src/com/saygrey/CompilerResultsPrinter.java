package com.saygrey;

public class CompilerResultsPrinter {
    private Compiler comp;
    public CompilerResultsPrinter(Compiler inComp){
        comp=inComp;
    }

    protected void printAllCompileRes(){
        System.out.printf("\nИспользуется компилятор - %s\nРезультаты компиляции :\n",this.comp.getClass());
        printLexemTable();
        printIdentifierTable();
        printDSR();
        printTriads();
        printObjCodeBeforeOpt();
        printOptimizeResults();
    }


    protected void printLexemTable(){
        System.out.printf("\nТаблица лексем :\n%s\n",comp.getLexemTable());
    }

    protected void printIdentifierTable(){
        System.out.printf("\nТаблица идентификаторов :\n%s\n",comp.getIdentifierTable());
    }

    protected void printDSR(){
        System.out.printf("\nДСР :\n%s\n",comp.getDSR());
    }

    protected void printTriads(){
        System.out.printf("\nТриады :\n%s\n",comp.getTriads());
    }

    protected void printObjCodeBeforeOpt(){
        System.out.printf("\nОбъектный код до оптимизации :\n%s\n",comp.getObjCodeBeforeOpt());
    }

    protected void printOptimizeResults(){
        System.out.printf("\nОбъектный код после оптимизации и ее показатели :\n%s\n",comp.getOptimizeResults());
    }
}
