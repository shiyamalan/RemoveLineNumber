package usage;

import internal.LoggedIn;
import internal.Password;

public class GmailAccount
{

  
  
  public static void main(String[] args)
  {
    GmailAccount myAccount = new GmailAccount();
    myAccount.loggedin(new Password("myPassword"));
  }

}
