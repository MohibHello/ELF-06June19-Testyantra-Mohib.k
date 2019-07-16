package com.tyss.assessment.lamda;

import java.util.function.Consumer;

import lombok.extern.java.Log;

@Log
public class DisplayContent {

	public static void main(String[] args) {

		MobileBean bean = new MobileBean(1, "sony", "sd4345");
		MobileBean bean2 = new MobileBean(2, "nokia", "mn4335");

		Consumer<MobileBean> consumer = (a) -> {
			log.info("Content of Object" + a.toString());
		};

		consumer.accept(bean);
		consumer.accept(bean2);

	}
}
