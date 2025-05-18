package ar.edu.unlp.info.oo2.ejercicio_19_EstacionMeteorologica;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TemperaturaTest {
	
	private HomeWeatherStation estacion;
	
	private DatoCelsius celsius;
	private DatoPromedioCelsius promedioCelsius;
	private DatoMinCelsius minCelsius;
	private DatoMaxCelsius maxCelsius;
	private DatoPromedioFahrenheit promedioFahrenheit;
	private DatoMinFahrenheit minFahrenheit;
	private DatoMaxFahrenheit maxFahrenheit;
	private DatoTemperaturas temperaturas;

	@BeforeEach
	public void setUp() throws Exception {
		
		this.estacion = new HomeWeatherStation( 100 , 1000 , 5 );
		this.estacion.getTemperaturas().add( 200.0 );
		this.estacion.getTemperaturas().add( 300.0 );
		this.estacion.getTemperaturas().add( 400.0 );
		
		System.out.println( this.estacion.getTemperatura() );
		System.out.println( this.estacion.getPresion() );
		System.out.println( this.estacion.getRadiacionSolar() );
		System.out.println( this.estacion.getTemperaturas() );
		
	}

	@Test
	public void testDisplayData() {
		
		this.celsius = new DatoCelsius(estacion);
		this.promedioCelsius = new DatoPromedioCelsius(celsius);
		this.minCelsius = new DatoMinCelsius(promedioCelsius);
		this.maxCelsius = new DatoMaxCelsius(minCelsius);
		this.promedioFahrenheit = new DatoPromedioFahrenheit(maxCelsius);
		this.minFahrenheit = new DatoMinFahrenheit(promedioFahrenheit);
		this.maxFahrenheit = new DatoMaxFahrenheit(minFahrenheit);
		this.temperaturas = new DatoTemperaturas(maxFahrenheit);
		
		String expectedString = " Temperatura F: 100.0\n"
				              + " Presion atmosf: 1000.0\n"
				              + " Radiacion solar: 5.0\n"
							  + " Temperatura Celsius: 38\n"
							  + " Promedio de temperaturas: 149°C\n"
							  + " Minimo: 93.0°C\n"
							  + " Maximo: 204.0°C\n"
							  + " Promedio de temperaturas: 300°F\n"
							  + " Minimo: 200.0°F\n"
							  + " Maximo: 400.0°F\n"
							  + " Lista de Temperaturas (°F): [200.0, 300.0, 400.0]\n";
		
		assertEquals( expectedString , this.temperaturas.displayData() );
	
	}


}
