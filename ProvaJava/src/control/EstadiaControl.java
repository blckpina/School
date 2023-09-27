/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.DAO.EstadiaDAO;
import model.Estadia;

/**
 *
 * @author aluno
 */
public class EstadiaControl {
    
    EstadiaDAO esDao = new EstadiaDAO();
    
    public void cadastrarE(int cod, String tipo, String descricao, double preco) throws SQLException, ClassNotFoundException
    {
        Estadia es = new Estadia(cod,tipo,descricao,preco);
        esDao.cadastrarEstadia(es);
    }
    
    public void excluirE(int cod) throws SQLException, ClassNotFoundException
    {
        esDao.excluirEstadia(cod);
    }
    
    public ArrayList<Estadia> buscarE() throws SQLException, ClassNotFoundException
    {
        return (esDao.buscarEstadia());
    }
    
}
