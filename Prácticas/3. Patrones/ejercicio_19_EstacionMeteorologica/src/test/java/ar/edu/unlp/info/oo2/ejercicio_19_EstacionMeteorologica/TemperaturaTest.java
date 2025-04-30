package ar.edu.unlp.info.oo2.ejercicio_19_EstacionMeteorologica;

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
	private DatoMinCelsius minCelsius;
	private DatoMaxCelsius maxCelsius;
	private DatoPromedioFahrenheit promedioFahrenheit;
	private DatoMinFahrenheit minFahrenheit;
	private DatoMaxFahrenheit maxFahrenheit;
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
		this.minCelsius = new DatoMinCelsius(promedioCelsius);
		this.maxCelsius = new DatoMaxCelsius(minCelsius);
		this.promedioFahrenheit = new DatoPromedioFahrenheit(maxCelsius);
		this.minFahrenheit = new DatoMinFahrenheit(promedioFahrenheit);
		this.maxFahrenheit = new DatoMaxFahrenheit(minFahrenheit);
		this.radiacion = new DatoRadiacion(maxFahrenheit);
		this.temperaturas = new DatoTemperaturas(radiacion);
		
		
		String expectedString = " Temperatura Celsius: 38\n"
							  + " Temperatura Farenheit: 100\n"
							  + " Presion atmosferica: 1000\n"
							  + " Promedio de temperaturas: 149°C\n"
							  + " Minimo: 93.0°C\n"
							  + " Maximo: 204.0°C\n"
							  + " Promedio de temperaturas: 300°F\n"
							  + " Minimo: 200.0°F\n"
							  + " Maximo: 400.0°F\n"
							  + " Radiacion solar: 5\n"
							  + " Lista de Temperaturas (°F): [200.0, 300.0, 400.0]\n";
		
		assertEquals( expectedString , this.temperaturas.displayData() );
	
	}


}
