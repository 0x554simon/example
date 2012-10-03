
package pl.criteria;
/**
*  Last Updated $Date: 2008/10/15 09:25:16 $
*  Last Committed by $Author: huangmeng $
*  Revision $Revision: 1.1 $
*  $Log: NotRegExpCaseCriteria.java,v $
*  Revision 1.1  2008/10/15 09:25:16  huangmeng
*  *** empty log message ***
*
*  Revision 1.1  2006/11/23 15:57:08  huangmeng
*  *** empty log message ***
*
*  Revision 1.1  2001/07/31 08:34:12  artyomr
*  no message
*
*
*	Property of Intrinity Inc.
*	All rights reserved
*/

public class NotRegExpCaseCriteria extends SelectionCriteria
{

  public NotRegExpCaseCriteria(pl.map.ClassMap classMap, pl.map.AttributeMap attributeMap)
  {
    super(classMap, attributeMap);
  }

  public void fillSqlStatement(pl.sql.SqlStatement statement, java.util.Iterator parameters) throws pl.PlException
  {
    pl.map.ColumnMap cm = getAttributeMap().getColumnMap();
    statement.addSqlClause(cm.getFullyQualifiedName() + " !~ ?");
    statement.addParameter(parameters.next(), cm.getPlType());
  }

}
