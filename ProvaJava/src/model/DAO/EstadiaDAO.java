/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Estadia;

/**
 *
 * @author aluno
 */
public class EstadiaDAO {
    
    Connection con = null;
    
    public void cadastrarEstadia(Estadia es) throws SQLException, ClassNotFoundException
    {
        con = new Conexao().getConnection();
        String sql = "insert into ProvaJava (cod,tipo,descricao,preco) values (?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, es.getCod());
        stmt.setString(2, es.getTipo());
        stmt.setString(3, es.getDescricao());
        stmt.setDouble(4, es.getPreco());
        stmt.execute();
        stmt.close();
        con.close();
    }
    
    public void excluirEstadia(int cod) throws SQLException, ClassNotFoundException
    {
        con = new Conexao().getConnection();
        String sql = "delete from ProvaJava where cod = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, cod);
        stmt.execute();
        stmt.close();
    }
    
    public ArrayList<Estadia> buscarEstadia() throws SQLException, ClassNotFoundException
    {
        ResultSet rs;
        ArrayList<Estadia> listaEstadia = new ArrayList<>();
        con = new Conexao().getConnection();
        String sql = "select * from ProvaJava";
        PreparedStatement stmt = con.prepareStatement(sql);
        rs = stmt.executeQuery();
        while(rs.next())
        {
            int cod = rs.getInt("cod");
            String tipo = rs.getString("tipo");
            String descricao = rs.getString("descricao");
            double preco = rs.getDouble("preco");
            Estadia es = new Estadia(cod,tipo,descricao,preco);
            listaEstadia.add(es);
        }
        stmt.close();
        con.close();
        return listaEstadia;
    }  
}
