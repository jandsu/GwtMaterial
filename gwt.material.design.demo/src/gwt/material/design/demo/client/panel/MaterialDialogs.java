package gwt.material.design.demo.client.panel;

import gwt.material.design.client.ui.MaterialModal;
import gwt.material.design.client.ui.MaterialModal.TYPE;
import gwt.material.design.client.ui.MaterialToast;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MaterialDialogs extends Composite {

	private static MaterialDialogsUiBinder uiBinder = GWT.create(MaterialDialogsUiBinder.class);

	interface MaterialDialogsUiBinder extends UiBinder<Widget, MaterialDialogs> {
	}

	public MaterialDialogs() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	
	@UiHandler("btnToast")
	void onToast(ClickEvent e){
		MaterialToast.alert("I Love Material Design");
	}
	
	@UiHandler("btnModal")
	void onModal(ClickEvent e){
		MaterialModal.showModal(true, new ModalContent(), TYPE.DEFAULT);
	}
	
	@UiHandler("btnMoadalBottomSheets")
	void onModalBottom(ClickEvent e){
		MaterialModal.showModal(true, new ModalContent(), TYPE.BOTTOM_SHEET);
	}
	
	@UiHandler("btnModalFixFooter")
	void onModalFix(ClickEvent e){
		MaterialModal.showModal(true, new ModalContent(), TYPE.FIXED_FOOTER);
	}
}
