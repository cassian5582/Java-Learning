package toolClass.demo1;

public class arrayUitl {
    private arrayUitl(){}
    //定义方法
    public static void printArr(int []arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println(arr[arr.length-1]+"]");
    }

    public static double getAverage(int []arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double)sum / (double)arr.length;
    }
}
