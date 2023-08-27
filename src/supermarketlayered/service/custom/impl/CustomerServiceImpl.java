/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.service.custom.impl;

import java.util.ArrayList;
import supermarketlayered.dao.DaoFactory;
import supermarketlayered.dao.custom.CustomerDao;
import supermarketlayered.dto.CustomerDto;
import supermarketlayered.entity.CustomerEntity;
import supermarketlayered.service.custom.CustomerService;

/**
 *
 * @author user
 */
public class CustomerServiceImpl implements CustomerService{
    
    CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);
    
    public String addCustomer(CustomerDto dto) throws Exception {
        CustomerEntity entity = new CustomerEntity(dto.getId(),
                dto.getTitle(), dto.getName(), dto.getDob(),
                dto.getSalary(), dto.getAddress(), dto.getCity(),
                dto.getProvince(), dto.getZip());
        
        if(customerDao.add(entity)){
            return "Succssfuly Added";
        }else{
            return "Fail";
        }
    }

    @Override
    public String updateCustomer(CustomerDto dto) throws Exception {
        CustomerEntity entity = new CustomerEntity(dto.getId(),
                dto.getTitle(), dto.getName(), dto.getDob(),
                dto.getSalary(), dto.getAddress(), dto.getCity(),
                dto.getProvince(), dto.getZip());
        
        if(customerDao.update(entity)){
            return "Succssfuly Updated";
        }else{
            return "Fail";
        }
    }

    @Override
    public String deleteCustomer(String id) throws Exception {
        if(customerDao.delete(id)){
            return "Succssfuly Deleted";
        }else{
            return "Fail";
        }
    }

    @Override
    public CustomerDto getCustomer(String id) throws Exception {
        CustomerEntity entity = customerDao.get(id);
        
        return new CustomerDto(entity.getId(),
                entity.getTitle(), entity.getName(), entity.getDob(),
                entity.getSalary(), entity.getAddress(), entity.getCity(),
                entity.getProvince(), entity.getZip());
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        ArrayList<CustomerEntity> customerEntities = customerDao.getAll();
        
        for (CustomerEntity entity : customerEntities) {
            CustomerDto dto = new CustomerDto(entity.getId(),
                entity.getTitle(), entity.getName(), entity.getDob(),
                entity.getSalary(), entity.getAddress(), entity.getCity(),
                entity.getProvince(), entity.getZip());
            customerDtos.add(dto); 
        }
        
        return customerDtos;
        
    }
    
}
