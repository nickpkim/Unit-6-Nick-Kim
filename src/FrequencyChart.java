import java.util.*;
public class FrequencyChart {
    private int[] list;
    public FrequencyChart(int[] arr){
        list = arr;
    }
    public String makeChart(){
        String print = "";
        print += "1 - 10 | ";
    }
    public void makeChartVoid(){
        System.out.println("1 - 10 | ");
        for (int n : list){
            if (0 < n && n <= 10){
                System.out.print("*");
            }
        }
        System.out.println("11 - 20 | ");
        for (int n : list){
            if (10 < n && n <= 20){
                System.out.print("*");
            }
        }
        System.out.println("21 - 30 | ");
        for (int n : list){
            if (20 < n && n <= 30){
                System.out.print("*");
            }
        }
        System.out.println("31 - 40 | ");
        for (int n : list){
            if (30 < n && n <= 40){
                System.out.print("*");
            }
        }
        System.out.println("41 - 50 | ");
        for (int n : list){
            if (40 < n && n <= 50){
                System.out.print("*");
            }
        }
        System.out.println("51 - 60 | ");
        for (int n : list){
            if (50 < n && n <= 60){
                System.out.print("*");
            }
        }
        System.out.println("61 - 70 | ");
        for (int n : list){
            if (60 < n && n <= 70){
                System.out.print("*");
            }
        }
        System.out.println("71 - 80 | ");
        for (int n : list){
            if (70 < n && n <= 80){
                System.out.print("*");
            }
        }
        System.out.println("81 - 90 | ");
        for (int n : list){
            if (80 < n && n <= 90){
                System.out.print("*");
            }
        }
        System.out.println("91 - 100 | ");
        for (int n : list){
            if (90 < n && n <= 100){
                System.out.print("*");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        System.out.println("How many data values will you input?");
        input = scan.nextInt();
        int[] nums = new int[input];
        System.out.println();
        System.out.println("Enter data values one at a time (1-100)");
        int val;
        for (int i=0; i<input; i++){
            val = scan.nextInt();
            nums[i] = val;
        }
        System.out.println();
        System.out.println("Printing...");
        FrequencyChart chart = new FrequencyChart(nums);
        System.out.println();
        chart.makeChart();
    }
}
