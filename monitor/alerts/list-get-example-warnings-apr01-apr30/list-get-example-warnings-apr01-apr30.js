// Download the Node helper library from twilio.com/docs/node/install
// These vars are your accountSid and authToken from twilio.com/user/account
var accountSid = '{{ account_sid }}';
var authToken = "{{ auth_token }}";
var MonitorClient = require('twilio').MonitorClient;
var client = new MonitorClient(accountSid, authToken);

var params = {
    startDate: "2015-04-01T00:00:00Z",
    endDate: "2015-04-30T23:59:59Z",
    logLevel: "warning"
};

client.alerts.list(params, function(err, data) {
    data.alerts.forEach(function(alert) {
        console.log(alert.alertText);
    });
});