package com.sopragroup.springbatchdemo.processor;

import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.sopragroup.springbatchdemo.bo.Djia;

@Component("complexDjiaProcessor")
public class ComplexDjiaProcessor implements ItemProcessor<Djia, Djia> {

	/** Le contexte d'execution du step. */
	private ExecutionContext stepContext;

	@BeforeStep
	public void beforeStep(StepExecution pStepExecution) {
		stepContext = pStepExecution.getExecutionContext();
	}

	@Override
	public Djia process(Djia djia) throws Exception {

		if (stepContext.get("lastClose") != null) {
			float clotureDeLaVeille = Float.parseFloat(stepContext.getString("lastClose"));

			if (clotureDeLaVeille < djia.getClose()) {
				djia.setDirection("UP");
			} else {
				djia.setDirection("DOWN");
			}
		}

		stepContext.putString("lastClose", String.valueOf(djia.getClose()));

		return djia;
	}

}
