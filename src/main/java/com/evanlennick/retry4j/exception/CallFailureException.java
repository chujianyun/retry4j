package com.evanlennick.retry4j.exception;

import com.evanlennick.retry4j.CallResults;

import java.util.concurrent.ExecutionException;

/**
 * This exception represents a call execution that never succeeded after exhausting all retries.
 */
public class CallFailureException extends ExecutionException {

    private CallResults results;

    public CallFailureException(CallResults results) {
        super();
        this.results = results;
    }

    public CallFailureException(String message, CallResults results) {
        super(message);
        this.results = results;
    }

    public CallResults getCallResults() {
        return results;
    }
}
