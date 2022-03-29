package demo.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HandlerWeatherData implements RequestHandler<WeatherData, WeatherData> {

    @Override
    public WeatherData handleRequest(WeatherData event, Context context) {
        LambdaLogger logger = context.getLogger();
        // process event
        logger.log("EVENT TYPE: " + event.getClass().toString() + '\n');
        logger.log("EVENT: " + event + '\n');
        return event;
    }
}
