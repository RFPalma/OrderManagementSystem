package com.rfpalma.OrderManagementSystem.Controller.Rest;

import com.rfpalma.OrderManagementSystem.Service.GetOrder.GetOrderRequest;
import com.rfpalma.OrderManagementSystem.Service.GetOrder.GetOrderResponse;
import com.rfpalma.OrderManagementSystem.Service.GetOrder.GetOrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("order-rest")
public class OMSRestController {

    @Autowired
    GetOrderServiceImpl getOrderService;

    @GetMapping("/{id}", produces = "application/json")
    public ResponseBody<GetOrderResponse> getOrder(@PathVariable GetOrderRequest orderRequest) {
        return getOrderService.execute(orderRequest);
    }

}
