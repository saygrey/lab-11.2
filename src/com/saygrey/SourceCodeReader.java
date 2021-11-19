package com.saygrey;

import java.io.File;

public abstract class SourceCodeReader {
    SourceCode src;
    protected abstract SourceCode readFromTextFile(File textFile);
    protected abstract SourceCode readFromConsole();
}
