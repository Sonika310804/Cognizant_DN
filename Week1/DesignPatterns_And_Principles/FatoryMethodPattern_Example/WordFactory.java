package DesignPatterns_And_Principles.FatoryMethodPattern_Example;

public class WordFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}