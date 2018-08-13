package com.kumar.design.pattern.observer;

import com.kumar.design.pattern.observer.observable.NewsChannel;
import com.kumar.design.pattern.observer.observer.NewsAgency;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ObserverPatternTest {
    @Test
    public void canRunObserver(){
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        //Subscribe all Observer to Observable.
        observable.addObserver(observer);
        observable.setNews("news");

        assertEquals(observer.getNews(), "news");
    }
}
