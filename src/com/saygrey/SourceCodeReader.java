package com.saygrey;

import java.io.File;

public interface SourceCodeReader {
    SourceCode readFromTextFile(File textFile);
    SourceCode readFromConsole();
}
