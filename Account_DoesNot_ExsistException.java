package ZensorPractise;

class Account_DoesNot_ExsistException extends Exception
{
	 Account_DoesNot_ExsistException ()
	 {
		 super("Exception: Account number doesn't exists");
	 }
}