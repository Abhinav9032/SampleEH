package com.cerner.test.util;

public class ApplicationConstants {

	// Error codes and Custom messages for various Exceptions

	public static int MINIMUM_LENGTH_CONSTRAINT_VIOLATION_CODE = 901;
	public static String MINIMUM_LENGTH_CONSTRAINT_VIOLATION_MESSAGE = "The name must contain at least 3 caracters";

	public static String MINIMUM_LENGTH_CONSTRAINT_VIOLATION_DATE_MESSAGE = "The date  must contain at least 8 numeric caracters in format YYYYMMDD";
	
	public static String MINIMUM_LENGTH_CONSTRAINT_VIOLATION_GENDER_MESSAGE = "The GENDER must contain at least 4 caracters";
	
	public static int INVALID_PHONE_NUMBER_CODE = 902;
	public static String INVALID_PHONE_NUMBER_MESSAGE = "Please provide phone number of 10 digits";

	public static int INVALID_EMAIL_CODE = 903;
	public static String INVALID_EMAIL_MESSAGE = "Please provide a correct Email Id";

	public static int ALPHABETICAL_INPUT_VIOLATION_CODE = 904;
	public static String ALPHABETICAL_INPUT_VIOLATION_MESSAGE = "Please provide an alphabetical input";

	public static int MAXIMUM_VALUE_EXCEEDED_CODE = 905;
	public static int MAXIMUM_PERMISSABLE_VALUE = 5000;
	public static String MAXIMUM_VALUE_EXCEEDED_MESSAGE = "The value entered can not be more than "	+ MAXIMUM_PERMISSABLE_VALUE;

	public static int PAST_DATE_REQUIRED_CODE = 906;
	public static String PAST_DATE_REQUIRED_MESSAGE = "Please provide a date earlier than today's date";

	public static int FUTURE_DATE_REQUIRED_CODE = 907;
	public static String FUTURE_DATE_REQUIRED_MESSAGE = "Please provide a future date ";

	public static int ALPHANUMERIC_INPUT_VIOLATION_CODE = 908;
	public static String ALPHANUMERIC_INPUT_VIOLATION_MESSAGE = "Please provide an alphanumeric input";
	
	public static int NUMERIC_INPUT_VIOLATION_CODE = 909;
	public static String NUMERIC_INPUT_VIOLATION_MESSAGE = "Please provide an Numeric input";
	
	public static int BOOLEAN_INPUT_VIOLATION_CODE = 910;
	public static String BOOLEAN_INPUT_VIOLATION_MESSAGE = "Please provide an Boolean input TRUE or FALSE";

}
