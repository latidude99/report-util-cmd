package com.latidudue99.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Publication {

    private Long id;
    private String title;
    private String author;
    private String publisher;
    private String category1;
    private String category2;
    private String category3;
    private String department;
    private boolean web;
    private String isbn;
    private double price;
    private double specialPrice;
    private double cost;
    private boolean vat;
    private int quantitySoldDateRange;
    private int quantityInHand;
    private int quantityOrdered;
    private double salesValueDateRange;
    private String report;  // IP, OP etc.
    private boolean coreStock;
    private Map<String, Integer> weeks; // 0=to date, 1=week-1, 2=week-2  etc.
    private Map<String, Integer> months; // 0=to date, 1=month-1, 2=month-2 etc.
    private Map<String, Integer> years; // 0=to date, 1=year-1, 2=year-2 etc.
    private LocalDate lastDelivered;
    private int quantityLastDelivered;

    public Publication(){
        this.weeks =  new TreeMap<>();
        this.months = new TreeMap<>();
        this.years = new TreeMap<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCategory1() {
        return category1;
    }

    public void setCategory1(String category1) {
        this.category1 = category1;
    }

    public String getCategory2() {
        return category2;
    }

    public void setCategory2(String category2) {
        this.category2 = category2;
    }

    public String getCategory3() {
        return category3;
    }

    public void setCategory3(String category3) {
        this.category3 = category3;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isWeb() {
        return web;
    }

    public void setWeb(boolean web) {
        this.web = web;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(double specialPrice) {
        this.specialPrice = specialPrice;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isVat() {
        return vat;
    }

    public void setVat(boolean vat) {
        this.vat = vat;
    }

    public int getQuantitySoldDateRange() {
        return quantitySoldDateRange;
    }

    public void setQuantitySoldDateRange(int quantitySoldDateRange) {
        this.quantitySoldDateRange = quantitySoldDateRange;
    }

    public int getQuantityInHand() {
        return quantityInHand;
    }

    public void setQuantityInHand(int quantityInHand) {
        this.quantityInHand = quantityInHand;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public double getSalesValueDateRange() {
        return salesValueDateRange;
    }

    public void setSalesValueDateRange(double salesValueDateRange) {
        this.salesValueDateRange = salesValueDateRange;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public boolean isCoreStock() {
        return coreStock;
    }

    public void setCoreStock(boolean coreStock) {
        this.coreStock = coreStock;
    }

    public Map<String, Integer> getWeeks() {
        return weeks;
    }

    public void setWeeks(Map<String, Integer> weeks) {
        this.weeks = weeks;
    }

    public Map<String, Integer> getMonths() {
        return months;
    }

    public void setMonths(Map<String, Integer> months) {
        this.months = months;
    }

    public Map<String, Integer> getYears() {
        return years;
    }

    public void setYears(Map<String, Integer> years) {
        this.years = years;
    }

    public LocalDate getLastDelivered() {
        return lastDelivered;
    }

    public void setLastDelivered(LocalDate lastDelivered) {
        this.lastDelivered = lastDelivered;
    }

    public int getQuantityLastDelivered() {
        return quantityLastDelivered;
    }

    public void setQuantityLastDelivered(int quantityLastDelivered) {
        this.quantityLastDelivered = quantityLastDelivered;
    }

    @Override
    public String toString() {
        return "Publication{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", quantitySoldToday=" + quantitySoldDateRange +
                ", quantityInHand=" + quantityInHand +
                '}';
    }
}
