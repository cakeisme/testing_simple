public class externalTransfer extends fundTransfer {
    /*public void transferFunds(){
        executeTransfer();
        validateTransferDetails();
        performTransfer();

    }

    void executeTransfer(){
        System.out.println("Executing transfer...");
    }

    void validateTransferDetails(){
        System.out.println("Validating external transfer details...");
    }

    void performTransfer(){
        System.out.println("Performing external transfer....");
    }


    void postTransfer(){
        System.out.println("Transfer successful!");
    }*/

    public void transferFunds(){
        System.out.println("Executing transfer...");
        System.out.println("Validating selecred external bank, account number and recipient reference...");
        System.out.println("Performing external transfer....");
        System.out.println("Transfer successful!");

        String choice = "No";

        System.out.println("The user input is " + choice);

        if(choice.equals("Yes")){
            System.out.println("Printing external transfer slip...");;
        } else {
            System.out.println("Payment slip is not generated.");
        }
    }
}
