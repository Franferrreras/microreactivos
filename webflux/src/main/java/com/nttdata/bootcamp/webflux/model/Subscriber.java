package com.nttdata.bootcamp.webflux.model;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


public class Subscriber implements Observer<Integer> {

	@Override
	public void onSubscribe(Disposable d) {
		// TODO Auto-generated method stub
		System.out.println("Observer. Subscribed.");
	}

	@Override
	public void onNext(Integer t) {
		// TODO Auto-generated method stub
		System.out.println("Observer. Received: " + t);
	}

	@Override
	public void onError(Throwable e) {
		// TODO Auto-generated method stub
		System.out.println("Observer. Error: " + e.getMessage());
	}

	@Override
	public void onComplete() {
		// TODO Auto-generated method stub
		System.out.println("Observer. Completed");
	}


}
