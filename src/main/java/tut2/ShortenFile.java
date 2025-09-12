package tut2;

import java.io.*;

public class ShortenFile {

    public static void shortenFile(InputStream in, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in));
             PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String shortened = line.replaceAll("\\s+", "");
                writer.println(shortened);
            }

            System.out.println("Done:" + outputFile);

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        
        InputStream in = ShortenFile.class.getClassLoader().getResourceAsStream("file/input.txt");
        if (in == null) {
            System.err.println("Không tìm thấy file trong resources!");
            return;
        }

        String outputFile = "SE1_Fall2025/SE1_tut1/src/main/resources/file/output.txt";
        shortenFile(in, outputFile);
    }
}
