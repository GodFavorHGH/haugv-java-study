package haugv.hast.strategy.discount;

import java.math.BigDecimal;

/**
 * @author haugv
 * @description
 * @date 2021/3/31-9:11 上午
 */
public class CommonPrice implements IPriceCalculator{

    @Override
    public BigDecimal calculatePrice(BigDecimal amount) {
        return new BigDecimal(0.9).multiply(amount);
    }

    @Override
    public String getCustomerLevel(Customer customer) {
        return "Normal";
    }

}
