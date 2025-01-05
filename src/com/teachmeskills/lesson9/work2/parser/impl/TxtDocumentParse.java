package com.teachmeskills.lesson9.work2.parser.impl;

import com.teachmeskills.lesson9.work2.parser.Parser;

public class TxtDocumentParse implements Parser {

    @Override
    public void parseFile(String fileName) {
        System.out.println("Parsing  Txt  " + fileName);
    }
}
