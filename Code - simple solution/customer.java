public class customer {
    public static void main(String[] args) {

        loginMaster lg = new loginMaster();
        boolean auth = lg.authenticateLogin("alex", "1234");

        if (auth) {

            System.out.println("\nInternal fund transfer:");
            internalTransfer it = new internalTransfer();
            it.transferFunds();

            System.out.println("\nExternal fund transfer:");
            externalTransfer et = new externalTransfer();
            et.transferFunds();

            System.out.println("\nPhone bill payment:");
            phoneBillPayment pbp = new phoneBillPayment();
            pbp.payBill();

            System.out.println("\nCredit card payment:");
            creditCardPayment ccp = new creditCardPayment();
            ccp.payBill();

            System.out.println("\nHouse loan application:");
            houseLoan hl = new houseLoan();
            hl.applyLoan();

            System.out.println("\nCar loan application:");
            carLoan cl = new carLoan();
            cl.applyLoan();

        } else {
            System.out.println("\nFail to authenticate login!");
        }
        lg.logout();
    }
}
