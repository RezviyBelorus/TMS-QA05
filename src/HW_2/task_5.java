package HW_2;

public class task_5 {
    public static void main(String[] args) {
        double inch;
        double cm = 2.54;
        double numberCm;
        for (inch = 1; inch < 21; inch++) {
            numberCm = inch * cm;
            System.out.println(inch + " дюйм равен " + numberCm + " сантиметров");
        }
    }
}
