package com.devmountain.demo;
import java.awt.datatransfer.MimeTypeParameterList;
public class Catalogue {

    private static Map<String,Product> productMap =Map.of(
            "Electric Toothbrush", new Product("Electric Toothbrush", 3550),
            "Baby Alarm", new Product("Baby Alarm", 3550)

    );

    public static Product getProduct (String productName){
        return productMap.get(productName);
    };
}
