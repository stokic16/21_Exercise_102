

package exercise_102;

import java.awt.Color;
import java.awt.Component;
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
        if(value.isDirectory()){
            label.setBackground(Color.darkGray);
            label.setForeground(Color.red);
        }
        if(value.isFile()){
            label.setBackground(Color.lightGray);
            label.setForeground(Color.blue);
        }
        return label;
    }

}
