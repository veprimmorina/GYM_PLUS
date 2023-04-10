/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIModel;

import BLL.Traineri;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author TECHCOM
 */
public class TraineriComboBoxModel extends AbstractListModel<Traineri> implements ComboBoxModel<Traineri> {

     private List<Traineri> data;
    private Traineri selectedItem;
    
    public TraineriComboBoxModel(){
        
    }
    public TraineriComboBoxModel(List<Traineri>data){
        this.data=data;
    }
     public void add(List<Traineri> data) {
        this.data = data;
    }
    @Override
    public int getSize() {
       return data.size();
    }

    @Override
    public Traineri getElementAt(int index) {
     return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
       selectedItem = (Traineri)anItem;
    }

    @Override
    public Object getSelectedItem() {
         return selectedItem;
    }
    
    
}
