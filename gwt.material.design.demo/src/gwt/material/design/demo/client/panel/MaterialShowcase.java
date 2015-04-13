package gwt.material.design.demo.client.panel;

import gwt.material.design.demo.client.showcase.MaterialLogin;
import gwt.material.design.demo.client.showcase.MaterialParallax;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class MaterialShowcase extends Composite {

	private static MaterialShowcaseUiBinder uiBinder = GWT.create(MaterialShowcaseUiBinder.class);

	interface MaterialShowcaseUiBinder extends UiBinder<Widget, MaterialShowcase> {
	}

	public MaterialShowcase() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("btnLogin")
	void onLogin(ClickEvent e){
		RootPanel.get().clear();
		RootPanel.get().add(new MaterialLogin());
	}
	
	@UiHandler("btnParallax")
	void onParallax(ClickEvent e){
		RootPanel.get().clear();
		RootPanel.get().add(new MaterialParallax());
	}
	
}
