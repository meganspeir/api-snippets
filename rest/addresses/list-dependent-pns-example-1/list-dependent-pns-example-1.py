# Download the Python helper library from twilio.com/docs/python/install
from twilio.rest import TwilioRestClient

# Your Account Sid and Auth Token from twilio.com/user/account
account_sid = "{{ account_sid }}"
auth_token  = "{{ auth_token }}"
client = TwilioRestClient(account_sid, auth_token)

# A list of dependent phone number objects
numbers = client.dependent_phone_numbers('AD2a0747eba6abf96b7e3c3ff0b4530f6e').list()

for number in numbers:
    print number.friendly_name
