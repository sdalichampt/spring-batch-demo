package com.sopragroup.springbatchdemo.tasket;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class FileDeleteTasklet implements Tasklet {

	private String fileName;

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {

		Files.delete(Paths.get(fileName));

		return RepeatStatus.FINISHED;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
