package haugv.hast.strategy.discount;

import java.math.BigDecimal;

/**
 * @author haugv
 * @description
 * @date 2021/3/31-9:12 上午
 */
public class VipPrice implements IPriceCalculator{

    @Override
    public BigDecimal calculatePrice(BigDecimal amount) {
        return new BigDecimal(0.8).multiply(amount);
    }

    @Override
    public String getCustomerLevel(Customer customer) {
        return "Vip";
    }

}
