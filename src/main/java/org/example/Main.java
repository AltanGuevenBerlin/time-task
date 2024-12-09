package org.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // Afg 2. + 14 Tage
        LocalDate futureDate = LocalDate.now().plusDays(14);
        System.out.println(futureDate);

        // Afg 3. Mit Neujahr 01.01.2025
        LocalDate today = LocalDate.now();
        LocalDate newYear = LocalDate.now().plusDays(23);
        if (today.isAfter(newYear)) {
            System.out.println("Das aktuelle Datum: " + today + " liegt NACH Neujahr");
        }
        if (today.isBefore(newYear)) {
            System.out.println("Das aktuelle Datum: " + today + " liegt VOR Neujahr");
        }

        // Afg 4. Berechne die Differenz
        LocalDate localDate = LocalDate.now();
        LocalDate newYearDate = LocalDate.now().plusDays(23);
        long daysBetween = ChronoUnit.DAYS.between(localDate, newYearDate);
        System.out.println(daysBetween);

    }
}