package internal;

public class Password implements Encrypt
{

  public char ch[];

  public Password(String myPassword)
  {
    if (myPassword != null && !myPassword.equals(""))
    {
      assignPassword(myPassword);
    }
  }

  public Password()
  {
    this("");
  }
  private void assignPassword(String myPassword)
  {
    char myChars[] = myPassword.toCharArray();
    char ch[] = new char[myChars.length];
    int i = 0;
    for (char c : myChars)
    {
      ch[i++] = c;
    }
    this.ch = ch;
  }

  public String getPasswordKey()
  {
    String en = "";
    for (char c : ch)
    {
      if (new Character(c) != null)
      {
        int dummy = c;
        en += Integer.toString(dummy) + ",";
      }
    }
    return en;
  }

}
