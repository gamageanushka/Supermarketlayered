/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarketlayered.dao;

import supermarketlayered.dao.custom.impl.CustomerDaoImpl;
import supermarketlayered.dao.custom.impl.ItemDaoImpl;

/**
 *
 * @author user
 */
public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory() {

    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }

        return daoFactory;
    }

    public SuperDao getDao(DaoTypes type) {
        switch (type) {
            case CUSTOMER:
                return new CustomerDaoImpl();
            case ITEM:
                return new ItemDaoImpl();
            default:
                return null;
        }
    }

    public enum DaoTypes {
        CUSTOMER, ITEM
    }

}