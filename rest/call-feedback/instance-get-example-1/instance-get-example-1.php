<?php
// Get the PHP helper library from twilio.com/docs/php/install
require_once('/path/to/twilio-php/Services/Twilio.php'); // Loads the library

// Your Account Sid and Auth Token from twilio.com/user/account
$sid = "{{ account_sid }}";
$token = "{{ auth_token }}";
$client = new Services_Twilio($sid, $token);

// Get an object from its sid. If you do not have a sid,
// check out the list resource examples on this page
$feedback = $client->account->calls->getFeedback("CAe03b7cd806070d1f32bdb7f1046a41c0");
echo $feedback->date_created;
