/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;
import java.util.Collection;
import java.util.Date;
import java.util.InputMismatchException;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      Scanner scanner=new Scanner(System.in);

      System.out.println("Wybierz opcję:");
      System.out.println("1. Dodaj nowego studenta");
      System.out.println("2. Wyswietl wszystkich studentow z bazy");
      //System.out.println("3. Dodaj nowego studenta z innymi danymi");

      //int opcja=scanner.nextInt();
      //scanner.nextLine();
      int opcja = 0;
      try {
        opcja = scanner.nextInt();
      } catch (InputMismatchException e) {
        scanner.next();
      }
      switch(opcja)
      {
        case 1:
          System.out.println("Podaj imię nowego studenta: ");
          String imie=scanner.next();
          //scanner.nextLine();

          System.out.println("Podaj wiek nowego studenta: ");
          //int wiek=scanner.nextInt();
          //scanner.nextLine();
          int wiek = 0;
          scanner.nextLine();
          try {
            wiek = scanner.nextInt();
          } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer for age.");
            scanner.next(); // Clear the input buffer
          }
          scanner.nextLine();

          System.out.println("Podaj nazwisko nowego studenta: ");
          String nazwisko=scanner.nextLine();

          System.out.println("Podaj dzień urodzenia nowego studenta : ");
          int dzienUrodzenia=scanner.nextInt();
          scanner.nextLine();

          System.out.println("Podaj miesiąc urodzenia nowego studenta : ");
          int miesiacUrodzenia=scanner.nextInt();
          scanner.nextLine();

          System.out.println("Podaj rok urodzenia nowego studenta : ");
          int rokUrodzenia=scanner.nextInt();
          scanner.nextLine();
          
          s.addStudent(new Student(imie, wiek, nazwisko, dzienUrodzenia, miesiacUrodzenia, rokUrodzenia));
          break;
          
        case 2:
          System.out.println("Wszyscy studenci z bazy: ");
          var students = s.getStudents();
          for(Student current : students) {
            System.out.println(current.ToString());         
        } 
          break;
        //case 3:
          //System.out.println("Podaj NR indeksu nowego studenta: ");
          //int nrindeksu=scanner.nextInt();
          //scanner.nextLine();

          //System.out.println("Podaj Email nowego studenta: ");
          //String email=scanner.nextLine();  

          //s.addStudent(new Student(imie, wiek, nrindeksu, email));
          //break;
          
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}