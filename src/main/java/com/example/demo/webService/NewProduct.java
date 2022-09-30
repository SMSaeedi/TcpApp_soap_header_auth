package com.example.demo.webService;


import com.example.demo.model.NewProductsOutput;
import com.example.demo.model.NewProductModel;
import com.example.demo.model.NewProductsInput;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;


@WebService(targetNamespace = "http://impl.webService.demo.example.com/")
public interface NewProduct {

    @WebMethod(operationName = "newProducts")
    public List<NewProductModel> newProducts(@WebParam(name = "input") NewProductsInput subject) throws Exception;

    @WebMethod(operationName = "newProductsTest")
    public NewProductsOutput newProductsTest(@WebParam(name = "input") NewProductsInput subject) throws Exception;

}