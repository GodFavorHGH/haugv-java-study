package haugv.hast;

import haugv.hast.singleton.EnumSingleton;
import haugv.hast.singleton.ThreadSafeSingleton;
import haugv.hast.strategy.discount.CommonPrice;
import haugv.hast.strategy.discount.Customer;
import haugv.hast.strategy.discount.VipPrice;
import haugv.hast.strategy.pay.AliPayStrategy;
import haugv.hast.strategy.pay.PayStrategy;
import haugv.hast.strategy.pay.Payment;
import haugv.hast.strategy.pay.WechatPayStrategy;

import java.math.BigDecimal;

/**
 * @author haugv
 * @description
 * @date 2021/3/31-8:39 上午
 */
public class Main {

    public static void main(String[] args) {
//        Payment payment = new Payment();
//        PayStrategy aliPayStrategy = new AliPayStrategy();
//        PayStrategy wechatPayStrategy = new WechatPayStrategy();
//        payment.pay(aliPayStrategy);
//        payment.pay(wechatPayStrategy);

//        BigDecimal amount = new BigDecimal(100);
//        CommonPrice commonPrice = new CommonPrice();
//        VipPrice vipPrice = new VipPrice();
//        BigDecimal commonPriceAmount = commonPrice.calculatePrice(amount);
//        BigDecimal vipPriceAmount = vipPrice.calculatePrice(amount);
//        System.out.println(commonPriceAmount);
//        System.out.println(vipPriceAmount);
//        Customer customer = new Customer();
//        customer.pay(new CommonPrice(), amount);

//        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
//        ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();
//        ThreadSafeSingleton threadSafeSingleton3 = ThreadSafeSingleton.getInstance();
//        System.out.println(threadSafeSingleton1==threadSafeSingleton2);
//        System.out.println(threadSafeSingleton1==threadSafeSingleton3);

//        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
//        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
//        System.out.println(enumSingleton1==enumSingleton2);


    }

}
