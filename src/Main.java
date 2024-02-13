import Projects.IProjectTemplate;
import Projects.Project1.Project1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IProjectTemplate[] projects = new IProjectTemplate[]{new Project1()};

            System.out.print("Which project would you like to run? ");
            projects[scanner.nextInt() - 1].main(args);
    }
}