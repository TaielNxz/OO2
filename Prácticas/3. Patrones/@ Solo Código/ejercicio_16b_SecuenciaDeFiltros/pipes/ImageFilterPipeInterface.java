package ar.edu.unlp.info.oo2.ejercicio_16b_SecuenciaDeFiltros.pipes;

import java.awt.image.BufferedImage;
import ar.edu.unlp.info.oo2.ejercicio_16b_SecuenciaDeFiltros.filtros.*;

public interface ImageFilterPipeInterface {
    
    public BufferedImage filter(BufferedImage image);
    public void addFilter(ImageFilter next);
    public void setNextPipe(ImageFilterPipe newPipe);
    public void addPipeFrom(ImageFilterPipe newPipe, ImageFilterPipe aPipe);
    
}
