package com.saygrey;

public abstract class SourceCode {
    public SourceCode(String sourceCodeStringIn){
        sourceCode=sourceCodeStringIn;
    }
    private String sourceCode;
    public String getSourceCode(){
        return sourceCode;
    }
}
