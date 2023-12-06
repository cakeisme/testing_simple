public class internalTransfer extends fundTransfer {
   /* public void transferFunds(){
        executeTransfer();
        validateTransferDetails();
        performTransfer();

    }

    void executeTransfer(){
        System.out.println("Executing transfer...");
    }

    void validateTransferDetails(){
        System.out.println("Validating internal transfer details...");
    }

    void performTransfer(){
        System.out.println("Performing internal transfer....");
    }


    void postTransfer(){
        System.out.println("Transfer successful!");
    }*/

    public void transferFunds(){
        System.out.println("Executing transfer...");
        System.out.println("Validating internal bank account number and recipient reference...");
        System.out.println("Performing internal transfer....");
        System.out.println("Transfer successful!");

        String choice = "Yes";

        System.out.println("The user input is " + choice);

        if(choice.equals("Yes")){
            System.out.println("Printing internal transfer slip...");;
        } else {
            System.out.println("Payment slip is not generated.");
        }
    }
}
