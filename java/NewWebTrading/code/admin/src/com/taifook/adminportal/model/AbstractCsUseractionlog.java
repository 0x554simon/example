/*
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 *
 * Created Mon Apr 03 18:26:30 GMT+08:00 2006 by MyEclipse Hibernate Tool.
 */
package com.taifook.adminportal.model;

import java.io.Serializable;
import java.util.Date;

/**
 * A class that represents a row in the CS_USERACTIONLOG table. 
 * You can customize the behavior of this class by editing the class, {@link CsUseractionlog()}.
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 */
public abstract class AbstractCsUseractionlog 
    implements Serializable
{
    /** The cached hash code value for this instance.  Settting to 0 triggers re-calculation. */
    private int hashValue = 0;

    /** The composite primary key value. */
    private java.lang.Long seqno;

    /** The value of the simple userid property. */
    private java.lang.String userid;

    /** The value of the simple actionid property. */
    private java.lang.String actionid;
    
    private java.lang.String channelType;

    /** The value of the simple ip property. */
    private java.lang.String ip;
   
    /** The value of the simple operationtime property. */
    private Date operationtime;

    /**
     * Simple constructor of AbstractCsUseractionlog instances.
     */
    public AbstractCsUseractionlog()
    {
    }

    /**
     * Constructor of AbstractCsUseractionlog instances given a simple primary key.
     * @param seqno
     */
    public AbstractCsUseractionlog(java.lang.Long seqno)
    {
        this.setSeqno(seqno);
    }

    /**
     * Return the simple primary key value that identifies this object.
     * @return java.lang.Long
     */
    public java.lang.Long getSeqno()
    {
        return seqno;
    }

    /**
     * Set the simple primary key value that identifies this object.
     * @param seqno
     */
    public void setSeqno(java.lang.Long seqno)
    {
        this.hashValue = 0;
        this.seqno = seqno;
    }

    /**
     * Return the value of the USERID column.
     * @return java.lang.String
     */
    public java.lang.String getUserid()
    {
        return this.userid;
    }

    /**
     * Set the value of the USERID column.
     * @param userid
     */
    public void setUserid(java.lang.String userid)
    {
        this.userid = userid;
    }

    /**
     * Return the value of the ACTIONID column.
     * @return java.lang.String
     */
    public java.lang.String getActionid()
    {
        return this.actionid;
    }

    /**
     * Set the value of the ACTIONID column.
     * @param actionid
     */
    public void setActionid(java.lang.String actionid)
    {
        this.actionid = actionid;
    }

    /**
     * Return the value of the IP column.
     * @return java.lang.String
     */
    public java.lang.String getIp()
    {
        return this.ip;
    }

    /**
     * Set the value of the IP column.
     * @param ip
     */
    public void setIp(java.lang.String ip)
    {
        this.ip = ip;
    }

    /**
     * Return the value of the MONTH column.
     * @return java.lang.String
     */
    
    /**
     * Return the value of the OPERATIONTIME column.
     * @return java.lang.String
     */
    public Date getOperationtime()
    {
        return this.operationtime;
    }

    /**
     * Set the value of the OPERATIONTIME column.
     * @param operationtime
     */
    public void setOperationtime(Date operationtime)
    {
        this.operationtime = operationtime;
    }

    /**
     * Implementation of the equals comparison on the basis of equality of the primary key values.
     * @param rhs
     * @return boolean
     */
    public boolean equals(Object rhs)
    {
        if (rhs == null)
            return false;
        if (! (rhs instanceof CsUseractionlog))
            return false;
        CsUseractionlog that = (CsUseractionlog) rhs;
        if (this.getSeqno() == null || that.getSeqno() == null)
            return false;
        return (this.getSeqno().equals(that.getSeqno()));
    }

    /**
     * Implementation of the hashCode method conforming to the Bloch pattern with
     * the exception of array properties (these are very unlikely primary key types).
     * @return int
     */
    public int hashCode()
    {
        if (this.hashValue == 0)
        {
            int result = 17;
            int seqnoValue = this.getSeqno() == null ? 0 : this.getSeqno().hashCode();
            result = result * 37 + seqnoValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }

	public java.lang.String getChannelType() {
		return channelType;
	}

	public void setChannelType(java.lang.String channelType) {
		this.channelType = channelType;
	}

}