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
public class LojasAdjacentesModel {
    
    private int codigoDaLojaOrigem;
    private String DescricaoDaLojaOrigem;
    private int codigoDaLojaDestino;
    private String DescricaoDaLojaDestino;
    private int distanciaEmMetroEntreLojas;

    public LojasAdjacentesModel() {
        
    }

    public int getCodigoDaLojaOrigem() {
        return codigoDaLojaOrigem;
    }

    public void setCodigoDaLojaOrigem(int codigoDaLojaOrigem) {
        this.codigoDaLojaOrigem = codigoDaLojaOrigem;
    }

    public String getDescriçãoDaLojaOrigem() {
        return DescricaoDaLojaOrigem;
    }

    public void setDescriçãoDaLojaOrigem(String DescriçãoDaLojaOrigem) {
        this.DescricaoDaLojaOrigem = DescriçãoDaLojaOrigem;
    }

    public int getCodigoDaLojaDestino() {
        return codigoDaLojaDestino;
    }

    public void setCodigoDaLojaDestino(int codigoDaLojaDestino) {
        this.codigoDaLojaDestino = codigoDaLojaDestino;
    }

    public String getDescriçãoDaLojaDestino() {
        return DescricaoDaLojaDestino;
    }

    public void setDescriçãoDaLojaDestino(String DescriçãoDaLojaDestino) {
        this.DescricaoDaLojaDestino = DescriçãoDaLojaDestino;
    }

    public int getDistanciaEmMetroEntreLojas() {
        return distanciaEmMetroEntreLojas;
    }

    public void setDistanciaEmMetroEntreLojas(int distanciaEmMetroEntreLojas) {
        this.distanciaEmMetroEntreLojas = distanciaEmMetroEntreLojas;
    }

    @Override
    public String toString() {
        return "LojasAdjacentesModel{" + "codigoDaLojaOrigem=" + codigoDaLojaOrigem + ", DescricaoDaLojaOrigem=" + DescricaoDaLojaOrigem + ", codigoDaLojaDestino=" + codigoDaLojaDestino + ", DescricaoDaLojaDestino=" + DescricaoDaLojaDestino + ", distanciaEmMetroEntreLojas=" + distanciaEmMetroEntreLojas + '}';
    }
}
