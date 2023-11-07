package com.rfpalma.OrderManagementSystem.Service;


public abstract class AbstractService<I extends Request, O extends Response> {

    O execute(I r) {
        return executeImpl(r);
    }

    protected abstract O executeImpl(I r);

}
