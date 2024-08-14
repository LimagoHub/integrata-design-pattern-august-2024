package main;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.util.function.Function;

public class MyProcessor extends SubmissionPublisher<Integer> implements Flow.Processor<String,Integer>{

    private Flow.Subscription subscription;
    private final Function<String, Integer> function;


    public MyProcessor(final Function<String,Integer> function) {
        this.function = function;
    }
    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        this.subscription.request(1);
    }

    @Override
    public void onNext(String item) {
        try {
            submit(function.apply(item));
        } catch (Exception e) {
            System.out.println("Kann nicht konvertieren");
        } finally {
            subscription.request(1);
        }
    }

    @Override
    public void onError(Throwable throwable) {
        this.closeExceptionally(throwable);
    }

    @Override
    public void onComplete() {
        close();
    }
}
