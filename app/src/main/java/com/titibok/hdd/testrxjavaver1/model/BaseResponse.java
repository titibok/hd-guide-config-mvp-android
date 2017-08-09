package com.titibok.hdd.testrxjavaver1.model;

import com.google.gson.annotations.SerializedName;

public class BaseResponse<T> {

    private T data = null;

    private Boolean error;

    private Object errors;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public Object getErrors() {
        return errors;
    }

    public void setErrors(Object errors) {
        this.errors = errors;
    }

}