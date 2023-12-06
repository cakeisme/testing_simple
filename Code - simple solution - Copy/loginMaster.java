public class loginMaster {

    public loginMaster (){
        
    }

    // Check if the username contains all alphabets and the password contains all numbers
    public boolean authenticateLogin(String un, String pw) {

        return un.matches("[a-zA-Z]+") && pw.matches("\\d+");
    }
    

    public void logout(){
        System.out.println("\nUser has logged out.");
    }

}
