package main;

import subscriber.EndSubscriber;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception{

        ExecutorService myService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        List<String> liste = List.of("1","2","drei","4","fuenf","1","2","drei","4","fuenf");

        EndSubscriber<Integer> subscriber = new EndSubscriber<>();
        MyProcessor processor = new MyProcessor(v->Integer.valueOf(v));
        processor.subscribe(subscriber);


        SubmissionPublisher<String> publisher = new SubmissionPublisher<>(myService, 1000);
        publisher.subscribe(processor);

        liste.forEach(publisher::submit);

        ExecutorService service = (ExecutorService) publisher.getExecutor();
        service.shutdown();
        service.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
        System.out.println("Fertig");
    }
}