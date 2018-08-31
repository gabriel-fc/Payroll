package mainPackage.controller;

import java.util.Calendar;

public class DateManagement {

    public Calendar getLastDayOfMonth(){
        Calendar date = this.getCurrentDate();
        date.set(date.get(Calendar.YEAR), date.get(Calendar.MONTH) + 1,  1);
        date.add(Calendar.DAY_OF_MONTH, -1);
        return date;
    }

    public Calendar getFirstDayOfMonth(){
        Calendar date = this.getCurrentDate();
        date.set(date.get(Calendar.YEAR), date.get(Calendar.MONTH), 1);
        return date;

    }


    public Calendar getCurrentDate(){
        Calendar newDate = Calendar.getInstance();

        //hour of day is 24h format
        newDate.set(Calendar.HOUR_OF_DAY, 23);
        newDate.set(Calendar.MINUTE, 23);
        newDate.set(Calendar.SECOND, 23);
        newDate.set(Calendar.MILLISECOND, 23);

        return newDate;

    }

    //gets month's last day and returns last workday
    public Calendar getLastWorkDay(Calendar date){
        if (date.get(Calendar.DAY_OF_WEEK) !=7 && date.get(Calendar.DAY_OF_WEEK) !=1 ){
            return date;
        }
        date.add(Calendar.DAY_OF_MONTH, -1);
        return getLastWorkDay(date);
    }

    //gets month's first day and returns first workday
    public Calendar getFirstWorkDay(Calendar date){
        if (date.get(Calendar.DAY_OF_WEEK) !=7 && date.get(Calendar.DAY_OF_WEEK) !=1 ){
            return date;
        }
        date.add(Calendar.DAY_OF_MONTH, 1);
        return getFirstWorkDay(date);

    }

    public int workDayByString(String id){
        int contains = 0;

        if (id.contains("segunda")){
            contains = 1;
        }
        else if (id.contains("terça")){
            contains = 2;
        }else if (id.contains("quarta")){
            contains = 3;
        }else if (id.contains("quinta")){
            contains = 4;
        }else if (id.contains("sexta")){
            contains = 5;
        }
        return contains;
    }

    public int daysBetweenDates(Calendar date1, Calendar date2){
        int count = 0;

        while (date1.compareTo(date2) != 0){
            date1.add(Calendar.DAY_OF_MONTH, -1 * date1.compareTo(date2));
            count++;
        }
        return count;
    }

    //returns the date of next weekday passed
    public Calendar getNextWeekDay(Calendar baseDate, int weekDay){
        
        if (baseDate.get(Calendar.DAY_OF_WEEK) < weekDay){
            baseDate.setWeekDate(baseDate.getWeekYear(), baseDate.get(Calendar.WEEK_OF_YEAR), weekDay);
            return baseDate;
        }
        baseDate.setWeekDate(baseDate.getWeekYear(), baseDate.get(Calendar.WEEK_OF_YEAR)+1, weekDay);
        return baseDate;

    }
}
