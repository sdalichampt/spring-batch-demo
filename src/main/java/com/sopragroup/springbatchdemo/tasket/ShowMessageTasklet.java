package com.sopragroup.springbatchdemo.tasket;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.stereotype.Component;

@Component("showMessageTasklet")
public class ShowMessageTasklet implements Tasklet {

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {

		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Le traitement Batch est terminé.");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");

		return RepeatStatus.FINISHED;

	}

}
