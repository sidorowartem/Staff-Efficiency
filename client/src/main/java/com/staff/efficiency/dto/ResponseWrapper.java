package com.staff.efficiency.dto;

import java.io.Serializable;

public class ResponseWrapper<T> implements Serializable {
    private static final long serialVersionUID = -3605783116423129062L;
    private boolean success = false;
    private T payload;

    public ResponseWrapper(T payload) {
        success = payload != null;
        this.payload = payload;
    }

    public boolean getSuccess() {
        return success;
    }

    public Object getPayload() {
        return payload;
    }
}
