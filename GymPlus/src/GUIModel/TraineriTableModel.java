/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIModel;

import BLL.Traineri;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Hp
 */
public class TraineriTableModel extends AbstractTableModel{

    List<Traineri> traineri;
    String [] cols = {"ID","Emri","Mbiemri"};
    
    public TraineriTableModel(){
    }
    
    public TraineriTableModel(List<Traineri> traineri){
        this.traineri = traineri;
    }
    
    public void addTraineri(List<Traineri> traineri){
        this.traineri = traineri;
    }
    public String getColumnName(int col){
        return cols[col];
    }
    @Override
    public int getRowCount() {
        return traineri.size();
    }
    
    public void remove(int row){
        traineri.remove(row);
    }
    
    public Traineri getTraineri(int index){
        return traineri.get(index);
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Traineri t = traineri.get(rowIndex);
        switch(columnIndex){
            case 0:
                return t.getId();
            case 1:
                return t.getEmri();
            case 2:
                return t.getMbiemri();
            default:
                return null;
        }
    }
    
}
