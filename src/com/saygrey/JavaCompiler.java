package com.saygrey;

public class JavaCompiler extends Compiler {
    public JavaCompiler(JavaSourceCode inSrc) {
        srcCode = inSrc;
    }

    public JavaCompiler() {
    }

    @Override
    protected void compile() {
        lexicalAnalysis();
        syntaxParsing();
        semanticParsing();
        createObjectCode();
        optimizeCode();
    }

    public void setSrcCode(SourceCode inSrc) {
        srcCode.setCode(inSrc.getCode());
        System.out.println("setSrcCode");
    }

    @Override
    protected void lexicalAnalysis() {
        new LexicalAnalyzator();
        System.out.println("lexicalAnalysis()");
    }

    @Override
    protected void syntaxParsing() {
        new SyntaxParser();
        System.out.println("syntaxParsing()");
    }

    @Override
    protected void semanticParsing() {
        new SemanticParser();
        System.out.println("semanticParsing()");
    }

    @Override
    protected void createObjectCode() {
        System.out.println("createObjectCode()");
    }

    @Override
    protected void optimizeCode() {
        System.out.println("optimizeCode()");
    }

    @Override
    public ObjectCode getObjCode() {
        return null;
    }


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
