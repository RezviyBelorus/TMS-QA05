package HW_2;

public class task_3 {
    public static void main(String[] args) {

        int number, sum;
        for ( number = 1, sum = 0; number < 256; number = number * 2, sum =sum + number );
        System.out.println("Сумма: " + sum);
    }
}
