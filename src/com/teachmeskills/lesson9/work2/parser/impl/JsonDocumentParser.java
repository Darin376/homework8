package com.teachmeskills.lesson9.work2.parser.impl;

import com.teachmeskills.lesson9.work2.parser.Parser;

import javax.swing.text.html.parser.DocumentParser;

public class JsonDocumentParser implements Parser {


    @Override
    public void parseFile(String fileName) {
        System.out.println("json pars " + fileName);
    }

}
