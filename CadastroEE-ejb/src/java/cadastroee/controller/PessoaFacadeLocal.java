/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.Pessoa;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author 
 */
@Local
public interface PessoaFacadeLocal {

    void criar(Pessoa pessoa);

    void atualizar(Pessoa pessoa);

    void remover(Pessoa pessoa);

    Pessoa encontrar(Object id);

    List<Pessoa> encontrarTodos();

    List<Pessoa> encontrarRange(int[] range);

    int contar();
}
