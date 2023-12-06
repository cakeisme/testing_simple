public class phoneBillPayment extends billPayment {
    public void payBill(){
        System.out.println("Authenticating user account...");
        System.out.println("Validating phone number and bill apyment amount...");
        System.out.println("Processing phone bill payment....");
        System.out.println("Payment confirmed, thank you!");

        String choice = "Yes";

        System.out.println("The user input is " + choice);

        if(choice.equals("Yes")){
            System.out.println("Printing phone bill payment slip...");;
        } else {
            System.out.println("Payment slip is not generated.");
        }
    }
}
