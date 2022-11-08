import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//     Variables Information

      String name;
      String age;
      String city;
      String college;
      String profession;
      String animal;
      String petName;




        System.out.println("Enter your name");
        name = input.nextLine();

        System.out.println("Enter your age");
        age = input.nextLine();

        System.out.println("Enter your city");
        city = input.nextLine();

        System.out.println("Enter your college");
        college = input.nextLine();

        System.out.println("Enter your profession");
        profession = input.nextLine();

        System.out.println("Name of animal");
        animal = input.nextLine();

        System.out.println("Enter pet name");
        petName = input.nextLine();



        System.out.println("There once was a person named: " + name + " Who lived in city " + city + ". At the age of " + age + ", " + name + " Went to college at " + college + ". " + name + " graduated and went to work as a(n) " + profession + ". Then, " + name + " adopted a(n) " + animal + " named " + petName + ". They both lived happily, ever after!" );



    }
}