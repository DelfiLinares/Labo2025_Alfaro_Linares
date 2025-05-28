package compus;

import java.util.ArrayList;

public class SitioWeb {
    ArrayList<CPU>compusVendidas=new ArrayList<>();
    ArrayList<Compra>compritas=new ArrayList<>();

    public SitioWeb(ArrayList<CPU>compusVendidas,ArrayList<Compra>compritas){
        this.compusVendidas=compusVendidas;
        this.compritas=compritas;
    }
    public SitioWeb(){
        ArrayList<CPU>cVendidas=new ArrayList<>();
        cVendidas.add(new CPU());
        this.compusVendidas=cVendidas;
        ArrayList<Compra>compras=new ArrayList<>();
        compras.add(new Compra());
        this.compritas=compras;

    }
}
