package com.saygrey;

public class JavaCompiler extends Compiler {
    public JavaCompiler(JavaSourceCode inSrc){
        srcCode=inSrc;
    }

    @Override
    protected void compile() {
        lexicalAnalysis();
        syntaxParsing();
        semanticParsing();
        createObjectCode();
        optimizeCode();
    }

    @Override
    protected void lexicalAnalysis() { }

    @Override
    protected void syntaxParsing() { }

    @Override
    protected void semanticParsing() { }

    @Override
    protected void createObjectCode() { }

    @Override
    protected void optimizeCode() { }


    @Override
    public Lexem[] getLexemTable() {
        return null;
    }

    @Override
    public Identifier[] getIdentifierTable() {
        return null;
    }

    @Override
    public DSR getDSR() {
        return null;
    }

    @Override
    public Triad[] getTriads() {
        return null;
    }

    @Override
    public OptimizeResults getOptimizeResults() {
        return null;
    }

    @Override
    public String getObjCodeBeforeOpt() {
        return null;
    }
}
