// Download the Node helper library from twilio.com/docs/node/install
// These vars are your accountSid and authToken from twilio.com/user/account
var accountSid = '{{ account_sid }}';
var authToken = '{{ auth_token }}';
var LookupsClient = require('twilio').LookupsClient;
var client = new LookupsClient(accountSid, authToken);

client.phoneNumbers('(510) 867-5309').get({
  countryCode: 'US',
  type: 'carrier'
}, function(error, number) {
  console.log(number.carrier.type);
  console.log(number.carrier.name);
});
