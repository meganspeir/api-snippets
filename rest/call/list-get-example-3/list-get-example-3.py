# Download the Python helper library from twilio.com/docs/python/install
from twilio.rest import TwilioRestClient
from datetime import date

# Your Account Sid and Auth Token from twilio.com/user/account
account_sid = "{{ account_sid }}"
auth_token  = "{{ auth_token }}"
client = TwilioRestClient(account_sid, auth_token)

# A list of call objects with the properties described above
calls = client.calls.list(status="completed",
    started_after=date(2009, 7, 6))
