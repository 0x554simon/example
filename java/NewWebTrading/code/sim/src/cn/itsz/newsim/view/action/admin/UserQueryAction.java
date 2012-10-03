package cn.itsz.newsim.view.action.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.stereotype.Controller;

import cn.itsz.newsim.common.Constants;
import cn.itsz.newsim.dto.UserProfileModel;
import cn.itsz.newsim.dto.request.UserProfileRequest;
import cn.itsz.newsim.dto.response.UserProfileResponse;
import cn.itsz.newsim.view.action.BaseAction;
import cn.itsz.newsim.view.form.RegForm;

@Controller("/nadmin/userQuery")
public class UserQueryAction extends BaseAction {
	
	private String M_PASSWORD="abcdefg1";
	@Override
	protected boolean isRequiredLogon() {
		return false;
	}

	@Override
	protected ActionForward executeAction(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		UserProfileRequest model = new UserProfileRequest();
		form2Model(request, form, model, response);
		UserProfileResponse userResponse = facade.enquireUserProfile(model.getLoginId());
		List<UserProfileModel> userList = userResponse.getUserProfiles();
		if (userList.size() > 0) {
			UserProfileModel user = userList.get(0);
			user.setPassWord(M_PASSWORD);
		}
		request.setAttribute("userResponse", userResponse);
		
		return mapping.findForward(Constants.Status.SUCCESS);
	}
	
	public static void form2Model(HttpServletRequest request,
			ActionForm form, UserProfileRequest destModel, HttpServletResponse response) {
		RegForm model = (RegForm)form;
		destModel.setLoginId(model.getLoginId());
	}
}