// Service class (subsystem)
class FdService {
    public void getFdServiceDetails(String accountNo) {
        System.out.println("Fetching FD details for Account No: " + accountNo);
    }
}

// Facade class
class BankFacade {
    // list of all services
    private FdService fdService;

    // constructor
    public BankFacade() {
        this.fdService = new FdService();
    }

    // simplified access method
    public void getFdServiceDetails(String accountNo) {
        fdService.getFdServiceDetails(accountNo);
    }
}

// Client code
public class FacadeDemo {
    public static void main(String[] args) {
        BankFacade bankFacade = new BankFacade();
        bankFacade.getFdServiceDetails("ACC12345");
    }
}
