package ar.edu.unlp.info.oo2.ejercicio_16b_SecuenciaDeFiltros.filtros;

import java.awt.image.BufferedImage;

public abstract class AbstractFilter implements ImageFilter{
  abstract public BufferedImage filter(BufferedImage image);
}
