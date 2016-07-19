package com.emusicstore.dao;

import com.emusicstore.model.Cart;

/**
 * Created by wcc on 2016/7/19.
 */
public interface CartDao {
    Cart create(Cart cart);

    Cart read(String cartId);

    void update(String cartId, Cart cart);

    void delete(String cartId);
}
