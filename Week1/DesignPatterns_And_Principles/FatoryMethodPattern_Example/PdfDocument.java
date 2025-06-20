package DesignPatterns_And_Principles.FatoryMethodPattern_Example;

public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF Document.");
    }
}
