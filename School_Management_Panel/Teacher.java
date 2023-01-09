package School_Management_Panel;

import java.util.*;

public class Teacher {
    static Scanner input = new Scanner(System.in);
   static Hashtable<String, TeacherPojo> teacherList = new Hashtable<>();

    public static void add_Teacher() {
        boolean cont = true;
        do {
            System.out.println("Access Teacher's ID" );
            String teacher_id = input.next();
            System.out.println("Access Teacher's Teacher's Name and Lastname" );
            String teacher_name_LastName = input.nextLine();
            System.out.println("Access Teacher's Teacher's age" );
            int teacher_age = input.nextInt();
            System.out.println("Access Teacher's Teacher's branch" );
            String branch = input.next();
            System.out.println("Access Teacher's Registration Number" );
            String registrationNumber = input.next();

            TeacherPojo teacherObje = new TeacherPojo(teacher_id,teacher_name_LastName,teacher_age,branch,registrationNumber);
            teacherList.put(teacher_id,teacherObje);

            System.out.println("If you want to terminate addition,  PRESS '0' \n" +
                    "If you want to continue, PRESS '1' " );
            int selection = input.nextInt();
            if (selection == 0) {
                System.out.println("Adding teacher information has terminated . ." );

                break;

            }
        } while (cont);


    }

    public static void search_Teacher(){
        System.out.println("Type teacher_id that you want to search" );
        String teacher_id = input.next();
        System.out.println(teacherList.get(teacher_id));

        System.out.println("If you want to go on searhing PRESS '1' \n" +
                "If you want to exit PRESS any number");
        int selection2 = input.nextInt();
        if(selection2==1){
            search_Teacher();
        }else{
            Panel.teacherMenu();
        }


    }

    public static void list_Teacher(){
        Set<Map.Entry<String, TeacherPojo>> entries_list_Teacher = teacherList.entrySet();
        for (Map.Entry<String, TeacherPojo> w : entries_list_Teacher ) {
            System.out.println(w);

        }
        System.out.println("For Teacher's menu press '0'\n" +
                "For main menu press any number");
        int selection3 = input.nextInt();
        if (selection3==0){
            Panel.teacherMenu();
        }else{
            Panel.menu();
        }
    }

    public static void remove_teacher(){
        System.out.println("Type teacher_id that you want to remove" );
        String teacher_id = input.next();
        teacherList.remove(teacher_id);
        System.out.println("Teacher with "+teacher_id+" removed succesfully . .");

        System.out.println("If you want to go on removing otherone PRESS '1' \n" +
                "For main menu press any number");
        int selection4 = input.nextInt();
        if (selection4==1){
            remove_teacher();
        }else{
            Panel.menu();
        }

    }
}
