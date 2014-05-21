package com.sopragroup.springbatchdemo.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.sopragroup.springbatchdemo.bo.Djia;

@Component("simpleDjiaProcessor")
public class SimpleDjiaProcessor implements ItemProcessor<Djia, Djia> {

	@Override
	public Djia process(Djia djia) throws Exception {
		if (djia.getOpen() < djia.getClose()) {
			djia.setDirection("UP");
		} else {
			djia.setDirection("DOWN");
		}

		return djia;
	}

}
