package OOPs;

public class Basics {
    public static void main(String args[]) {
        // Pen p = new Pen();
        // p.setColor("black");
        // p.setTip(5);
        // System.out.println(p.getColor());
        // System.out.println(p.getTip());

        // Student s1 = new Student();
        // Student s2 = new Student("Shraddha");
        // Student s3 = new Student(169);
        // System.out.println(s2.name);
        // System.out.println(s3.age);
        // s1.marks[0] = 9;
        // s1.marks[1] = 7;
        // s1.marks[2] = 8;
        // Student s2 = new Student(s1);
        // s2.marks[0] = 0;
        // System.out.println(s1.marks[0]);

    }
}

// **Access specifiers */
// Int this case the tip and color are cannot be accessed because they are
// private.
// To access them getter and setter are used
// Get : to return the value
// Set : to modify the value
class Pen {
    private int tip;
    private String color;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}

class Student {
    String name;
    int age;
    int marks[] = new int[3];

    // Constructor overloading
    Student(String name) {
        this.name = name;
    }

    Student() {
        System.out.println("Student constructor is called");
    }

    Student(int age) {
        this.age = age;
    }

    // **Copy constructor -- shallow copy -- */
    // Student(Student s) {
    // this.marks = s.marks;
    // }
    // **Copy constructor -- */Deep copy -- */
    Student(Student s) {
        for (int i = 0; i < this.marks.length; i++) {
            this.marks[i] = s.marks[i];
        }
    }
}
