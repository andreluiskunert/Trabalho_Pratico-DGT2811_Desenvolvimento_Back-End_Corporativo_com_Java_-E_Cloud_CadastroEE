/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
//package cadastroee.controler;
//
///**
// *
// * @author desenvolvedor-full-stack
// */
//public interface ProductFacadeLocal {
//    
//}
package cadastroee.controller;

import jakarta.ejb.Local;
import cadastroee.model.Product;
import java.util.List;

@Local
public interface ProductFacadeLocal {
    void create(Product product);
    void edit(Product product);
    void remove(Product product);
    Product find(Object id);
    List<Product> findAll();
    List<Product> findRange(int[] range);
    int count();
}