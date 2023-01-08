import java.io.*;

public class FileDemo {
    public static void main(String[] args) {

        File originalFile = new File("original.txt");
        File copyFile = new File("copy.txt");

        if (!originalFile.exists()) {
            try {
                if (originalFile.createNewFile()) {
                    System.out.println("New file is created.");
                    System.out.println("Path is: " + originalFile.getAbsolutePath());
                }
            } catch (Exception e) {
                System.err.println(e.toString());
            }
        }

        if (!copyFile.exists()) {
            try {
                if (copyFile.createNewFile()) {
                    System.out.println("New file is created.");
                    System.out.println("Path is: " + copyFile.getAbsolutePath());
                }
            } catch (Exception e) {
                System.err.println(e.toString());
            }
        }

        try {

            PrintWriter printWriter = new PrintWriter(System.out,true);
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(in);


            printWriter.println("Enter some text: ");
            String text = bufferedReader.readLine();

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(originalFile.getName()));
            bufferedWriter.write(text);
            bufferedWriter.close();
            
            printWriter.println("Do you want to copy text (yes/no?) ");
            String response = bufferedReader.readLine();

            BufferedReader br = new BufferedReader(new FileReader(originalFile.getName()));

            if (response.equals("yes")) {
                String line = null;
                while ((line = br.readLine()) != null) {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(copyFile.getName()));
                    bw.write(text);
                    printWriter.println("Text copied successfully!");
                    bw.close();
                }
                br.close();

                printWriter.println("Do you want check copied file (yes/no?) ");

                response = bufferedReader.readLine();

                br = new BufferedReader(new FileReader(copyFile.getName()));

                if (response.equals("yes")) {
                    while ((line = br.readLine()) != null) {
                        printWriter.println("The text that you copied: " + line);
                    }
                    br.close();
                }

                printWriter.println("Do you delete a copy of a file (yes/no?) ");
                response = bufferedReader.readLine();

                if (response.equals("yes")) {
                    copyFile.delete();
                    printWriter.println("Copied file was deleted successfully!");
                }
            }

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
