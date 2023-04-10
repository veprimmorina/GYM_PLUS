/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIModel;

import BLL.Classes;
import BLL.Traineri;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author TECHCOM
 */
public class ClassesComboBoxModel extends AbstractListModel<Classes> implements ComboBoxModel<Classes> {

     private List<Classes> data;
     private Classes selectedItem;
    
     public ClassesComboBoxModel(){
         
     }
     public ClassesComboBoxModel(List<Classes> data){
         this.data=data;
     }
     public void add(List<Classes> data) {
        this.data = data;
    }
    @Override
    public int getSize() {
      return data.size();
    }

    

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem= (Classes)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }

    @Override
    public Classes getElementAt(int index) {
        return data.get(index);
    }
    
    
}
