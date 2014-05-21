package com.sopragroup.springbatchdemo.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

@Component("consoleItemWriter")
public class ConsoleItemWriter implements ItemWriter<Object> {

	@Override
	public void write(List<? extends Object> items) throws Exception {
		for (Object item : items) {
			System.out.println(item.toString());
		}
	}

}
