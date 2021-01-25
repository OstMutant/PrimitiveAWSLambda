package org.ost.investigate.aws.lambda.examples.hello;

import java.util.Map;

public class PrimitiveLambdaMethodHandler {

    public static void main(String... args) {
        new PrimitiveLambdaMethodHandler().handleRequest("Hi");
    }

    public Map<Object, Object> handleRequest(Object input) {
        System.out.println("System.getenv - " + System.getenv());
        System.out.println("input - " + input.toString());
        Map<Object, Object> output =
                Map.of(
                        "isBase64Encoded", "false",
                        "statusCode", "200",
                        "headers", Map.of("Content-Type", "*/*"),
                        "body", "{\"greeting\":\"Hello World\","
                                + " \"input\": \"" + input.toString() + "\","
                                + " \"env\": \"" + System.getenv().toString() + "\""
                                + "}"
                );
        System.out.println("output - " + output);
        return output;
    }

}
