/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIModel;

import BLL.Equipments;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Hp
 */
public class EquipmentsTableModel extends AbstractTableModel{

    List<Equipments> equipments;
    String [] cols = {"ID","Paisjet","ClassesID"};
    
    public EquipmentsTableModel(){
    }
    
    public EquipmentsTableModel(List<Equipments> equipments){
        this.equipments = equipments;
    }
    
    public void addEquipments(List<Equipments> equipments){
        this.equipments = equipments;
    }
    public String getColumnName(int col){
        return cols[col];
    }
    @Override
    public int getRowCount() {
        return equipments.size();
    }
    
    public void remove(int row){
        equipments.remove(row);
    }
    
    public Equipments getEquipments(int index){
        return equipments.get(index);
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Equipments e = equipments.get(rowIndex);
        switch(columnIndex){
            case 0:
                return e.getId();
            case 1:
                return e.getPaisjet();
            case 2:
                return e.getClassesID();
            default:
                return null;
        }
    }
    
}
