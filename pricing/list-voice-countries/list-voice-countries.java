// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.sdk.TwilioPricingClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.list.pricing.VoiceCountryList;
import com.twilio.sdk.resource.instance.pricing.VoiceCountry;

public class Example {

	// Find your Account Sid and Token at twilio.com/user/account
	public static final String ACCOUNT_SID = "{{ account_sid }}";
	public static final String AUTH_TOKEN = "{{ auth_token }}";

	public static void main(String[] args) throws TwilioRestException {
		TwilioPricingClient client = new TwilioPricingClient(ACCOUNT_SID, AUTH_TOKEN);

		// Get a list of countries where Twilio Voice is available
		VoiceCountryList list = client.getVoiceCountries();

		for (VoiceCountry c : list.getPageData()) {
			System.out.println(c.getIsoCountry());
		}
	}
}
