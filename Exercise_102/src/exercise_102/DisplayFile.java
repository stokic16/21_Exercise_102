

package exercise_102;

import java.io.File;

/**
 * @author Kilian Stöckler
 */
public class DisplayFile extends File{

    private String display;
    public DisplayFile(String pathname,String display) {
        super(pathname);
        this.display=display;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d ",display,super.lastModified(),
                super.getTotalSpace());
    }
    
    

}
