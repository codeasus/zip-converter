package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner   = new Scanner(System.in);
        String sourcePath = null;
        System.out.print("Enter path to zip : ");
        if(scanner.hasNextLine()) {
            sourcePath = scanner.nextLine();
        }
        scanner.close();
        ZipController inputConversion = new ZipController(sourcePath);
        System.out.println("Generated zip path : " + inputConversion.convertSourceToZip());
    }
}
