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
 * A point representing a location in (x,y) coordinate space, specified in
 * integer precision.
 *
 * @author Paul Z. Wu
 */
public class Point {

    /**
     * The X coordinate of this Point.
     */
    private int x;
    /**
     * The Y coordinate of this Point.
     */
    private int y;

    /**
     * Constructor.
     *
     * Constructs and initializes a point at the specified (x,y) location in the
     * coordinate space
     *
     * @param x the value of the given x-coordinate
     * @param y the value of the given y-coordinate
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor.
     *
     * Constructs and initializes a point at the specified (0,0) location in the
     * coordinate space
     */
    public Point() {
        this(0, 0);
    }

    /**
     * Shift this point's location by the given amount
     *
     * @param dx the amount shift in x
     * @param dy the amount shift in y
     */
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    /**
     * Returns the distance between this point and the origin.
     *
     * @return double
     */
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    /**
     * Returns a String object representing this point.
     *
     * @return String
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    /**
     * Returns the x-coordinate of this point
     *
     * @return int
     */
    public int getX() {
        return x;
    }

    /**
     * Returns the y-coordinate of this point
     *
     * @return int
     */
    public int getY() {
        return y;
    }

}
