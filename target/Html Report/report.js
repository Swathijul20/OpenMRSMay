$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/RegistrationDesk.feature");
formatter.feature({
  "name": "To Validate Registration Desk",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To verify registration desk functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User has to launch any browser and url of application",
  "keyword": "Given "
});
formatter.match({
  "location": "RegistrationDesk.user_has_to_launch_any_browser_and_url_of_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass valid credentials in email and password field",
  "keyword": "When "
});
formatter.match({
  "location": "RegistrationDesk.user_has_to_pass_valid_credentials_in_email_and_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pick any location and click on Login and verify user redirected to dashboard",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationDesk.user_has_to_pick_any_location_and_click_on_Login_and_verify_user_redirected_to_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click patient register menu and fill all details in demographics and contact info",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationDesk.user_has_to_click_patient_register_menu_and_fill_all_details_in_demographics_and_contact_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to confirm start visit then attaching problems then verifying successfully attached message and ending visit",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationDesk.user_has_to_confirm_start_visit_then_attaching_problems_then_verifying_successfully_attached_message_and_ending_visit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to visit again for body bmi calculation",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationDesk.user_has_to_visit_again_for_body_bmi_calculation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to add past visit and delete the records",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationDesk.user_has_to_add_past_visit_and_delete_the_records()"
});
formatter.result({
  "status": "passed"
});
});