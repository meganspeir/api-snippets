<?php
// Get the PHP helper library from twilio.com/docs/php/install
require_once('/path/to/twilio-php/Services/Twilio.php'); // Loads the library

// Your Account Sid and Auth Token from twilio.com/user/account
$accountSid = "{{ account_sid }}";
$authToken = "{{ auth_token }}";
$workspaceSid = "{{ workspace_sid }}";
$activitySid = "{{ activity_sid }}";

$client = new TaskRouter_Services_Twilio($accountSid, $authToken, $workspaceSid);

$activity = $client->workspace->activities->get($activitySid);
$activity->update(
	array(
		'FriendlyName' => 'NewAvailableFriendlyName',
		'Available' => 'true'
	)
);
