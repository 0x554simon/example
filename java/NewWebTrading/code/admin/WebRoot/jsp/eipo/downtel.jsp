<%@page language="java" contentType="text/html"%><%@page import="com.jspsmart.upload.*"%><%

	String ipoExpTelPath=(String)request.getParameter("ipoExpTelPath");
	//System.out.println("hi,this jsp filepath="+ipoExpTelPath);
	
	SmartUpload su = new SmartUpload();
		// ��ʼ��
	su.initialize(pageContext);
		// �趨contentDispositionΪnull�Խ�ֹ������Զ����ļ���
		//���������acrobat�򿪡�
	su.setContentDisposition(null);
		// �����ļ�
	su.downloadFile(ipoExpTelPath);
%>