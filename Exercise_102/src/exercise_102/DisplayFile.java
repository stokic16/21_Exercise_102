

package exercise_102;

import java.io.File;

/**
 * @author Kilian Stöckler
 */
public class DisplayFile extends File{

    public DisplayFile(String pathname) {
        super(pathname);
    }

    @Override
    public String toString() {
        return super.getName();
    }
    
    

}
