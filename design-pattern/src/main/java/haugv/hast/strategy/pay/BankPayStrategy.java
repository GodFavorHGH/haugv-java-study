package haugv.hast.strategy.pay;

/**
 * @author haugv
 * @description
 * @date 2021/3/31-8:54 上午
 */
public class BankPayStrategy implements PayStrategy{

    @Override
    public void pay() {
        System.out.println("使用银行卡支付");
    }

}
