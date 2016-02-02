/**
 * This file is part of WANTED: Bad-ou-Alyve.
 *
 * WANTED: Bad-ou-Alyve is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WANTED: Bad-ou-Alyve is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WANTED: Bad-ou-Alyve.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.example;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class GameEngine {

    // REST-API
    private static final String URL = "http://localhost:8080";
    private static final String URL_CONNECT = URL + "/connect/%s";

    // private Player player;

    public GameEngine() {
        
    }

    public void start() {
        // Get updates from server on 500 ms interval
        Observable.interval(500, TimeUnit.MILLISECONDS)
                  .subscribeOn(Schedulers.computation())
                  .observeOn(Schedulers.computation())
                  .doOnNext(new Action1<Long>() {
                      @Override
                      public void call(Long aLong) {
                          //getSelf(); // Uncomment this to get self from server instead of manual "simulation"
                      }
                  }).subscribe();
    }
}
