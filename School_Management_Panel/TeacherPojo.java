package School_Management_Panel;

public class TeacherPojo {
    String teacher_id;
    String teacher_name_LastName;
    private int teacher_age;
    String branch;
    String registrationNumber;

    public TeacherPojo() {
    }

    public TeacherPojo(String teacher_id, String teacher_name_LastName, int teacher_age, String branch, String registrationNumber) {
        this.teacher_id = teacher_id;
        this.teacher_name_LastName = teacher_name_LastName;
        this.teacher_age = teacher_age;
        this.branch = branch;
        this.registrationNumber = registrationNumber;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public int getTeacher_age() {
        return teacher_age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacher_id='" + teacher_id + '\'' +
                ", name_LastName='" + teacher_name_LastName + '\'' +
                ", age=" + teacher_age +
                ", branch='" + branch + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}
