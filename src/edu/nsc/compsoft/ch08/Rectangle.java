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
 * A Rectangle specifies an area in a coordinate space that is enclosed by the
 * Rectangle object's upper-left point (x,y) in the coordinate space, its width,
 * and its height.
 *
 * @author Paul Z. Wu Oct 5, 2017
 */
public class Rectangle {

    private int x;
    private int y;
    private int width;
    private int height;

    /**
     * Constructs a new Rectangle whose top-left corner is specified by the
     * given coordinates and with the given width and height.
     */
    public Rectangle(int x, int y, int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException();
        }
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Returns this Rectangle's height.
     *
     * @return the height of the rectangle.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Returns this Rectangle's width.
     *
     * @return the width of the rectangle.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Returns this Rectangle's x coordinate.
     *
     * @return the X coordinate.
     */
    public int getX() {
        return x;
    }

    /**
     * Returns this Rectangle's y coordinate.
     *
     * @return the Y coordinate.
     */
    public int getY() {
        return y;
    }

    /**
     * Returns a String representation of this Rectangle, such as
     * "Rectangle[x=1,y=2,width=3,height=4]".
     *
     * @return a string representation of this point.
     */
    public String toString() {
        return "Rectangle[x=" + x + ",y=" + y
                + ",width=" + width + ",height=" + height + "]";
    }
}
