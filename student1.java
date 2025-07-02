public class student1 {

    String name;
    int roll_no;
    double marks;

    student1(String n, int r, double m) {
        this.name = n;
        this.roll_no = r;
        this.marks = m;

    }

    void displayData() {
        System.out.println(name);
        System.out.println(+roll_no);
        System.out.println(+marks);

    }
}

class demo {
    public static void main(String[] args) {
        student1 s = new student1("Mahesh", 51, 85.54);
        s.displayData();
    }
}
