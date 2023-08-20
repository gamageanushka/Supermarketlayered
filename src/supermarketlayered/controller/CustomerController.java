/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.controller;

import supermarketlayered.dto.CustomerDto;
import supermarketlayered.service.ServiceFactory;
import supermarketlayered.service.custom.CustomerService;
import supermarketlayered.service.custom.impl.CustomerServiceImpl;

/**
 *
 * @author user
 */
public class CustomerController {
    
    private CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);
    public String saveCustomer(CustomerDto customerDto) throws Exception{
        return customerService.addCustomer(customerDto);
    }
}
