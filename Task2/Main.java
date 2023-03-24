package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    File file;
    Scanner scan;
    public static void main(String[] args) {

    }
    public ArrayList<String> readFileData(String path) {
        file = new File(path);
        ArrayList<String> data = new ArrayList<>();

        try {
            scan = new Scanner(file);
            scan.nextLine();

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                data.add(line);

            }
        } catch (FileNotFoundException e) {
            System.out.println(",");

        }
        return data;
    }
}