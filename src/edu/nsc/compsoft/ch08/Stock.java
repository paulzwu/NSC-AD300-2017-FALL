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
 * A Stock object represents purchases of shares of a stock.
 *
 * @author Paul Z. Wu
 */
public class Stock {

    /**
     * stock symbol, e.g. "YHOO"
     */
    private String symbol;
    /**
     * total shares purchased
     */
    private int totalShares;
    /**
     * total cost for all shares
     */
    private double totalCost;

    /**
     * Constructor.
     *
     * Initializes a new Stock with no shares purchased.Precondition: symbol !=
     * null
     *
     * @param theSymbol A string represents the stock symbol
     */
    public Stock(String theSymbol) {
        if (theSymbol == null) {
            throw new NullPointerException();
        }

        symbol = theSymbol;
        totalShares = 0;
        totalCost = 0.0;
    }

    /**
     * Returns the total profit or loss earned on this stock, based on the given
     * price per share. pre: currentPrice >= 0.0
     *
     * @param currentPrice The value of the current price.
     * @return The value of profit.
     */
    public double getProfit(double currentPrice) {
        if (currentPrice < 0.0) {
            throw new IllegalArgumentException();
        }

        double marketValue = totalShares * currentPrice;
        return marketValue - totalCost;
    }

    /**
     * Records purchase of the given shares at the given price. pre: shares >= 0
     * && pricePerShare >= 0.0
     *
     * @param shares The number of shares.
     * @param pricePerShare The price of the share.
     */
    public void purchase(int shares, double pricePerShare) {
        if (shares < 0 || pricePerShare < 0.0) {
            throw new IllegalArgumentException();
        }

        totalShares += shares;
        totalCost += shares * pricePerShare;
    }
}
