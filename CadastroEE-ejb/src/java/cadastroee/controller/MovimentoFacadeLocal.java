/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.Movimento;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author 
 */
@Local
public interface MovimentoFacadeLocal {

    void criarMovimento(Movimento movimento);

    void atualizarMovimento(Movimento movimento);

    void excluirMovimento(int idMovimento);

    Movimento encontrarMovimentoPorId(int idMovimento);

    List<Movimento> listarTodosMovimentos();
}
