package subscriber;
import static java.util.concurrent.Flow.*;
import java.util.concurrent.Flow;

public class EndSubscriber<T> implements Subscriber<T> {

    private Subscription subscription;
    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(T item) {
        System.out.println(item);
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("Ein Fehler ist aufgetreten");
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("Habe fertig");
    }
}
