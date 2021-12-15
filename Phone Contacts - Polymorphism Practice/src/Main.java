public class Main {

    public static void main(String[] args) {

        Contact contactOne = new Contact("Thoybur",
                new PhoneNumber("07832932818"));
        Contact contactTwo = new Contact("Hasib",
                new PhoneNumber(41, "9384713401"));
        Contact contactThree = new Contact("Muhammad",
                new PhoneNumber("448474734929"));
        Contact contactFour = new Contact("David ",
                "david_jones@bluewire.com");
        Contact contactFive = new Contact("ali",
                new PhoneNumber("2029384982"), "sarahb@tech.com");

        System.out.println(contactOne);
       // System.out.println(contactTwo);
       // System.out.println(contactThree);
       // System.out.println(contactFour);
        System.out.println(contactFive);
    }
}
