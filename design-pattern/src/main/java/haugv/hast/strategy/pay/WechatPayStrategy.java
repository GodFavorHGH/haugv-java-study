package haugv.hast.strategy.pay;

/**
 * @author haugv
 * @description
 * @date 2021/3/31-8:52 上午
 */
public class WechatPayStrategy implements PayStrategy{

    @Override
    public void pay() {
        System.out.println("使用微信支付");
    }

}
