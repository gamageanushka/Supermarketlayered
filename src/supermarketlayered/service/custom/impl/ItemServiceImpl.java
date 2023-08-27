/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.service.custom.impl;

import java.util.ArrayList;
import supermarketlayered.dao.DaoFactory;
import supermarketlayered.dao.custom.ItemDao;
import supermarketlayered.dto.CustomerDto;
import supermarketlayered.dto.ItemDto;
import supermarketlayered.entity.ItemEntity;
import supermarketlayered.service.custom.ItemService;

/**
 *
 * @author user
 */
public class ItemServiceImpl implements ItemService{
    ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);

    @Override
    public String addItem(ItemDto dto) throws Exception {
        Boolean resp = itemDao.add(new ItemEntity(dto.getId(), dto.getDescription(), dto.getPackSize(), dto.getUnitPrice(), dto.getQty()));
        return resp ? "Success" : "Fail";
    }

    @Override
    public String updateItem(ItemDto dto) throws Exception {
        Boolean resp = itemDao.update(new ItemEntity(dto.getId(), dto.getDescription(), dto.getPackSize(), dto.getUnitPrice(), dto.getQty()));
        return resp ? "Success" : "Fail";
    }

    @Override
    public String deleteItem(String id) throws Exception {
        Boolean resp = itemDao.delete(id);
        return resp ? "Success" : "Fail";
    }

    @Override
    public ItemDto getItem(String id) throws Exception {
        ItemEntity entity = itemDao.get(id);
        return new ItemDto(entity.getId(),
                entity.getDescription(), entity.getPackSize(),
                entity.getUnitPrice(), entity.getQty());
    }

    @Override
    public ArrayList<ItemDto> getAllItem() throws Exception {
        ArrayList<ItemDto> dtos = new ArrayList<>();
        ArrayList<ItemEntity> itemEntitys = itemDao.getAll();
        
        itemEntitys.forEach(e-> {
            dtos.add(new ItemDto(e.getId(), e.getDescription(), e.getPackSize(), e.getUnitPrice(), e.getQty()));
        });
        
        return dtos;
    }

    
}
