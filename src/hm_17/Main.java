package hm_17;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200.0),
                new Product("Coffee Maker", "Appliances", 80.0),
                new Product("Headphones", "Electronics", 150.0),
                new Product("Blender", "Appliances", 50.0),
                new Product("TV", "Electronics", 900.0)
        );

        // Grouping by categories
        Map<String, List<Product>> groupedByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        System.out.println("=== Grouped by Category ===");
        groupedByCategory.forEach((category, list) ->
                System.out.println(category + ": " + list));


        // The average price of products in each category
        Map<String, Double> avgPrices = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)));

        System.out.println("\n=== Average Price by Category ===");
        avgPrices.forEach((category, avg) ->
                System.out.printf("%s: %.2f%n", category, avg));

        // The categoru with the highest average price
        Optional<Map.Entry<String, Double>> maxCategory = avgPrices.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        System.out.println("\n=== Category with Highest Average ===");
        maxCategory.ifPresent(entry ->
                System.out.printf("Category: %s (%.2f)%n", entry.getKey(), entry.getValue()));

    }
}
