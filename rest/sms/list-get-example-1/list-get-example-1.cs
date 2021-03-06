// Download the twilio-csharp library from twilio.com/docs/csharp/install
using System;
using Twilio;
class Example 
{
  static void Main(string[] args) 
  {
    // Find your Account Sid and Auth Token at twilio.com/user/account
    string AccountSid = "{{ account_sid }}";
    string AuthToken = "{{ auth_token }}";
    var twilio = new TwilioRestClient(AccountSid, AuthToken);

    var smss = twilio.ListSmsMessages(null, null, null, null, null);
    
    foreach (var sms in smss.SMSMessages)
    {
      Console.WriteLine(sms.To);
    }
  }
}