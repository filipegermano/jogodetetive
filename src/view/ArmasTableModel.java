/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Armas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author FILIPE
 */
public class ArmasTableModel extends AbstractTableModel {
    
    private List<Armas> listaArmas;
    
    public ArmasTableModel(List<Armas> listaArmas) {
        this.listaArmas = listaArmas;
    }    

    @Override
    public int getRowCount() {
        return this.listaArmas.size();
    }

    @Override
    public String getColumnName(int column) {
        return "Armas";
    }
    
    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Armas arma = this.listaArmas.get(rowIndex);
        return arma.getNome();
    }
    
}
