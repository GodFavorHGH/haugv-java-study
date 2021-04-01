package haugv.hast.strategy.pay;

/**
 * @author haugv
 * @description
 * @date 2021/3/31-9:01 上午
 */
public class MeiTuanPayStrategy implements PayStrategy{

    @Override
    public void pay() {
        System.out.println("使用美团支付");
    }

}
