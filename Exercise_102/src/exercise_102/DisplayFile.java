

package exercise_102;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * @author Kilian Stöckler
 */
public class DisplayFile extends File{

    private String display;
    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
    public DisplayFile(String pathname,String display) {
        super(pathname);
        this.display=display;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(this.canWrite()){
            sb.append("R");
        }
        if(this.canRead()){
            sb.append("W");
        }
        if(this.canExecute()){
            sb.append("X");
        }
        return String.format("%-35s %s %d KB %s",display,sdf.format(super.lastModified()).toString(),
                this.length()/1024,sb.toString());
    }

    public String getDisplay() {
        return display;
    }
    
    

}
