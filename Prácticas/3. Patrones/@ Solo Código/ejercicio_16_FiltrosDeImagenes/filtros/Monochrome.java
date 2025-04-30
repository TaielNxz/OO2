package ar.edu.unlp.info.oo2.ejercicio_16_FiltrosDeImagenes.imageFilters;

import java.awt.image.BufferedImage;

public class Monochrome extends Filter {
    
    public BufferedImage filter(BufferedImage image) {
        // Recorrer todos los píxeles de la imagen
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
            	
                // Obtener el valor ARGB del píxel
                int pixel = image.getRGB(x, y);
                
                // Extraer los componentes de color
                int alpha = (pixel >> 24) & 0xff;
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = pixel & 0xff;
                
                // Calcular el promedio (escala de grises)
                int avg = (red + green + blue) / 3;
                
                // Reconstruir el píxel con el valor de gris
                pixel = (alpha << 24) | (avg << 16) | (avg << 8) | avg;
                
                // Establecer el nuevo valor del píxel
                image.setRGB(x, y, pixel);
            }
        }
        
        return image;
    }
}