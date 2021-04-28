import java.io.File;
import java.io.IOException;

public class Lab10 { 
    public static void main(String[] args) {
        File searchingDir = new File(".");
        getFilesinDirectoryRecursively(searchingDir);
    }

    public static void getFilesinDirectoryRecursively(File mySearchingDir) {
        try {
            File[] files = mySearchingDir.listFiles();
            for (File aFile : files) {
                if (aFile.isDirectory()) {
                    System.out.println("Searching Directory:" + aFile.getCanonicalPath());
                    getFilesinDirectoryRecursively(aFile);
                } else {
                    System.out.println("File in folder:" + aFile.getCanonicalPath());
                }
            }
        } catch (IOException e) {
            System.out.println("Error!");
        }
    }
} // end class