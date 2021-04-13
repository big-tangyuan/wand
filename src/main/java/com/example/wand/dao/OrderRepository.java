package com.example.wand.dao;

import com.example.wand.pojo.Order;


import java.util.List;

/**
 * @Author TangZT
 */
public interface OrderRepository  {
    List<Order> findById(long id);
}
