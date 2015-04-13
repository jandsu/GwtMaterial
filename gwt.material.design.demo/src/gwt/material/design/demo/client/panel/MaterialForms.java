package gwt.material.design.demo.client.panel;

import gwt.material.design.client.ui.MaterialToast;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialForms extends Composite {

	private static MaterialFormsUiBinder uiBinder = GWT.create(MaterialFormsUiBinder.class);

	interface MaterialFormsUiBinder extends UiBinder<Widget, MaterialForms> {
	}
	

	public MaterialForms() {
		initWidget(uiBinder.createAndBindUi(this));
	}


	@UiHandler("lstOptions")
	void onChangeListBox(ChangeEvent e){
		MaterialToast.alert("SAmple");
	}
	
}
