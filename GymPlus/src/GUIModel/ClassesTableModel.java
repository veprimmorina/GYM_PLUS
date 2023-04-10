/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIModel;

import BLL.Classes;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Hp
 */
public class ClassesTableModel extends AbstractTableModel{
    List<Classes> classes;
    String[] cols = {"ID","Fillon","Mbaron","TraineriID"};
    
    public ClassesTableModel(){
    }
    
    public ClassesTableModel(List<Classes> classes){
        this.classes = classes;
    }
    
    public void addClasses(List<Classes> classes){
        this.classes = classes;
    }
    
    public String getColumnName(int col){
        return cols[col];
    }
    
    @Override
    public int getRowCount() {
        return classes.size();
    }

    public void remove(int row){
        classes.remove(row);
    }
    
    public Classes getClasses(int index){
        return classes.get(index);
    }

    
    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Classes c = classes.get(rowIndex);
        switch(columnIndex){
            case 0:
                return c.getId();
            case 1:
                return c.getFillon();
            case 2:
                return c.getMbaron();
            case 3:
                return c.getTraineriID();
            default:
                return null;
        }
    }
    
}
