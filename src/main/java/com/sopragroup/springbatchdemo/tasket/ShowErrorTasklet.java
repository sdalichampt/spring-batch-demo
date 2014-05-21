package com.sopragroup.springbatchdemo.tasket;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.stereotype.Component;

@Component("showErrorTasklet")
public class ShowErrorTasklet implements Tasklet {

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {

		System.err.println("");
		System.err.println("");
		System.err.println("");
		System.err.println("");
		System.err.println("Le traitement Batch a planté.");
		System.err.println("");
		System.err.println("");
		System.err.println("");
		System.err.println("");

		return RepeatStatus.FINISHED;

	}

}
