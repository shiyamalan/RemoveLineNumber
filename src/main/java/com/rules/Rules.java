package com.rules;

import java.util.List;

public class Rules
{

  private List<Sympol> sympols;
  
  private String id;
  
  private String rule;

  public List<Sympol> getSympols()
  {
    return sympols;
  }

  public void setSympols(List<Sympol> sympols)
  {
    this.sympols = sympols;
  }

  public String getId()
  {
    return id;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public String getRule()
  {
    return rule;
  }

  public void setRule(String rule)
  {
    this.rule = rule;
  }
  
  
}
