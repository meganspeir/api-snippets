# Download the Python helper library from twilio.com/docs/python/install
from twilio.rest import TwilioTaskRouterClient

# Your Account Sid and Auth Token from twilio.com/user/account
account_sid = "{{ account_sid }}"
auth_token  = "{{ auth_token }}"
workspace_sid = "{{ workspace_sid }}"

client = TwilioTaskRouterClient(account_sid, auth_token)

for taskqueue in client.taskqueues(workspace_sid).list():
	print taskqueue.friendly_name