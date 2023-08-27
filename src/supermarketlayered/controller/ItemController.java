/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.controller;

import java.util.ArrayList;
import supermarketlayered.dto.ItemDto;
import supermarketlayered.service.ServiceFactory;
import supermarketlayered.service.custom.ItemService;

/**
 *
 * @author user
 */
public class ItemController {
    
    ItemService itemService = (ItemService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ITEM);
    
    public String addItem(ItemDto dto) throws Exception{
        return itemService.addItem(dto);
    }
    
    public String updateItem(ItemDto dto) throws Exception{
        return itemService.updateItem(dto);
    }
    
    public String deleteItem(String itemId) throws Exception{
        return itemService.deleteItem(itemId);
    }
    
    public ItemDto getItem(String itemId) throws Exception{
        return itemService.getItem(itemId);
    }
    
    public ArrayList<ItemDto> getAllItem() throws Exception{
        return itemService.getAllItem();
    }
    
}
