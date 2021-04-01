package haugv.hast.strategy.discount;

import java.math.BigDecimal;

/**
 * @author haugv
 * @description
 * @date 2021/3/31-9:09 上午
 */
public interface IPriceCalculator {

    BigDecimal calculatePrice(BigDecimal amount);

    String getCustomerLevel(Customer customer);

}
