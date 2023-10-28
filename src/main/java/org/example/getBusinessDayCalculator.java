package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class getBusinessDayCalculator {
    public static LocalDate getWorkday(LocalDate startDate, int nWorkdays) {
        LocalDate currentDate = startDate;

        while (nWorkdays > 0) {
            currentDate = currentDate.plusDays(1);
            // Check if the current day is a weekend (Saturday or Sunday)
            if (currentDate.getDayOfWeek() != DayOfWeek.SATURDAY &&
                    currentDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
                nWorkdays--;
            }
        }

        return currentDate;
    }

    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2023, 10, 5); // October 5th, 2023
        int nWorkdays = 2; // Number of workdays to add

        LocalDate businessDay = getWorkday(today, nWorkdays);
        System.out.println("Business Day: " + businessDay);
    }
    }