import java.util.Scanner;

public class class31 {
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

        // 2. Checking if strings are equal in value
        System.out.println("*****************************************************");
        System.out.println("2. Checking if strings are equal in value");
        
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
        // Equals finctions -> object class
        // This generally compares references(hashcodes) of objects (just like ==), but for string class it has been overridden to check for content equality
        
        // 3. Creating new String object from character array
        System.out.println("*****************************************************");
        System.out.println("3. Creating new String object from character array");
        char arr[] = {'C', 'I', 'P', 'H', 'E', 'R'};
        String strFromArr = new String(arr); // constructor overloaded
        System.out.println(strFromArr);
        
        // 4. Creating partial string object using character array
        System.out.println("*****************************************************");
        System.out.println("4. Creating partial string object using character array");
        String partialStrFromArr = new String(arr, 1, 3);
        System.out.println(partialStrFromArr);
        
        // 5. Changing the case
        System.out.println("*****************************************************");
        System.out.println("5. Changing the case");
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        // name = name.toLowerCase();
        System.out.println(name); // remains same
        
        // 6. Splitting
        System.out.println("*****************************************************");
        System.out.println("6. Splitting");
        System.out.println("Please enter your full name");
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
        String strArr[] = fullName.split(" ");
        for(int i = 0; i < strArr.length; i++){
            System.out.println(strArr[i]);
        }
        
        System.out.println("Please enter something seperated by comma");
        String csvText = sc.nextLine();
        String csvArr[] = csvText.split(",");
        for(int i = 0; i < csvArr.length; i++){
            System.out.println(csvArr[i]);
        }
        
        System.out.println("Please enter something seperated by dot");
        String dotText = sc.nextLine();
        String dotArr[] = dotText.split("[.]");// a dot is a meta character in regex, we need to explicitly mention that we are talking about character "." by using square brackets
        for(int i = 0; i < dotArr.length; i++){
            System.out.println(dotArr[i]);
        }
        
        String backSlashText = "Hii, I attend \"Java\" class";
        String backSlashArr[] = backSlashText.split("\"");
        for(int i = 0; i < backSlashArr.length; i++){
            System.out.println(backSlashArr[i]);
        }
        
        // 7. Length of a string
        System.out.println("*****************************************************");
        System.out.println("7. Length of a string");
        int len = name.length();
        System.out.println("Length of: " + name + " is: " + len);

        // 8. Finding index of a char in a string
        System.out.println("*****************************************************");
        System.out.println("8. Finding index of a char in a string");
        int index = name.indexOf('e');
        System.out.println("Index of 'e' in " + name + " is: " + index);

        int index2 = name.indexOf('E');
        System.out.println("Index of 'E' in " + name + " is: " + index2);

        int index3 = name.indexOf("School");
        System.out.println("Index of 'School' in " + name + " is: " + index3);

        int index4 = name.indexOf('o', 10);
        System.out.println("Index of 'o' in " + name + " is: " + index4);

        int indexOfO = 0;

        // while(indexOfO != -1){
        while(true){
            indexOfO = name.indexOf('o',indexOfO + 1);
            if(indexOfO == -1) break;
            System.out.println("O found at: " + indexOfO);
        }
        sc.close();
    }
}


