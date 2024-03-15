/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busca.inteligente.model;

/**
 *
 * @author ferna
 */
public class LojasAdjacentesModel {
    
    private int codigoDaLojaOrigem;
    private String DescriçãoDaLojaOrigem;
    private int codigoDaLojaDestino;
    private String DescriçãoDaLojaDestino;
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
        return DescriçãoDaLojaOrigem;
    }

    public void setDescriçãoDaLojaOrigem(String DescriçãoDaLojaOrigem) {
        this.DescriçãoDaLojaOrigem = DescriçãoDaLojaOrigem;
    }

    public int getCodigoDaLojaDestino() {
        return codigoDaLojaDestino;
    }

    public void setCodigoDaLojaDestino(int codigoDaLojaDestino) {
        this.codigoDaLojaDestino = codigoDaLojaDestino;
    }

    public String getDescriçãoDaLojaDestino() {
        return DescriçãoDaLojaDestino;
    }

    public void setDescriçãoDaLojaDestino(String DescriçãoDaLojaDestino) {
        this.DescriçãoDaLojaDestino = DescriçãoDaLojaDestino;
    }

    public int getDistanciaEmMetroEntreLojas() {
        return distanciaEmMetroEntreLojas;
    }

    public void setDistanciaEmMetroEntreLojas(int distanciaEmMetroEntreLojas) {
        this.distanciaEmMetroEntreLojas = distanciaEmMetroEntreLojas;
    }

    @Override
    public String toString() {
        return "LojasAdjacentesModel{" + "codigoDaLojaOrigem=" + codigoDaLojaOrigem + ", Descri\u00e7\u00e3oDaLojaOrigem=" + DescriçãoDaLojaOrigem + ", codigoDaLojaDestino=" + codigoDaLojaDestino + ", Descri\u00e7\u00e3oDaLojaDestino=" + DescriçãoDaLojaDestino + ", distanciaEmMetroEntreLojas=" + distanciaEmMetroEntreLojas + '}';
    }

    
}
