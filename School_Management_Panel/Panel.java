package School_Management_Panel;

import java.util.Scanner;

public class Panel {
    static Scanner input = new Scanner(System.in);

    public static void menu() {
        System.out.println(
                "==================================================\n" +
                        "S C H O O L    M A N A G E M E N T   S Y S T E M \n" +
                        "==================================================\n\n" +

                        "SELECT THE OPTION YOU WANT TO DO\n" +
                        "1 - STUDENT MANAGEMENT\n" +
                        "2 - TEACHER MANAGEMENT\n" +
                        "Q - EXIT"
        );
        String selection1 = input.next();
        switch (selection1) {

            case "2":
                teacherMenu();
            case "Q":
                break;

        }
    }

    public static void teacherMenu() {
        System.out.println(
                "==================================================\n" +
                        "T E A C H E R    M A N A G E M E N T   S Y S T E M \n" +
                        "==================================================\n\n" +

                        "SELECT THE OPTION YOU WANT TO DO\n" +
                        "1 - ADD  \n" +
                        "2 - SEARCH \n" +
                        "3 - LIST \n" +
                        "4 - DELETE \n" +
                        "5 - MAIN MENU \n" +
                        "Q - EXIT" );

        String teacherSelection = input.next();
        switch (teacherSelection) {

            case "1":
                Teacher.add_Teacher();
                menu();
            case "2":
                Teacher.search_Teacher();
                menu();
            case "3":
                Teacher.list_Teacher();
                menu();
            case "4":
                Teacher.remove_teacher();
                menu();
            case "5":
                menu();
            case "Q":
                break;


        }

    }


}
