// Install the Java helper library from twilio.com/docs/java/install
import java.util.HashMap;
import java.util.Map;

import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.TwilioTaskRouterClient;
import com.twilio.sdk.resource.instance.taskrouter.Reservation;
import com.twilio.sdk.resource.instance.taskrouter.Task;
import com.twilio.sdk.resource.instance.taskrouter.Workspace;

public class Example { 

  // Find your Account Sid and Token at twilio.com/user/account
  private static final String ACCOUNT_SID = "{{ account_sid }}";
  private static final String AUTH_TOKEN = "{{ auth_token }}";
  private static final String WORKSPACE_SID = "{{ workspace_sid }}";
  private static final String TASK_SID = "{{ task_sid }}";
  private static final String RESERVATION_SID = "{{ reservation_sid }}";

  public static void main(String[] args) throws TwilioRestException {
    TwilioTaskRouterClient client = new TwilioTaskRouterClient(ACCOUNT_SID, AUTH_TOKEN);

    Reservation reservation = client.getReservation(WORKSPACE_SID, TASK_SID, RESERVATION_SID);

    // redirect using a reservation
    Map<String, String> params = new HashMap<String, String>();
    params.put("Instruction", "Redirect");
    params.put("RedirectCallSid", "CA123456789");
    params.put("RedirectUrl", "http://example.com/assignment_redirect");
    reservation.update(params);
  }
}