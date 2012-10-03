//Created by MyEclipse Struts
// XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_4.0.1/xslt/JavaClass.xsl

package com.taifook.adminportal.web.parameter.actions;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.itsz.sht.admin.service.syndata.SynParameterCallBack;
import com.itsz.sht.common.Consts;
import com.itsz.sht.dao.hibernate.model.AclUserProfile;
import com.taifook.adminportal.common.Constants;
import com.taifook.adminportal.common.ServiceManager;
import com.taifook.adminportal.dao.ParameterDAO;
import com.taifook.adminportal.exceptions.SocketTransferException;
import com.taifook.adminportal.model.CsParameter;
import com.taifook.adminportal.web.parameter.forms.ParameterForm;
import com.taifook.common.socket.ClientSocketService;
import com.taifook.common.socket.SocketMessage;

/** 
 * MyEclipse Struts
 * Creation date: 03-27-2006
 * 
 * XDoclet definition:
 * @struts.action validate="true"
 * @struts.action-forward name="updateparameterothersuccess" path="/success"
 */
public class UpdateParameterAction extends BaseParameterAction {

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 * @throws Exception 
	 */
	public ActionForward executeAction(ActionMapping mapping,ActionForm form,HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Log log = LogFactory.getLog(this.getClass()); 
		String forward=Constants.SUCCESS;
		ParameterForm updateForm=(ParameterForm)form;
		CsParameter updateParameter=new CsParameter();
		updateParameter.setKey(updateForm.getKey().trim());
		updateParameter.setReadonly(Boolean.valueOf(updateForm.getReadonly()).booleanValue());
		updateParameter.setValue(updateForm.getValue());
		updateParameter.setClassid(updateForm.getClassid());
		updateParameter.setDataType(updateForm.getDataType());
		updateParameter.setDescription(updateForm.getDescription());
		updateParameter.setUpdateTime(new Date());
		
		try {
			((ParameterDAO)ServiceManager.getInstance().getService("com.taifook.adminportal.service.ParameterService"))
			                                           .update(updateParameter);
			//notify channel server the parameter update	
			request.setAttribute(Constants.RETURN_BACK_URL,"../queryparameter.do?classid="+updateForm.getClassid());
			
			new ClientSocketService().startSend(new SocketMessage(Constants.NOTIFY_PARAMETER,Constants.UPDATE_ACTION,updateParameter,new SynParameterCallBack()));
			
		} catch (SocketTransferException e) {
			log.error("UpdateParameterAction-executeAction:update Exception!");
			log.error(e.getMessage());		
			request.setAttribute(Constants.GLOBAL_ERROR,"update parameter to database success! but "+e.getMessage());			
			forward=Constants.FAILURE;
		}catch (Exception e) {
			log.error("UpdateParameterAction-executeAction:update Exception!");
			log.error(e.getMessage());
			request.setAttribute(Constants.GLOBAL_ERROR,"update parameter fail! "+e.getMessage());
			forward=Constants.FAILURE;
		}

		return mapping.findForward(forward);
	}

}
