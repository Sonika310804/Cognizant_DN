package DesignPatterns_And_Principles.FatoryMethodPattern_Example;

public class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel Document.");
    }
}