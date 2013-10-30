package view;

import bean.Jogador;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author FILIPE
 */
public class RankingTableModel extends AbstractTableModel {

    private List<Jogador> listaRanking;

    public RankingTableModel(List<Jogador> listaRanking) {
        this.listaRanking = listaRanking;
    }

    @Override
    public int getRowCount() {
        return this.listaRanking.size();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Jogador";
            case 1:
                return "Pontos";
            default:
                return "";
        }

    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Jogador jogador = this.listaRanking.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return jogador.getNome();
            case 1:
                return jogador.getPontos();
            default:
                return "";
        }
    }
}
