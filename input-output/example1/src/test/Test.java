package test;

import user.User;

import java.io.*;

public class Test {
    public static void main(String[] args) {

        File file = new File("user.txt");

        if (!file.exists()) {

            try {
                if(file.createNewFile()) {
                    System.out.println("New file is created.");
                    System.out.println("Path is: " + file.getAbsolutePath());
                }
            } catch (Exception e) {
                System.err.println(e.toString());
            }
        }

        try {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(in);

            User user = new User();

            System.out.println("*****Registration*****");
            System.out.println("Create a username: ");
            String username = bufferedReader.readLine();
            user.setUsername(username);
            System.out.println("Create a password: ");

            String password = bufferedReader.readLine();
            user.setPassword(password);

            String username_password = user.getUsername() + "," + user.getPassword();

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file.getName()));
            bufferedWriter.write(username_password);

            System.out.println("Registration successful!");
            System.out.println();
            bufferedWriter.close();

            System.out.println("*****LOGIN*****");
            boolean login = false;
            BufferedReader br = new BufferedReader(new FileReader(file.getName()));

            while (!login) {
                System.out.println("Enter your username: ");
                username = bufferedReader.readLine();
                System.out.println("Enter your password: ");
                password = bufferedReader.readLine();

                String line = null;
                String usr, pass;

                while ((line = br.readLine()) != null) {
                    usr = line.substring(0, line.indexOf(','));
                    pass = line.substring(line.indexOf(',') + 1, line.length());

                    if(usr.equals(username) && pass.equals(password)) {
                        System.out.println("Login success!");
                            login = true;
                        } else {
                            System.out.println("Incorrect username or password! Try again!");
                        }
                    }

                    br.close();
                    br = new BufferedReader(new FileReader(file.getName()));
                }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
