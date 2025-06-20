package DesignPatterns_And_Principles.FatoryMethodPattern_Example;

public class ExcelFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}