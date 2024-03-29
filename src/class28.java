public class class28 {
    public static void main(String[] args) {
        String name = "CipherSchools"; // created using string literals - stored in method area
        String name2 = "CipherSchools";

        String name3 = new String("CipherSchools"); // creating string using constructors
        String name4 = new String("CipherSchools");

        System.out.println(name==name2); // == operator compares references for objects and values for primitive datatypes
        System.out.println(name3==name4);
        System.out.println(name==name3);


        // Strings are immutable
        // Everytime we do an operation on a string a new object is created
        
        //1. Cancatenation
        String s1 = "Hello";
        s1 = s1 + " Peeps";
        System.out.println(s1);
        System.out.println(s1 + ", How are you doing?");
        System.out.println(s1); // s1 remains same

        // ANother way to concat is to use function
        String s2 = new String("Hello");
        String s3 = new String(" People");
        String s4 = s2.concat(s3);
        System.out.println(s4);
        System.out.println(s2);// s2 remains same

    }
}
