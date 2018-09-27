

package exercise_102;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 * @author Kilian Stöckler
 */
public class MyListCellRenderer implements ListCellRenderer<DisplayFile>{

    @Override
    public Component getListCellRendererComponent(JList<? extends DisplayFile> list, DisplayFile value, int index, boolean isSelected, boolean cellHasFocus) {
        JLabel label = new JLabel(value.toString());
        label.setOpaque(true);
        label.setFont(new Font("Courier New",1,12));
        if(value.isDirectory()){
            label.setBackground(Color.gray);
            label.setForeground(Color.red);
        }
        if(value.isFile()){
            label.setBackground(Color.getColor("200"));
            label.setForeground(Color.blue);
        }
        return label;
    }

}
