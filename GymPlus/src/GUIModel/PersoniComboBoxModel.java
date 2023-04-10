/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIModel;

import BLL.Personi;
import BLL.Traineri;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author TECHCOM
 */
public class PersoniComboBoxModel extends AbstractListModel<Personi> implements ComboBoxModel<Personi> {

     private List<Personi> data;
    private Personi selectedItem;
    
    public PersoniComboBoxModel(){
        
    }
    public PersoniComboBoxModel(List<Personi> data){
        this.data=data;
    }
    
     public void add(List<Personi> data) {
        this.data = data;
    }
    @Override
    public int getSize() {
         return data.size();
    }

    

    @Override
    public void setSelectedItem(Object anItem) {
       selectedItem = (Personi)anItem;
    }

    @Override
    public Object getSelectedItem() {
       return selectedItem;
    }

    @Override
    public Personi getElementAt(int index) {
       return data.get(index);
    }
    
    
}

