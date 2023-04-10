/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIModel;

import BLL.Personi;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Hp
 */
public class PersoniTableModel extends AbstractTableModel{

    List<Personi> personi;
    String [] cols = {"ID","Emri","Mbiemri","DataERegjistrimit","TraineriID"};
    
    public PersoniTableModel(){
    }
    
    public PersoniTableModel(List<Personi> personi){
        this.personi = personi;
    }
    
    public void addPersoni(List<Personi> Personi){
        this.personi = Personi;
    }
    public String getColumnName(int col){
        return cols[col];
    }
    @Override
    public int getRowCount() {
        return personi.size();
    }
    
    public void remove(int row){
        personi.remove(row);
    }
    
    public Personi getPersoni(int index){
        return personi.get(index);
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Personi p = personi.get(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getId();
            case 1:
                return p.getEmri();
            case 2:
                return p.getMbiemri();
            case 3:
                return p.getDataERegjistrimit();
            case 4:
                return p.getTraineriID();
                
            default:
                return null;
        }
    }
    
}
