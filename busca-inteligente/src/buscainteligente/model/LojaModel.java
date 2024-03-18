/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscainteligente.model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ferna
 */
public class LojaModel {
    
    private int codigo;
    private String descricao;
    private String tipo;
    private String cidade;

    public LojaModel(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "LojaModel{" + "codigo=" + codigo + ", descricao=" + descricao + ", tipo=" + tipo + ", cidade=" + cidade + '}';
    }

    public void setValues (ResultSet rs) throws SQLException{
        
        setCodigo(rs.getInt("CODI"));
        setDescricao(rs.getString("DESC"));
        setTipo(rs.getString("TIPO"));
        setCidade(rs.getString("CIDA"));
    }
}
