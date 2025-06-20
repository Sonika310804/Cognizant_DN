package Algorithms_DataStructure.SearchFunctionality;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Mouse", "Electronics"),
                new Product(3, "Chair", "Furniture"),
                new Product(4, "Notebook", "Stationery")
        };

        // Linear Search
        Product result1 = LinearSearch.search(products, "Mouse");
        System.out.println("Linear Search Result: " + result1);

        // Binary Search
        BinarySearch.sortProductsByName(products);
        Product result2 = BinarySearch.search(products, "Mouse");
        System.out.println("Binary Search Result: " + result2);
    }
}