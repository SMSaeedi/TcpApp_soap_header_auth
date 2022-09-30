package com.example.demo.webService.impl;

import com.example.demo.model.NewCustomerInput;
import com.example.demo.model.NewCustomerOutput;
import com.example.demo.model.NewCustomerStatement;
import com.example.demo.webService.NewCustomer;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;
import java.sql.SQLException;

@WebService(serviceName = "newCustomerWebService")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class NewCustomerImpl implements NewCustomer {

    @Override
    public Long insertCostumer(NewCustomerInput cust) throws SQLException {
        return new NewCustomerStatement().insertCostumer(cust);
    }

    @Override
    public NewCustomerOutput testi(NewCustomerInput cust) {
        return new NewCustomerStatement().testViaHardCode(cust);
    }

    @Override
    public long deleteCostumer(Long cust_id) throws SQLException {
        return new NewCustomerStatement().deleteCostumer(cust_id);
    }

    @Override
    public long getAddressID(NewCustomerInput cust) throws SQLException {
        return new NewCustomerStatement().getAddressID(cust);
    }
}