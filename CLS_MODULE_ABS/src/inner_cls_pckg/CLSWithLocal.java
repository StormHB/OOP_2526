package inner_cls_pckg;

import java.util.ArrayList;
import java.util.Arrays;

public class CLSWithLocal {

    public void processStringData(String[] data) {

        class StringDataParser {
            private int validNumInstances;
            private int invalidNumInstances;

            boolean isValid(String dataElement) {
                return dataElement != null && dataElement.contains(";") && dataElement.split(";").length == 3;
            }

            String [] parseElements(String toParse) {
                return toParse.split(";");
            }

            void printParsedElements(String[] elements) {
                for(String el : elements) {
                    System.out.println(el);
                }
                System.out.println("----------------------------\n");
            }

            void processData(String dataElement){
                if (isValid(dataElement)) {
                    String [] elements = parseElements(dataElement);
                    printParsedElements(elements);
                    validNumInstances++;
                } else {
                    System.out.println(dataElement + " is not valid for parsing and processing!");
                    invalidNumInstances++;
                }
            }

            void giveReport() {
                System.out.println("Number of valid elements: " + validNumInstances);
                System.out.println("Number of invalid elements: " + invalidNumInstances);
            }
        }

        StringDataParser stringDataParser = new StringDataParser();
        for(String dataElement : data) {
            stringDataParser.processData(dataElement);
        }
        stringDataParser.giveReport();
    }
}
