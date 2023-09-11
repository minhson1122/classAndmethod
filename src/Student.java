import java.util.Arrays;

public class Student {
    public String name;
    public int age;
    public double[] points;

    public Student(String name, int age, double[] points) {
        this.name = name;
        this.age = age;
        this.points = points;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPoints(double[] points) {
        this.points = points;
    }
    public double getAvg(){
        double sum = 0;
        for (double d:this.points) {
            sum += d;
        }
        double lengthPoints = this.points.length;
        return sum/lengthPoints;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", points=" + Arrays.toString(points) +
                '}';
    }
}

class Main0 {
    public static void main(String[] args) {
        double[] pointsSv1 = {7.0, 8.0, 9.0};
        Student Sv1 = new Student(" Hồng", 20, pointsSv1);
        double[] pointsSv2 = {5.6, 8.5, 9.0};
        Student Sv2 = new Student(" linh", 20, pointsSv2);
        Sv1.setAge(43);
        Sv2.setName("sơn");

        double avgSv1 = Sv1.getAvg();
        double avgSv2 = Sv2.getAvg();
        System.out.println(avgSv1);
        System.out.println(avgSv2);

        if (avgSv1 > avgSv2){
            System.out.println("Điểm sinh viên" + Sv1.name + " cao hơn");
        } else if (avgSv1 == avgSv2) {
            System.out.println(" Điểm hai sinh viên bằng nhau");
        } else {
            System.out.println("Điểm sinh viên" + Sv2.name + "cao hơn");
        }
    }

}
