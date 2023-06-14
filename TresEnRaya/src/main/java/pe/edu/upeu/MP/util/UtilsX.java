
package pe.edu.upeu.MP.util;

import java.net.URL;

public class UtilsX {

    public URL getFile(String ruta) {
        return this.getClass().getResource("/" + ruta);
    }
    
    
    
}
