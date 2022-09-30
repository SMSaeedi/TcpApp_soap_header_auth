package com.example.demo.webService;

import com.example.demo.model.ChangePaymentMethodInput;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://impl.webService.changePayment.demo.example.com/")
public interface ChangePayment {

    @WebMethod(operationName = "getBusiName")
    public String getBusiName(@WebParam(name = "c_id") Long c_id) throws Exception;

    @WebMethod(operationName = "updateCPM")
    public String updateCPM(@WebParam(name = "input") ChangePaymentMethodInput input) throws Exception;
}