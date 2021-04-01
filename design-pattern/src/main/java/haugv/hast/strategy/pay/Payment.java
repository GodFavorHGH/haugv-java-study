package haugv.hast.strategy.pay;

/**
 * @author haugv
 * @description
 * @date 2021/3/31-8:56 上午
 */
public class Payment {

    public void pay(PayStrategy payStrategy){
        payStrategy.pay();
    }

}
