package com.expense;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExpensePage {
    private Date date;
    private int money;
    private String desc;

    public ExpensePage() {
        super();
    }

    public ExpensePage(Date date, int money, String desc) {
        super();
        this.date = date;
        this.money = money;
        this.desc = desc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    @Override
    public String toString() {
        return "ExpensePage [date=" + date + ", money=" + money + ", desc=" + desc + "]";
    }
    
    
    public void setDateFromString(String dateString) {
        if (dateString == null || dateString.isEmpty()) {
            // Handle empty or null date string
            return;
        }

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parsedDate = format.parse(dateString);
            this.date = new java.sql.Date(parsedDate.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
            // Handle the parse exception as needed
        }
    }
    public void setDate(java.sql.Date date) {
        this.date = date;
    }

}
