/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIModel;

import BLL.Fees;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Hp
 */
public class FeesTableModel extends AbstractTableModel{

    List<Fees> fees;
    String [] cols = {"ID","Kohezgjatja ne muaj","Cmimi","PersoniID"};
    
    public FeesTableModel(){
    }
    
    public FeesTableModel(List<Fees> fees){
        this.fees = fees;
    }
    
    public void addFees(List<Fees> fees){
        this.fees = fees;
    }
    public String getColumnName(int col){
        return cols[col];
    }
    @Override
    public int getRowCount() {
        return fees.size();
    }
    
    public void remove(int row){
        fees.remove(row);
    }
    
    public Fees getfees(int index){
        return fees.get(index);
    }
     public Fees getFees(int index){
        return fees.get(index);
    }
    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Fees f = fees.get(rowIndex);
        switch(columnIndex){
            case 0:
                return f.getId();
            case 1:
                return f.getKohezgjatjanemuaj();
            case 2:
                return f.getCmimi();
            case 3:
                return f.getPersoniID();
            default:
                return null;
        }
    }
    
}


