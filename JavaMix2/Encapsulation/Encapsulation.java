public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        // s.age = -100; // from that its can print wrong value for age

        s.setAge(100);
        // System.out.println("age is:" + s.age);
        s.getAge();
    }

}

class Student {
    private int age; // if only putting the private infront of AGE CANNOT ACCESS IT
    int password;

    // adding setters for accessing the age
    void setAge(int a) {
        if (a < 0) {
            System.out.println("Invalid age");
        } else {
            this.age = a;
            // System.out.println(a);
        }
    }

    int getAge() {
        return this.age;
    }
}