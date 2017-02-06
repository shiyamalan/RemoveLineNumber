package com.file.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class FileReader implements Readable
{

  public void read()
  {

  }

  public void read(String[] files)
  {

  }

  public void read(String path)
  {
    BufferedReader br = null;
    java.io.FileReader fr = null;

    try
    {
      fr = new java.io.FileReader(path);
      br = new BufferedReader(fr);

      String sCurrentLine;

      while ((sCurrentLine = br.readLine()) != null)
      {
        System.out.println(sCurrentLine);
      }

    }
    catch (IOException e)
    {


    }
    finally
    {
      try
      {

        if (br != null)
        {
          br.close();
        }

        if (fr != null)
        {
          fr.close();
        }

      }
      catch (IOException ex)
      {
        
      }

    }
  }

  public File getFile(String path)
  {
    File file =  new File(path);
    if(file.exists())
    {
      return file;
    }
    return null;
  }
}
