package com.kodilla.stream.beautifier;

public class PoeamBeautifier {

    public void beautify (String text, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(text);
        System.out.println("Tekst po upiększeniu: ");
        System.out.println(result);
    }

}
