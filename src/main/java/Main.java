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

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      Scanner scanner=new Scanner(System.in);

      System.out.println("Wybierz opcję:");
      System.out.println("1. Dodaj nowego studenta");

      int opcja=scanner.nextInt();
      scanner.nextLine();

      switch(opcja)
      {
        case 1:
          System.out.println("Podaj imię nowego studenta: ");
          String imie=scanner.nextLine();

          System.out.println("Podaj wiek nowego studenta: ");
          int wiek=scanner.nextInt();
          scanner.nextLine();

          s.addStudent(new Student(imie, wiek));
          break;
          
      }
      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
    } catch (IOException e) {
      e.printStackTrace();

    }
  }
}