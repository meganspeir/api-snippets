// Download the Node helper library from twilio.com/docs/node/install
// These vars are your accountSid and authToken from twilio.com/user/account
var twilio = require('twilio');

var accountSid = "{{ account_sid }}";
var authToken = "{{ auth_token }}";
var workspaceSid = "{{ workspace_sid }}";

var client = new twilio.TaskRouterClient(accountSid, authToken, workspaceSid);

client.workspace.workers.list(function(err, data) {
    data.workers.forEach(function(worker) {
        console.log(worker.friendly_name);
    })
});