package com.file.reader;

import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.rules.Rules;

public class XMLReader extends FileReader
{
  private static DocumentBuilder dBuilder;
  static
  {
    try
    {
      dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
    }
    catch (ParserConfigurationException e)
    {

    }
  }

  public List<Rules> getRules(String path)
  {
    try
    {

      File file = getFile(path);
      Document doc = dBuilder.parse(file);

      if (doc.hasChildNodes())
      {
      }

    }
    catch (Exception e)
    {

    }
    return null;

  }

  private void getChildres(NodeList nodeList)
  {
    for (int count = 0; count < nodeList.getLength(); count++)
    {

      Node tempNode = nodeList.item(count);

      if (tempNode.getNodeType() == Node.ELEMENT_NODE)
      {

        // get node name and value
        System.out.println("\nNode Name =" + tempNode.getNodeName() + " [OPEN]");
        System.out.println("Node Value =" + tempNode.getTextContent());

        if (tempNode.hasAttributes())
        {

          // get attributes names and values
          NamedNodeMap nodeMap = tempNode.getAttributes();

          for (int i = 0; i < nodeMap.getLength(); i++)
          {

            Node node = nodeMap.item(i);
            System.out.println("attr name : " + node.getNodeName());
            System.out.println("attr value : " + node.getNodeValue());

          }

        }
      }
    }
  }
}
