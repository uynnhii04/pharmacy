/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pharmacy.app.DAO;

import com.pharmacy.app.DTO.SuplierInvoiceDetailsDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author BOI QUAN
 */
public class SupplierInvoiceDetailsDAO implements DAOinterface<SuplierInvoiceDetailsDTO> {
    MyConnection myconnect = new MyConnection();
    @Override
    public boolean insert(SuplierInvoiceDetailsDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(SuplierInvoiceDetailsDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<SuplierInvoiceDetailsDTO> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
//    Lay thong tin cua phieu nhap
    public ArrayList<SuplierInvoiceDetailsDTO> selectInvoiceDetailByID(String t) {
        ArrayList<SuplierInvoiceDetailsDTO> supInvoiceDetails = new ArrayList<>();
        if(myconnect.openConnection()){
            String query = "SELECT mp.product_id, name, sell_price, inventory_quantity, (inventory_quantity * sell_price) AS total_price"
                    + " FROM supplier_invoice_details sid"
                    + " INNER JOIN product_batches pb ON sid.batch_id = pb.batch_id"
                    + " INNER JOIN medical_products mp ON pb.product_id = mp.product_id"
                    + " WHERE sid.supplier_invoice_id = ?";
            ResultSet rs = myconnect.prepareQuery(query, t);
            try {
                while(rs != null && rs.next()){
                    SuplierInvoiceDetailsDTO supInvoiceDetail = new SuplierInvoiceDetailsDTO();
                    supInvoiceDetail.setProductID(rs.getString("product_id"));
                    supInvoiceDetail.setName(rs.getString("name"));
                    supInvoiceDetail.setUnitPrice(rs.getDouble("sell_price"));
                    supInvoiceDetail.setQuantity(rs.getInt("inventory_quantity"));
                    supInvoiceDetail.setTotalPrice(rs.getDouble("total_price"));
                    
                    supInvoiceDetails.add(supInvoiceDetail);
                }
            } catch (SQLException e){
                e.printStackTrace();
            } finally {
                myconnect.closeConnection();
            }
        }
        return supInvoiceDetails;
    }
    @Override
    public SuplierInvoiceDetailsDTO selectByID(String t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<SuplierInvoiceDetailsDTO> search(String t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
