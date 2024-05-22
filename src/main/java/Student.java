public class Student {

  private String Name;
  private int Age;
  private String Nazwisko;
  private int DzienUrodzenia;
  private int MiesiacUrodzenia;
  private int RokUrodzenia;
  //private String DataUrodzenia;

  public Student(String name, int age, String nazwisko, int dzienUrodzenia, int miesiacUrodzenia, int rokUrodzenia) {
    Name = name;
    Age = age;
    Nazwisko = nazwisko;
    DzienUrodzenia=dzienUrodzenia;
    MiesiacUrodzenia=miesiacUrodzenia;
    RokUrodzenia=rokUrodzenia;
    //DataUrodzenia=dataUrodzenia;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public String GetNazwisko() {return Nazwisko;}
  public int GetDzienUrodzenia() {return DzienUrodzenia;}
  public int GetMiesiacUrodzenia() {return MiesiacUrodzenia;}
  public int GetRokUrodzenia() {return RokUrodzenia;}
  
  //public String GetDataUrodzenia(){return DataUrodzenia;}

  public String ToString() {
    return Name + " " + Integer.toString(Age) + " " + Nazwisko + " " + Integer.toString(DzienUrodzenia) + " " + Integer.toString(MiesiacUrodzenia) + " " + Integer.toString(RokUrodzenia);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 6) {
          return new Student("Parse Error", -1, "Parse Error", -1, -1, -1);
    }
    return new Student(data[0], Integer.parseInt(data[1]), data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
  }
}