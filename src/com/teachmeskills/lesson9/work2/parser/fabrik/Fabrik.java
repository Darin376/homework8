package com.teachmeskills.lesson9.work2.parser.fabrik;

import com.teachmeskills.lesson9.work2.parser.Parser;
import com.teachmeskills.lesson9.work2.parser.impl.JsonDocumentParser;
import com.teachmeskills.lesson9.work2.parser.impl.TxtDocumentParse;
import com.teachmeskills.lesson9.work2.parser.impl.XmlDocumentParser;

public class Fabrik {

 public static Parser createParser(String input) {

     if(input.endsWith(".json")) {
         return new JsonDocumentParser();
     } else if (input.endsWith(".xml")) {
         return new XmlDocumentParser();

     } else if (input.endsWith(".txt")) {
         return new TxtDocumentParse();
     } else {
         return null;
     }
 };
}
