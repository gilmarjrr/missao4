/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package cadastroee.controller;

import java.util.List;
import jakarta.ejb.Local;
import cadastroee.model.Produto;

/**
 *
 * @author 
 */
@Local
public interface ProdutoFacadeLocal {

    void create(Produto produto);

    void edit(Produto produto);

    void remove(Produto produto);

    Produto find(Object idProduto);

    List<Produto> findAll();

    List<Produto> findRange(int[] range);

    int count();
}
