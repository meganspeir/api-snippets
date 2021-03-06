<?php
// Get the PHP helper library from twilio.com/docs/php/install
require_once('/path/to/twilio-php/Services/Twilio.php'); // Loads the library

// Your Account Sid and Auth Token from twilio.com/user/account
$sid = "{{ account_sid }}"; 
$token = "{{ auth_token }}"; 
$client = new Services_Twilio($sid, $token);

// Get an object from its sid. If you do not have a sid,
// check out the list resource examples on this page
$trigger = $client->account->usage_triggers->get("UT33c6aeeba34e48f38d6899ea5b765ad4");
$trigger->update(array(
        "FriendlyName" => "Monthly Maximum Call Usage",
    "CallbackUrl" => "https://www.example.com/monthly-usage-trigger"
    ));
echo $trigger->date_fired;
