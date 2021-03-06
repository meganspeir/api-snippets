# Download the Python helper library from twilio.com/docs/python/install
from twilio.rest import TwilioTaskRouterClient

# Your Account Sid and Auth Token from twilio.com/user/account
account_sid = "{{ account_sid }}"
auth_token  = "{{ auth_token }}"
workspace_sid = "{{ workspace_sid }}"
worker_sid = "{{ worker_sid }}"

client = TwilioTaskRouterClient(account_sid, auth_token)

activity = client.workers(workspace_sid).update(worker_sid, attributes='{"type":"support"}')
print activity.friendly_name

# alternatively
worker = client.workers(workspace_sid).get(worker_sid)
worker = worker.update(attributes='{"type":"support"}')
print worker.attributes