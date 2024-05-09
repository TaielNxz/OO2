package ar.edu.unlp.info.oo2.ejercicio_16_EstacionMeteorologica;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TemperaturaTest {
	
	private HomeWeatherStation estacion;
	private HomeWeatherStationAdapter adaptador;
	
	private DatoCelsius celsius;
	private DatoFarenheit farenheits;
	private DatoPresion presion;
	private DatoPromedioCelsius promedioCelsius;
	private DatoPromedioFahrenheit promedioFahrenheit;
	private DatoRadiacion radiacion;
	private DatoTemperaturas temperaturas;

	@BeforeEach
	public void setUp() throws Exception {
		
		this.estacion = new HomeWeatherStation( 100 , 1000 , 5 );
		this.adaptador = new HomeWeatherStationAdapter(estacion);
		this.adaptador.getTemperaturas().add( 200.0 );
		this.adaptador.getTemperaturas().add( 300.0 );
		this.adaptador.getTemperaturas().add( 400.0 );
		
		System.out.println( this.adaptador.getTemperatura() );
		System.out.println( this.adaptador.getPresion() );
		System.out.println( this.adaptador.getRadiacionSolar() );
		System.out.println( this.adaptador.getTemperaturas() );
		
	}

	@Test
	public void testDisplayData() {
		
		this.celsius = new DatoCelsius(adaptador);
		this.farenheits = new DatoFarenheit(celsius);
		this.presion = new DatoPresion(farenheits);
		this.promedioCelsius = new DatoPromedioCelsius(presion);
		this.promedioFahrenheit = new DatoPromedioFahrenheit(promedioCelsius);
		this.radiacion = new DatoRadiacion(promedioFahrenheit);
		this.temperaturas = new DatoTemperaturas(radiacion);
		
		
		String expectedString = " Temperatura Celsius: 38\n"
							  + " Temperatura Farenheit: 100\n"
							  + " Presion atmosferica: 1000\n"
							  + " Promedio de temperaturas C: 149\n"
							  + " Promedio de temperaturas F: 300\n"
							  + " Radiacion solar: 5\n"
							  + " Lista de Temperaturas Farenheit: [200.0, 300.0, 400.0]\n";
		
		assertEquals( expectedString , this.temperaturas.displayData() );
	
	}


}
