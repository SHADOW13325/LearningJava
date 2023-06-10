package com.example.Java13Features.Features;

/**
 * @author saumitra chauhan
 */
public class MultiLineTextBlock {

    public static void main(String[] args) {

        String st1 = """
                    Hello World
                    Using 
                    text blocks !""";

        System.out.println("st1 = " + st1);

        String phrase = """
                        { 
                        employee : "Mike", 
                        employeeId: 10001; 
                        employeeType: FT
                        }
                        """;
        System.out.println("phrase = " + phrase);

        String html = """
                    <html>
                        <body>
                        <p>"Java, Programming"</p>
                        </body>
                    </html>
                    """;

        System.out.println("html = " + html);

        // They support all string functions
        String st2 = st1.concat("This is my first text block");
        System.out.println("st2 = " + st2);


    }
}

/*
    Text Blocks are useful in controlling how the string is formatted.
    They support the string functions.
 */