package io.github.appstash.shop.service.cart.api;

import io.github.appstash.shop.service.cart.model.CartItemInfo;
import io.github.appstash.shop.service.product.model.ProductInfo;

import java.math.BigDecimal;
import java.util.List;

public interface CartFulfillmentProvider {
    CartItemInfo addItem(ProductInfo product);
    void removeItem(CartItemInfo item);
    List<CartItemInfo> getAll();
    void clear();
    boolean isEmpty();
    BigDecimal getTotalSum();
}
