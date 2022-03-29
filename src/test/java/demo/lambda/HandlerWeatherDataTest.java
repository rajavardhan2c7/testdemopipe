package demo.lambda;

import com.amazonaws.services.lambda.runtime.Context;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class HandlerWeatherDataTest {

    @Test
    void handleRequest() {
        WeatherData event = new WeatherData();
        TestLogger logger = new TestLogger();
        Context context = new TestContext(logger);
        HandlerWeatherData handler = new HandlerWeatherData();

        WeatherData result = handler.handleRequest(event, context);

        assertNull(result.getWindKmh());

        assertEquals("EVENT TYPE: class demo.lambda.WeatherData\n",
                logger.getMessages().get(0));
        assertEquals("EVENT: WeatherData{temperatureK=null, windKmh=null, humidityPct=null, pressureHPa=null}\n",
                logger.getMessages().get(1));
    }
}
