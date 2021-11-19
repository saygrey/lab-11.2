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
    public String getObjCode() {
        return null;
    }
}
