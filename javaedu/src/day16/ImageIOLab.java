package day16;

import java.io.*;
import java.net.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class ImageIOLab {
	
	
    public static void main(String[] args) {
        String inputFilePath = "c:/iotest/list.txt";
        String outputDirectory = "c:/iotest/myimage";
        
        File dir = new File(outputDirectory);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            

            while ((line = br.readLine()) != null ) {
                String[] parts = line.split(",");
                if (parts.length != 2) {
                    System.out.println("Invalid line: " + line);
                    continue;
                }

                String imageName = parts[0] + ".jpg";
                String imageURL = parts[1].trim();

                
                try {
                    URL url = new URL(imageURL);
                    BufferedImage img = ImageIO.read(url);
                    File outputFile = new File(outputDirectory, imageName);
                    ImageIO.write(img, "jpg", outputFile);
                    System.out.println(imageName + " saved.");
                } catch (Exception e) {
                    System.out.println("Failed to download image: " + imageURL);
                    e.getMessage();
                }

                
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
