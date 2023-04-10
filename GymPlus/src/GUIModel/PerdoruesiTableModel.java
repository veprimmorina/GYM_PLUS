/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIModel;

import BLL.Perdoruesi;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Hp
 */
public class PerdoruesiTableModel extends AbstractTableModel{

    List<Perdoruesi> perdoruesi;
    String [] cols = {"ID","Username","Password","RoliID"};
    
    public PerdoruesiTableModel(){
    }
    
    public PerdoruesiTableModel(List<Perdoruesi> perdoruesi){
        this.perdoruesi = perdoruesi;
    }
    
    public void addPerdoruesi(List<Perdoruesi> perdoruesi){
        this.perdoruesi = perdoruesi;
    }
    public String getColumnName(int col){
        return cols[col];
    }
    @Override
    public int getRowCount() {
        return perdoruesi.size();
    }
    
    public void remove(int row){
        perdoruesi.remove(row);
    }
    
    public Perdoruesi getPerdoruesi(int index){
        return perdoruesi.get(index);
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Perdoruesi p = perdoruesi.get(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getId();
            case 1:
                return p.getUsername();
           
            case 3:
                return p.getRoliID();
            
            default:
                return null;
        }
    }
    
}
