package com.rfpalma.OrderManagementSystem.Service.GetOrder;

import com.rfpalma.OrderManagementSystem.Service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class GetOrderServiceImpl extends AbstractService<GetOrderRequest, GetOrderResponse> {

    protected GetOrderResponse executeImpl(GetOrderRequest getOrderRequest) {

        return new GetOrderResponse();
    }
}
