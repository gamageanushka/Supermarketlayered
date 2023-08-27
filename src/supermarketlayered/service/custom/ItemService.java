/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package supermarketlayered.service.custom;

import java.util.ArrayList;
import supermarketlayered.dto.CustomerDto;
import supermarketlayered.dto.ItemDto;
import supermarketlayered.service.SuperService;

/**
 *
 * @author user
 */
public interface ItemService extends SuperService{
    public String addItem(ItemDto itemDto) throws Exception;

    public String updateItem(ItemDto itemDto) throws Exception;
    
    public String deleteItem(String id) throws Exception;
    
    public ItemDto getItem(String id) throws Exception;

    public ArrayList<ItemDto> getAllItem() throws Exception;
    
}
