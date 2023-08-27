/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package supermarketlayered.service.custom;

import java.util.ArrayList;
import supermarketlayered.dto.CustomerDto;
import supermarketlayered.service.SuperService;

/**
 *
 * @author user
 */
public interface CustomerService extends SuperService {

    public String addCustomer(CustomerDto customerDto) throws Exception;

    public String updateCustomer(CustomerDto customerDto) throws Exception;
    
    public String deleteCustomer(String id) throws Exception;
    
    public CustomerDto getCustomer(String id) throws Exception;

    public ArrayList<CustomerDto> getAllCustomer() throws Exception;

    

}
