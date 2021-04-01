package haugv.hast.strategy.pay;

/**
 * @author haugv
 * @description
 * @date 2021/3/31-8:53 上午
 */
public class AliPayStrategy implements PayStrategy{

    @Override
    public void pay() {
        System.out.println("使用支付宝支付");
    }

}
