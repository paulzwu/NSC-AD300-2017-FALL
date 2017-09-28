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
package edu.nsc.compsoft.ch10;

import java.util.ArrayList;

/**
 * Illustrate the box issue.
 *
 * @author Paul Z. Wu Sep 15, 2017
 */
public class BoxControv {

    public static void main(String args[]) {
        int n = 2;
        Integer n1 = new Integer(n);
        Integer n2 = new Integer(n);
        System.out.println("Check n1==n2 ?");
        if (n1 == n2) {
            System.out.println("Equal");
        } else {
            System.out.println("Unequal");
        }
        System.out.println("Check n1.equals(n2) ?");
        if (n1.equals(n2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Unequal");
        }

        Integer n3 = n;
        Integer n4 = n;
        System.out.println("Check n3==n4 ?");
        if (n3 == n4) {
            System.out.println("Equal");
        } else {
            System.out.println("Unequal");
        }
        System.out.println("Check generic list");
        ArrayList<Integer> list = new ArrayList();
        list.add(n);
        list.add(n);
        if (list.get(0) == list.get(1)) { // Not a safeway!!!!
            System.out.println("Equal");
        } else {
            System.out.println("Unequal");
        }

        if (list.get(0).equals(list.get(1))) { // Not a safeway!!!!
            System.out.println("Equal");
        } else {
            System.out.println("Unequal");
        }
    }

}
