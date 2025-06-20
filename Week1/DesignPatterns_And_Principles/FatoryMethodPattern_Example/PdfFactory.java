package DesignPatterns_And_Principles.FatoryMethodPattern_Example;

public class PdfFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}
