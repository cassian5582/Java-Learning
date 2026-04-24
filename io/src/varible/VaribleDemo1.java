package varible;

public class VaribleDemo1 {
    static void main(String[] args) {

        double wechatCharge = 0;   //微信余额
        double alipayCharge = 10;  //支付宝余额
        double cardCharge = 20;    //银行卡余额
        //输出总余额
        System.out.println("总余额："+(wechatCharge + alipayCharge + cardCharge));
        //
        wechatCharge+=10;
        wechatCharge-=2;
        System.out.println("微信余额："+wechatCharge);
    }
}
