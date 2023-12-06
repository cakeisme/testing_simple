public class creditCardPayment extends billPayment {
    public void payBill(){
        System.out.println("Authenticating user account...");
        System.out.println("Validating selected credit card and payment amount...");
        System.out.println("Processing credit card payment....");
        System.out.println("Payment confirmed, thank you!");

        String choice = "No";

        System.out.println("The user input is " + choice);

        if(choice.equals("Yes")){
            System.out.println("Printing credit card payment slip...");;
        } else {
            System.out.println("Payment slip is not generated.");
        }
    }
}
