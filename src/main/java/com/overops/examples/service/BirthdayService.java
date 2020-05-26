package com.overops.examples.service;

import com.overops.examples.error.BirthdayException;
import com.overops.examples.utils.TakipiInvocationCounter;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;


@Service
public class BirthdayService extends AbstractEventService {

    @TakipiInvocationCounter
    @Override
    void fireEvent(boolean generateEvent) {

	System.out.println("BirthdayService::fireEvent!");

        try {
		Date date = new Date();
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("America/Denver"));
		cal.setTime(date);
		if (cal.get(Calendar.MONTH) == 4 && cal.get(Calendar.DAY_OF_MONTH) == 26) {
			throw new BirthdayException("Happy Birthday Dave!");
                }

        } catch (BirthdayException e) {
		// gloriously do nothing
        }


    }
}
