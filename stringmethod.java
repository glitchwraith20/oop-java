public class stringmethod {
    public static void main(String[] args) {
        
        String name = "GlitchWraith";

        int length = name.length(); // lenght method
        char letter = name.charAt(0); // charAt method
        int index = name.indexOf("i"); // indexOf method
        int lastIndex = name.lastIndexOf("i"); // lastIndexOf
        //name = name.toUpperCase(); // toUpperCase method
        //name = name.toLowerCase(); // toLowerCase method
        //name = name.trim(); // trim name method
        //name = name.replace("i", "e"); // replace method

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);
        //System.out.println(name.isEmpty()); // boolean method

        /* 
        if (name.contains(" ")) {
            System.out.println("Your name contains spaces");
        }
        else {
            System.out.println("Your name doesn't contain spaces");
        }
        */

        /* 
        if (name.equalsIgnoreCase("password")) {
            System.out.println("Your name can't be password");
        }
        else {
            System.out.println("Hello " + name);
        }
        */
        
    }
}
