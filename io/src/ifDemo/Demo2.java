package ifDemo;

public class Demo2 {
    static void main(String[] args) {
        outer:  // 标签
        for (int i = 1; i <= 3; i++) {
            inner :
            for (int j = 1; j <= 3; j++) {
                if (i * j > 4) {
                    break inner;  // 跳出外层循环
                }
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
