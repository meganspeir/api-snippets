// Download the Node helper library from twilio.com/docs/node/install
// These vars are your accountSid and authToken from twilio.com/user/account
var accountSid = '{{ account_sid }}';
var authToken = "{{ auth_token }}";
var MonitorClient = require('twilio').MonitorClient;
var client = new MonitorClient(accountSid, authToken);

var params = {
    startDate: "2015-03-01T00:00:00Z",
    endDate: "2015-04-01T00:00:00Z"
};
client.events.list(params, function(error, events) {
    for (var e in events) {
        process.stdout.write(e.description);
    }
});
