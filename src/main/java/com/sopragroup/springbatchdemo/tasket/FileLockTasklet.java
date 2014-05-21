package com.sopragroup.springbatchdemo.tasket;

import java.io.File;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class FileLockTasklet implements Tasklet {

	private String fileName;

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {

		File file = new File(fileName);

		file.setReadable(false);

		return RepeatStatus.FINISHED;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
