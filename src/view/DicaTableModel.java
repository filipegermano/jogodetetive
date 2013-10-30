/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Dicas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author FILIPE
 */
public class DicaTableModel extends AbstractTableModel {

    private List<Dicas> listaDicas;

    public DicaTableModel(List<Dicas> listaDicas) {
        this.listaDicas = listaDicas;
    }

    @Override
    public int getRowCount() {
        return this.listaDicas.size();
    }

    @Override
    public String getColumnName(int column) {
        return "Dicas";
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Dicas dica = this.listaDicas.get(rowIndex);
        return dica.getDica();
    }
}
