// Download the twilio-csharp library from twilio.com/docs/csharp/install
using System;
using Twilio;
using System.Linq;

class Example
{
  static void Main(string[] args)
  {
    // Find your Account Sid and Auth Token at twilio.com/user/account
    string AccountSid = "{{ account_sid }}";
    string AuthToken = "{{ auth_token }}";
    var twilio = new TwilioRestClient(AccountSid, AuthToken);

    var accounts = twilio.ListSubAccounts();

    foreach (var account in accounts.Accounts.Where(a => a.Status == "active"))
    {
      Console.WriteLine(account.FriendlyName);
    }
  }
}
