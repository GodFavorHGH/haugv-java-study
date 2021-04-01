package haugv.hast.strategy.discount;

import java.math.BigDecimal;

/**
 * @author haugv
 * @description
 * @date 2021/3/31-9:17 上午
 */
public class Customer {

    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void pay(IPriceCalculator calculator, BigDecimal amount){
        System.out.println(calculator.calculatePrice(amount));
    }

}
