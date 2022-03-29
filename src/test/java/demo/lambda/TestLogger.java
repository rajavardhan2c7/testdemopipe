package demo.lambda;

import com.amazonaws.services.lambda.runtime.LambdaLogger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestLogger implements LambdaLogger {

    private List<String> messages = new ArrayList<>();

    public void log(String message) {
        messages.add(message);
    }

    public void log(byte[] message) {
        messages.add(new String(message));
    }

    public List<String> getMessages() {
        return Collections.unmodifiableList(messages);
    }
}
