package com.latidudue99.utils;

import com.latidudue99.model.Publication;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculator {

    public static Map<Totals, Double>  getTotals(List<Publication> publications){
        Map<Totals, Double> totals = new HashMap<>();
        Double sale = getTotalSalesValue(publications);
        Double cost = getTotalCostValue(publications);
        totals.put(Totals.VALUE_SOLD, sale);
        totals.put(Totals.VALUE_COST, cost);
        totals.put(Totals.GROSS_PROFIT, calculateProfit(sale,  cost));
        totals.put(Totals.MARGIN, calculateMargin(sale,  cost));
        return totals;
    }

    private static Double getTotalSalesValue(List<Publication> publications){
        Double total = publications.stream()
                .map(p -> p.getPrice())
                .reduce(0.0, Double::sum);
        return total;
    }

    private static Double getTotalCostValue(List<Publication> publications){
        Double total = publications.stream()
                .map(p -> p.getCost())
                .reduce(0.0, Double::sum);
        return total;
    }

    private static Double calculateProfit(Double sale, Double cost){
        return sale - cost;
    }

    private static Double calculateMargin(Double sale, Double cost){
        return ((sale - cost) / sale) * 100;
    }
}
