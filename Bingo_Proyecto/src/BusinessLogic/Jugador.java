/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import BusinessLogic.Anfitrion;
import java.awt.Font;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Usuario1
 */
public class Jugador extends DefaultTableCellRenderer {
 JTable table = new JTable() {
//
   public Component prepareRenderer(TableCellRenderer renderer, int row, int col) {
        
        Component comp = super.prepareRenderer(renderer, row, col);
       // Object value = getModel().getValueAt(row, col);
        if (table.getSelectedRow() == row && table.getSelectedColumn() == col) { //Al seleccionar columna y fila.
               comp.setBackground(Color.red); //Cambia color!
               comp.setFont(new Font("Serif", Font.BOLD, 40)); //Cambia estilo y tamano de fuente.
        } else {
            comp.setBackground(Color.white); //Color default (blanco).
        }
        return comp;
    }
};
         }