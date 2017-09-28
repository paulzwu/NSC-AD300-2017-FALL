/*
 * Copyright 2017 Paul Z. Wu
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.nsc.compsoft.ch08;

/**
 * A class represents a time span of elapsed hours and minutes
 *
 * @author Paul Z. Wu
 */
public class TimeSpan {

    /**
     * the integer represents the hours.
     */
    private int hours;
    /**
     * the integer represents the minutes.
     */
    private int minutes;

    /**
     * Constructor.
     *
     * Constructs and initializes a TimeSpan object with given hours and
     * minutes.
     *
     * @param hours integer represents given hours.
     * @param minutes integer represents give minutes.
     */
    public TimeSpan(int hours, int minutes) {
        if (hours < 0 || minutes < 0) {
            throw new IllegalArgumentException();
        }
        this.hours = hours + minutes / 60;
        this.minutes = minutes % 60;
    }

    public void add(int hours, int minutes) {
        int h = this.hours + hours;
        int m = this.minutes + minutes;
        //Calculate the timespan in minutes
        int tempTime = h * 60 + m;
        //The span cannot be negative
        if (tempTime < 0) {
            throw new IllegalArgumentException();
        }
        this.hours = tempTime / 60;
        this.minutes = tempTime % 60;
    }

    @Override
    /**
     * Returns a String for this time span such as "5h 16m".
     */
    public String toString() {
        return hours + "h " + minutes + " m";
    }
}
