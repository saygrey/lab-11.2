package com.saygrey;

public abstract class SourceCode implements Codable {
    public SourceCode(String sourceCodeStringIn){
        sourceCode=sourceCodeStringIn;
    }
    private String sourceCode;

    @Override
    public String getCode() {
        return null;
    }
    public void setCode(String inCode){
        sourceCode=inCode;
    }
}
