package com.teachmeskills.lesson9.work2.parser;

import com.teachmeskills.lesson9.work2.parser.fabrik.Fabrik;
import com.teachmeskills.lesson9.work2.parser.impl.FilCard;
import com.teachmeskills.lesson9.work2.parser.impl.JsonDocumentParser;
import com.teachmeskills.lesson9.work2.parser.impl.XmlDocumentParser;

import java.util.Scanner;

public class Ranner {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();


//      if(input.endsWith(".json")) {
//          JsonDocumentParser jsonparser = new JsonDocumentParser();
//          jsonparser.parseFile(input);
//      } else if (input.endsWith(".xml")) {
//          XmlDocumentParser xmlparser = new XmlDocumentParser();
//          xmlparser.parseFile(input);
//
//      } else {
//          System.out.println("Invalid input");
//      }

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Parser parser = Fabrik.createParser(input);
        parser.parseFile(input);
//        JsonDocumentParser jsonDocumentParser = new JsonDocumentParser();
//        jsonDocumentParser.parseFile("oleg gay");
//        FilCard filCard = new FilCard();

//        XmlDocumentParser xmlDocumentParser = new XmlDocumentParser();
//        xmlDocumentParser.parseFile(input);
//        if(input.endsWith(".json")) {
//            parser = new JsonDocumentParser();
//        } else if (input.endsWith(".xml")) {
//            parser = new XmlDocumentParser();
//s
//        } else {
//            System.out.println("Invalid input");
//        }

//        parser.parseFile(input);
    }


}
