public class Student {

  private String Name;
  private int Age;
  private int Nrindeksu;
  private String Email;

  public Student(String name, int age, int nrindeksu, String email) {
    Name = name;
    Age = age;
    Nrindeksu = nrindeksu;
    Email = email;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public int GetNrindeksu() {return Nrindeksu;}
  public String GetEmail() {return Email;}

  public String ToString() {
    return Name + " " + Integer.toString(Age) + " " + Integer.toString(Nrindeksu) + " " + Email;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) {
          return new Student("Parse Error", -1, -1, "");
    }
    return new Student(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]),data[3]);
  }
}