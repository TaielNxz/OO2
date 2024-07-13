package proxy;

//Clase Proxy que controla el acceso a RealImage
public class Proxy implements Subject {
		
	 private RealSubject realImage;
	 private String filename;
	
	 public Proxy(String filename) {
	     this.filename = filename;
	 }
	
	 @Override
	 public void display() {
	     if (realImage == null) {
	         realImage = new RealSubject(filename);
	     }
	     realImage.display();
	 }
	 
}
