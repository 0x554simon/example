<%@page language="java" contentType="text/html; charset=UTF-8"%><%@ page import="com.jspsmart.upload.*"%><%

	String ipoExportReqResFilePath=(String)request.getAttribute("ipoLinkInfoExpFilePath");
	//System.out.println("hi,this jsp filepath="+ipoExportRequestFilePath);
	
	SmartUpload su = new SmartUpload();
		// ��ʼ��
	su.initialize(pageContext);
		// �趨contentDispositionΪnull�Խ�ֹ������Զ����ļ���
		//��֤������Ӻ��������ļ��������趨�������ص��ļ���չ��Ϊ
		//docʱ����������Զ���word��������չ��Ϊpdfʱ��
		//���������acrobat�򿪡�
	su.setContentDisposition(null);
		// �����ļ�
	su.downloadFile(ipoExportReqResFilePath);
%>