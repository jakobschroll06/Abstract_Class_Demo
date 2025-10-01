package io.github.jakobschroll06;

public class OhNo extends Exception {
    public OhNo(String message) {
        // add code that sens notifications to the cloudwatch
        //splunk
        //datadog
        System.out.println("I just reported the issue to Datadog");


        super(message);
    }
}
