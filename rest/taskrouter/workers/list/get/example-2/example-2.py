# Download the Python helper library from twilio.com/docs/python/install
from twilio.rest import TwilioTaskRouterClient

# Your Account Sid and Auth Token from twilio.com/user/account
account_sid = "{{ account_sid }}"
auth_token  = "{{ auth_token }}"
workspace_sid = "{{ workspace_sid }}"

client = TwilioTaskRouterClient(account_sid, auth_token)

for worker in client.workers(workspace_sid).list(Available=1):
	print worker.friendly_name

for worker in client.workers(workspace_sid).list(TaskQueueSid="WQf855e98ad280d0a0a325628e24ca9627", Available=1):
	print worker.friendly_name

for worker in client.workers(workspace_sid).list(TargetWorkersExpression="type == 'leads'"):
	print worker.friendly_name