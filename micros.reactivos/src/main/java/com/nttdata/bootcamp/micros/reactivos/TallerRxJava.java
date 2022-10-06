package com.nttdata.bootcamp.micros.reactivos;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import reactor.core.publisher.Flux;

public class TallerRxJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Observable<String> messageSender = Observable.just("Mensaje 1", "Mensaje 2", "Mensaje 3");
	    
		messageSender.subscribe(new Observer<String>() {
		        @Override
		        public void onSubscribe(Disposable d) {
		            System.out.println("Observer. Subscribed.");
		        }

		        @Override
		        public void onNext(String s) {
		            System.out.println("Observer. Received: " + s);
		        }

		        @Override
		        public void onError(Throwable e) {
		            System.out.println("Observer. Error: " + e.getMessage());
		        }

		        @Override
		        public void onComplete() {
		            System.out.println("Observer. Completed");
		        }
		    });
		
		
		
		Flux<String> messageSender2 = Flux.just("Mensaje 1","Hola mundo", "Mensaje 3");
		
		messageSender2.subscribe(m -> System.out.println("Customer 1. Receivend: " + m),
				e -> System.out.println("Consumer 1. Error: " + e.getMessage()),
				() -> System.out.println("Consumer 1. Completed"));
		
		messageSender.subscribe(m -> System.out.println("Consumer 2. Received: " + m),
				e -> System.out.println("Consumer 2. Error: " + e.getMessage()),
				() -> System.out.println("Consumer 2. Completed")
				);
				
	}

}
