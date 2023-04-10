/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIModel;

import BLL.Roli;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Hp
 */
public class RoliTableModel extends AbstractTableModel{

    List<Roli> roli;
    String [] cols = {"ID","Emertimi"};
    
    public RoliTableModel(){
    }
    
    public RoliTableModel(List<Roli> roli){
        this.roli = roli;
    }
    
    public void addRoli(List<Roli> roli){
        this.roli = roli;
    }
     public String getColumnName(int col){
        return cols[col];
    }
    @Override
    public int getRowCount() {
        return roli.size();
    }
    
    public void remove(int row){
        roli.remove(row);
    }
    
    public Roli getRoli(int index){
        return roli.get(index);
    }
    

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Roli r = roli.get(rowIndex);
        switch(columnIndex){
            case 0:
                return r.getId();
            case 1:
                return r.getEmertimi();
            default:
                return null;
        }
    }
    
}


/*
public class PersoniTableModel extends AbstractTableModel{

    List <Personi> list;
    String [] cols = {"Nr." , "Emertimi" , "Data e Lindjes"};

    public PersoniTableModel(){}
    
    public PersoniTableModel(List <Personi> list){
        this.list=list;
    }
    
    public void addList(List <Personi> list){
        this.list=list;
    }
    
    public String getColumnName(int col){
        return cols[col];
    }
    
    @Override
    public int getRowCount() {
      return list.size();
    }
    public void remove(int row){
        list.remove(row);
    }
    public Personi getPersoni(int index){
        return list.get(index);
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Personi p=list.get(rowIndex);
       switch(columnIndex){
           case 0:
               return p.getId();
           case 1:
               return p.getEmertimi();
           case 2:
               return getDateToString(p.getDataLindjes());
           default:
               return null;
       }
    }
    public String getDateToString(Date d){
      DateFormat da=new SimpleDateFormat("dd-MM-yyyy");    
      return da.format(d);
    }
}

*/