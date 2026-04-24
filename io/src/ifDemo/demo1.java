package ifDemo;

public class demo1 {
    static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.print(num + " ");  // 输出: 1 2 3 4 5
        }
        System.out.println();

// 遍历字符串
        String str = "Hello";
        for (char ch : str.toCharArray()) {
            System.out.print(ch + " ");  // 输出: H e l l o
        }

    }
}
