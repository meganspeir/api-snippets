// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.TwilioTaskRouterClient;
import com.twilio.sdk.resource.list.taskrouter.ReservationList;

public class Example { 

  // Find your Account Sid and Token at twilio.com/user/account
  private static final String ACCOUNT_SID = "{{ account_sid }}";
  private static final String AUTH_TOKEN = "{{ auth_token }}";
  private static final String WORKSPACE_SID = "{{ workspace_sid }}";
  private static final String WORKER_SID = "{{ worker_sid }}";

  public static void main(String[] args) throws TwilioRestException {
    TwilioTaskRouterClient client = new TwilioTaskRouterClient(ACCOUNT_SID, AUTH_TOKEN);

    ReservationList reservations = client.getWorker(WORKSPACE_SID, WORKER_SID).getReservations();

    for(Reservation reservation : reservations) {
        System.out.println(reservation.getReservationStatus());
        System.out.println(reservation.getWorkerName());
    }
  }
}