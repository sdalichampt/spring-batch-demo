package com.sopragroup.springbatchdemo.mapper;

import java.util.Locale;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindException;

import com.sopragroup.springbatchdemo.bo.Djia;

@Component("djiaFSMapper")
public class DjiaFSMapper implements FieldSetMapper<Djia> {

	{
		Locale.setDefault(Locale.US);
	}

	@Override
	public Djia mapFieldSet(FieldSet fieldSet) throws BindException {

		Djia djia = new Djia();

		djia.setDate(fieldSet.readDate(0, "dd-MMM-yy"));
		djia.setOpen(fieldSet.readFloat(1));
		djia.setHigh(fieldSet.readFloat(2));
		djia.setLow(fieldSet.readFloat(3));
		djia.setClose(fieldSet.readFloat(4));
		djia.setVolume(fieldSet.readLong(5));
		djia.setAdjclose(fieldSet.readFloat(6));

		return djia;
	}

}
