// Download the Node helper library from twilio.com/docs/node/install
// These vars are your accountSid and authToken from twilio.com/user/account
var accountSid = '{{ account_sid }}';
var authToken = "{{ auth_token }}";
var client = require('twilio')(accountSid, authToken);

client.sms.messages("SM800f449d0399ed014aae2bcc0cc2f2ec").get(function(err, sms) {
    console.log(sms.body);
});