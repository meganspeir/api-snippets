// NOTE: This example uses the next generation Twilio helper library - for more
// information on how to download and install this version, visit
// https://www.twilio.com/docs/libraries/node
var accountSid = '{{ account_sid }}';
var authToken = '{{ auth_token }}';
var Twilio = require('twilio');

var client = new Twilio(accountSid, authToken);
var service = client.notifications.v1.services('ISxxx');

service.bindings.create({
  endpoint: 'xxx',
  identity: 'bob',
  bindingType: 'gcm',
  address: 'xxx',
  tag: ['premium', 'new user']
}).then(function(response) {
  console.log(response);
}).catch(function(error) {
  console.log(error);
});