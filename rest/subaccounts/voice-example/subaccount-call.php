<?php
// Get the PHP helper library from twilio.com/docs/php/install
require_once('/path/to/twilio-php/Services/Twilio.php'); // Loads the library

// Account Sid and Auth token for your new subaccount
$sa_sid = "{{ account_sid }}";
$sa_token = "{{ subaccount_auth_token }}"; 
$sa_client = new Services_Twilio($sa_sid, $sa_token);

$sa_client->calls->create(
    '+14158141829', // A Twilio number in your subaccount
    '+16518675309', // The visitor's phone number
    'http://twimlets.com/message?Message%5B0%5D=Hello%20from%20your%20subaccount'
);
