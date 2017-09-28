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
 * A driver on using Point class
 *
 * @author Paul Z. Wu
 */
public class PointDriver {

    public static void main(String args[]) {
        //Create 2 Point objects
        Point p1 = new Point(3, 4);
        Point p2 = new Point(10, 13);
        //Print each point and its distance from the origin
        System.out.println("p1 is " + p1);
        System.out.println("distance from the origin = " + p1.distanceFromOrigin());
        System.out.println("p2 is " + p2);
        System.out.println("distance from the origin = " + p2.distanceFromOrigin());

        //Tanslate each point to a new location
        p1.translate(5, 7);
        p2.translate(10, 40);
        //Print each point and its distance from the origin again
        System.out.println("p1 is " + p1);
        System.out.println("distance from the origin =" + p1.distanceFromOrigin());
        System.out.println("p2 is " + p2);
    }
}
