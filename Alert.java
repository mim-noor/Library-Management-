import java.util.Date;

public class Alert {
    Date issuedate;
    String bookname;
    Date returndate;
    int fine;

    public void viewAlert() {
        System.out.println("Viewing alert for: " + bookname);
    }

    public void fineCall() {
        System.out.println("Fine amount: " + fine);
    }

    public void deleteAlertByNo() {
        System.out.println("Alert deleted.");
    }
}

