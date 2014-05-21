package com.sopragroup.springbatchdemo.tasket;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.stereotype.Component;

@Component("fileCopyTasklet")
public class FileCopyTasklet implements Tasklet {

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {

		String fileName = "/tmp/DJIA-" + System.currentTimeMillis() + ".csv";

		Path fromFile = Paths.get(getClass().getResource("/DJIA.csv").toURI());
		Path toFile = Paths.get(fileName);

		Files.copy(fromFile, toFile, StandardCopyOption.COPY_ATTRIBUTES);

		ExecutionContext stepExecutionContext = chunkContext.getStepContext().getStepExecution().getExecutionContext();
		stepExecutionContext.put("fileName", fileName);


		return RepeatStatus.FINISHED;
	}

}
