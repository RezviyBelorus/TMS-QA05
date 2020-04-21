package HW_2;

public class task_2 {
    public static void main(String[] args) {
        int jellyFish, ours;
        for ( jellyFish=1,ours=3;ours<25; jellyFish*=2, ours= ours+3) {
                System.out.println("Количество медуз  " + jellyFish + " через " + ours + " часов ");
        }

    }
}
