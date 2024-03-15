/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscainteligente.dao;

import buscainteligente.model.LojasAdjacentesModel;
import buscainteligente.connection.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author fernando.rivail
 */
public class LojasAdjacentesDao {
    
    protected String getSelectLojasAdjacentes() {
        String sql = "SELECT * FROM buscainteligente.LOJA_ADJA;";
        return sql;
    }
    
    public List<LojasAdjacentesModel> listasLojasAdjacentes() throws SQLException{
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<LojasAdjacentesModel> listaDeLojasAdjacentes = new ArrayList<>();
        
        try {
            stmt = conn.prepareStatement(getSelectLojasAdjacentes());
            rs = stmt.executeQuery();

            while (rs.next()) {
                LojasAdjacentesModel adjacentes = new LojasAdjacentesModel();

                adjacentes.setCodigoDaLojaOrigem(rs.getInt(""));
                adjacentes.setDescriçãoDaLojaOrigem(rs.getString(""));
                adjacentes.setCodigoDaLojaDestino(rs.getInt(""));
                adjacentes.setDescriçãoDaLojaDestino(rs.getString(""));
                adjacentes.setDistanciaEmMetroEntreLojas(rs.getInt(""));
                
                listaDeLojasAdjacentes.add(adjacentes);
            }
        } catch (SQLException ex) {
            throw new SQLException(null, ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt, rs);

        }
        return listaDeLojasAdjacentes;
    }
    
}
