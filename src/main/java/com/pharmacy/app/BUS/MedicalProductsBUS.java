/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pharmacy.app.BUS;

import com.pharmacy.app.DAO.MedicalProductsDAO;
import com.pharmacy.app.DTO.MedicalProductsDTO;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class MedicalProductsBUS {
    private MedicalProductsDAO product = new MedicalProductsDAO();
    
    public ArrayList<MedicalProductsDTO> getAllProducts (){
        try{
            return product.selectAll();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public String getMedicineNameByID(String medicineID) {
        try {
            return product.getProductbyID(medicineID).getName();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    
}
    public MedicalProductsDTO getProductByID(String productID) {
        for (MedicalProductsDTO product : getAllProducts()) {
            if (product.getMedicineID().equals(productID)) {
                return product;
            }
        }
        return product.getProductbyID(productID);
    }
}
