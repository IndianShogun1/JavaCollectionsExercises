import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private double age;
    private double score;

    public Student(String name, double age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

public class Ques5 {
    public static void main(String[] args) {
        Student student1 = new Student("Shreyansh", 21, 80);
        Student student2 = new Student("Archit", 22, 75);
        Student student3 = new Student("Neelesh", 21, 93);
        Student student4 = new Student("Pushkar", 20, 80);
        Student student5 = new Student("Satyam", 23, 70);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if(s1.getScore() == s2.getScore()) {
                    if(s1.getName().compareTo(s2.getName()) < 0){
                        return -1;
                    } else {
                        return 1;
                    }
                } else if(s1.getScore() > s2.getScore()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        System.out.println("Students in increasing order of marks:");
        for (Student s: students) {
            System.out.println(s.getName() + " " + s.getScore());
        }
    }
}
